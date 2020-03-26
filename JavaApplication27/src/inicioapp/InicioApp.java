/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InicioApp {

    
     static char letra[];
     static int[] contador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        //frase = frase.replaceAll(" ","");

        letra  = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};
        contador = new int[letra.length];
        
        contarpalabras.contarpalabras(frase);
        mostrarresultado.mostrarResultado(frase);
    }
    
}
