 
package javabasico;

import java.util.Scanner;


public class Excepciones {
    
    public void manejoerrores(){
        Scanner sc = new Scanner (System.in);
        
        try{//intentar
        System.out.print("Ingresar un numero: ");
        int num = sc.nextInt();  
        
        }catch(Exception e){
            System.out.println("Ocurrio un error "+ e.getMessage());
            
        }finally{//finalizar
            System.out.println("Este bloque se efecuta siempre ");
            sc.close();
        }
    }
    
}
