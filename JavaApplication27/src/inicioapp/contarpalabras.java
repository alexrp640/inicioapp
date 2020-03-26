/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import static inicioapp.InicioApp.contador;
import static inicioapp.InicioApp.letra;

/**
 *
 * @author Alex
 */
public class contarpalabras {
     static void contarpalabras(String frase) {
        int numPalabras = 1;
        boolean espaciosSeguidos = false;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {  
            if (frase.charAt(i) == ' ') {
                if(!espaciosSeguidos){
                 espaciosSeguidos = true;
                numPalabras++;
                }
            } else {
                espaciosSeguidos = false;
            }
            
        }
       System.out.println("Hay " + numPalabras + "  palabras");
       
        int numCaracteres = 0; 
        for (int i = 0; i < frase.length(); i++) {  
            if (frase.charAt(i) != ' ') {
                numCaracteres++;
                }
            }
        System.out.println("Hay " + numCaracteres + " letras");
            
        for (int i = 0; i < frase.length(); i++) {  
                if (frase.charAt(i) != ' ') {
                       for (int j = 0; j < letra.length; j++) {
                           if (frase.charAt(i) == letra[j]) {
                               contador[j]++;
                           }
                       }
                }
            }
        
        
        }
}
