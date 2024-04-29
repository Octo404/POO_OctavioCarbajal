package edu.octavio_carbajal.reto11;

import edu.octavio_carbajal.reto3.diccionario.ui.CLI;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchApp ();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}

public class MainTest {

    @Test(expected = Exception.class)
    public void testArchivoInexistente() {
        String nombreArchivo = "ruta/al/libro/inexistente.txt";
        Main.analizar(nombreArchivo);
        // Debe lanzar una excepción debido a que el archivo no existe
    }
}

public class MainTest {

    @Test
    public void testPalabrasImpares() {
        String nombreArchivo = "ruta/al/libro/impares.txt";
        Main.analizar(nombreArchivo);
        List<String> palabrasImpares = Main.getPalabrasImpares();
        assertTrue(palabrasImpares.contains("elephant")); // Verificar que la palabra "elephant" esté en la lista de palabras impares
    }
}

public class MainTest {

    @Test
    public void testPalabrasPares() {
        String nombreArchivo = "ruta/al/libro/pares.txt";
        Main.analizar(nombreArchivo);
        List<String> palabrasPares = Main.getPalabrasPares();
        assertTrue(palabrasPares.contains("cat")); // Verificar que la palabra "cat" esté en la lista de palabras pares
    }
}

public class MainTest {

    @Test(expected = Exception.class)
    public void testRutaIncorrecta() {
        String nombreArchivo = "ruta/incorrecta/al/libro.txt";
        Main.analizar(nombreArchivo);
        // Debe lanzar una excepción debido a que la ruta del archivo es incorrecta
    }
}

public class MainTest {

    @Test
    public void testPalabraMasLargaPermitida() {
        String nombreArchivo = "ruta/al/libro/largo_maximo.txt";
        Main.analizar(nombreArchivo);
        assertEquals("anticonstitucionalmente", Main.getPalabraMasLarga()); // Verificar la palabra más larga permitida
    }
}

public class MainTest {

    @Test(expected = Exception.class)
    public void testArchivoInexistente() {
        String nombreArchivo = "ruta/al/libro/inexistente.txt";
        Main.analizar(nombreArchivo);
        // Debe lanzar una excepción debido a que el archivo no existe
    }
}