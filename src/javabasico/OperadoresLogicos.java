
package javabasico;

public class OperadoresLogicos {
    public void operador (){
        boolean esVerdadero= true;
        boolean esFalso = false;
        //Operador and  
        boolean resultado = esVerdadero && esFalso;
        System.out.println("El resultado AND: "+ resultado);
       
        // Operador OR
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("El resultado OR: " + resultadoOr);

        // Operador NOT
        boolean resultadoVerdadero = !esVerdadero ;
        boolean resultadoFalso = !esFalso;
        System.out.println("El resultado NOT : " + resultadoVerdadero);
        System.out.println("El resultado NOT : " + resultadoFalso);
    }
}

    
    
    

