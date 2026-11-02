/*
 * TP0 - Calculator
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0.exo.pkg3;
import java.util.Scanner;
/**
 *
 * @author nivaida
 */
public class TP0Exo3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Please enter the operator :\n"
               + "1) add\n"
               +"2) substract\n"
               +"3) multiply\n"
               + "4) divide \n"
                +"5) modulo");
       int operator = sc.nextInt();
       
       if (operator < 1 || operator > 5 ){
           System.out.println("Erreur vous devez choisir un operator entre 1 et 5");
           System.exit(0);
       }
       
       
       System.out.println("Entrer la première valeur ? ");
       int operande1 = sc.nextInt();
               
       System.out.println("Entrer la deuxieme valeur ?");
       int operande2 = sc.nextInt();
       
       int result = 0;
       
       switch(operator){
           case 1 : 
               result = operande1 + operande2;
               break;
           case 2 : 
               result = operande1 - operande2;
               break;
           case 3 : 
               result = operande1 * operande2;
               break;
           case 4 : 
               result = operande1 / operande2;
               break;
           case 5 :
               result = operande1 % operande2;
               break;
           default:
               System.out.println("Operateur invalid");               
       }
       System.out.println("Resultat "+ result);
       
               
               
               
               
       
       
    }
    
}
