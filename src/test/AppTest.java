package test;

// CorpoHumanoTest.java
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

import main.java.App;

public class AppTest {
    @Test
    public void testFila() {

        String input = "3\nRio de Janeiro\nSão Paulo\nBelo Horizonte";
        InputStream inContent = new ByteArrayInputStream(input.getBytes());

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
        Scanner scanner = new Scanner(inContent);
        App.fila(scanner);

        String resultadoEsperado = "Inicio->Rio de Janeiro São Paulo Belo Horizonte";

        assertEquals(resultadoEsperado, outContent.toString());

        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void testLista() {
        String input = "1\n2\n3\n4\n5\n";
        InputStream inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Scanner scanner = new Scanner(inContent);
        App.lista( scanner);

        String expectedOutput = "Lista Preenchida: 1 2 3 4 5";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
