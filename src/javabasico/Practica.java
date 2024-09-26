
package javabasico;

import java.util.Scanner;

public class Practica {
    //swich case 
    public void Menu (){
        System.out.println("--------MENU--------------");
        System.out.println("1.Desayuno: ");
        System.out.println("2. Almuerzo: ");
        System.out.println("3. Cena: ");
        System.out.println("4. Extras: ");
        System.out.println("5. Salir: ");
        System.out.println("--------------------------");
        System.out.println("Elige una opcion: ");

        Scanner menu = new Scanner (System.in);
        int Valor = menu.nextInt();
        
        ///CON SWITCH 
        
       switch (Valor){
        case 1: 
            System.out.println("Jugo de Papaya ");
            System.out.println("Caldo de Cabeza ");
            System.out.println("Lomo Saltado ");
            break;
        case 2:
            System.out.println("Estofado ");
            System.out.println("Ceviche");
             break;
        case 3 :
            System.out.println("Pollo a la brasa");
             break;
        case 4: 
            System.out.println("No tenemos extras ");
             break;
        case 5: 
            System.out.println("Gracias por visitarnos, vuelva pronto ");
             break;
        default:
            System.out.println("El numero ingresado no existe ");
            
        //CON IF Y ELSE IF 
            
       /* if (Valor == 1) {
            System.out.println("Jugo de Papaya");
            System.out.println("Caldo de Cabeza");
            System.out.println("Lomo Saltado");
        } else if (Valor == 2) {
            System.out.println("Estofado");
            System.out.println("Ceviche");
        } else if (Valor == 3) {
            System.out.println("Pollo a la brasa");
        } else if (Valor == 4) {
            System.out.println("No tenemos extras");
        } else if (Valor == 5) {
            System.out.println("Gracias por visitarnos, vuelva pronto");
        } else {
            System.out.println("Opción no válida");
        }if (Valor == 1) {
            System.out.println("Jugo de Papaya");
            System.out.println("Caldo de Cabeza");
            System.out.println("Lomo Saltado");
        } else if (Valor == 2) {
            System.out.println("Estofado");
            System.out.println("Ceviche");
        } else if (Valor == 3) {
            System.out.println("Pollo a la brasa");
        } else if (Valor == 4) {
            System.out.println("No tenemos extras");
        } else if (Valor == 5) {
            System.out.println("Gracias por visitarnos, vuelva pronto");
        } else {
            System.out.println
        */
            
            
    }
        } 
}
    

