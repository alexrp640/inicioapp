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
public class mostrarresultado {
    static void mostrarResultado(String frase){
        for(int i=0;i<letra.length;i++){
            if(contador[i]!=0){
                System.out.println(letra[i]+" se repite " + contador[i]);
            }
            
        }
    }
}
