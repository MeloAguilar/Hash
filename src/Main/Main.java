package Main;

import Clases.Hash;

import java.util.Scanner;

public class Main {
public static final String PEDIR_CADENA = "Escriba la cadena a representar como hash";
    public static final String PEDIR_RUTA = "Escriba la ruta de el fichero a representar como hash";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	Hash.imprimirHash(Hash.obtenerCadena(pedir(sc, PEDIR_CADENA)));

    Hash.imprimirHash(Hash.leerFichero(pedir(sc, PEDIR_RUTA)));
    }


    private static String pedir(Scanner sc,String petision){
        System.out.println(petision);
        return sc.nextLine();
    }
}
