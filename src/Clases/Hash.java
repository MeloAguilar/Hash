package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Hash {

    public static byte[] obtnerHash(byte[] informacion) {
        MessageDigest msd = null;
        try {
            msd = MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException e) {
            System.out.println("No existe el algoritmo");
        }
        msd.update(informacion);

        return msd.digest();
    }

    public static void imprimirHash(byte[] hash) {
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%x", b));
        }
        System.out.println(sb);
    }

    public static byte[] obtenerCadena(String cadena) {
        return cadena.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] leerFichero(String nombreFichero) {
        byte[] b = null;
        try {
            b = Files.readAllBytes(Path.of(nombreFichero));
        } catch (IOException e) {
            System.out.println("Fallo en la entrada");
        }
        return b;
    }


}
