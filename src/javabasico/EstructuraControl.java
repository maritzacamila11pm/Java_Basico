
package javabasico;

public class EstructuraControl {

    private int edad;
    
    //constructor
    
    public void EstructuraControl(int edad){
    this.edad=edad;
    }
    
    //getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad =edad;
    }
    
    public void estructura(int edad ){
        //if ,else if, else, elif,
        if (this.edad >= 18){
            System.out.println("La persona es Mayor de edad");
        }else  if (edad >= 50){
            System.out.println("Es una persona adulta ");
        }else{
            System.out.println("La persona es menor de edad");
        }
        
  }
    public void tablamultiplicar(int numero){
        System.out.println("BIENVENIDO A LA TABLA DEL NUMERO: "+ numero);
         System.out.println("-------------------------------------");

        for (int i = 1 ;  i <= 10; i++){
        //System.out.println(+i + " x 100 = " + i * numero);
            
        System.out.println(i + " x " + numero + " = " +i * numero);
           
        }
     System.out.println("----------------------");
    }
}
