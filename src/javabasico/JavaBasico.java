package javabasico;

import java.util.Scanner;

 
public class JavaBasico {
     public void Principal(){
         System.out.println("Bienvenido Java Basico");
         System.out.println("1. Operadores logicos");
         System.out.println("2. Tipo de datos ");
         System.out.println("3. Estructuras de control");
         System.out.println("4. Exepciones ");
         System.out.println("5. Estructura de datos "); 
         System.out.println("--------------------------");
         System.out.println("ELIGE UNA OPCION: ");
         Scanner menu = new Scanner (System.in);
         int Data = menu.nextInt();
        
         switch (Data){
         case 1: 
            OperadoresLogicos o1 = new OperadoresLogicos();
            o1.operador();
            break;
         
            
           }
         switch (Data){
         case 2: 
           TipoDato tp = new TipoDato();
            tp.dato();
            break;
         
            
         }
         switch (Data){
         case 3: 
           EstructuraControl ec = new EstructuraControl();
           //ec.estructura();
           ec.tablamultiplicar(2000);
           break;
     }
        switch (Data){
         case 4: 
           Excepciones err = new Excepciones();
           err.manejoerrores();
           break;
     }
        switch (Data){
         case 5: 
           EstructuraDatos ed = new EstructuraDatos();
           //ed.array();
           //ed.list();
           ed.map();
           break;
     }
     }
     
 
     
    public static void main(String[] args) {
        Practica prac= new Practica();
       // prac.Menu ();
        JavaBasico jb = new JavaBasico ();
        jb.Principal();
       
    }
    
}
