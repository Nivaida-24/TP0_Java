/*
 * TPO 0 - Exo 2 
 * Nivaida
 */
package exo2_nivaida;

import java.util.Scanner;
/**
 *
 * @author nivaida
 */
public class Exo2_Nivaida {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        //Declaration des variables 
        int nb;// nombre d'entiers a additionner
        int result;// resultat
        int ind; // indice
        result = 0;
        //nb = 5;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt();//On demande a sc de donner le prochain entier
        
        
        
        //Addition des nb premiers entiers 
        ind = 1 ;
        while(ind <= nb){
            result = result +ind;
            ind = ind + 1;
                    
        }
        
        //Affichage du resultat 
        System.out.println();
        System.out.println("La somme des"+ nb + "entiers est :"+result);
        
    }
    
}
