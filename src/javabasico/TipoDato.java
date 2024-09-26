
package javabasico;

public class TipoDato {
   public void dato(){
       String myString= "maritza";
       int myInteger=10;
       double myDouble = 0;
       short myShort = 20;
       boolean bo = true;
       Object on = "un objeto como una mesa es muy utilizado hoy en dia ";
       char as = 'a';

       System.out.println("Mi Nombre es tipo: " + ((Object)myString).getClass().getSimpleName());
       System.out.println("Mi Edad es tipo: " + ((Object)myInteger).getClass().getSimpleName());
       System.out.println("Mi Numero es tipo: " + ((Object)myDouble).getClass().getSimpleName());       
       System.out.println("MI Numero es tipo: " + ((Object)myShort).getClass().getSimpleName());      
       System.out.println("Mi Valor  es tipo: " + ((Object)bo).getClass().getSimpleName());
       System.out.println("Mi Objeto es tipo: " + ((Object)on).getClass().getSimpleName());
       System.out.println("Mi Letra es tipo: " + ((Object)as).getClass().getSimpleName());



 



   
   
   }
}
