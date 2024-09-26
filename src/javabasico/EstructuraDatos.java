package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.sort;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EstructuraDatos {
    public void array(){
        String nombre = "Pongo";
        Object[ ] datos = {"Maritza","Paola","Luis","Senati",11,false,23.00,'a'};
        //obtener la cantidad de datos
        int cantidad = datos.length;
        System.out.println("Cantidad de datos almacenados es: "+ cantidad);
        /*
        System.out.println(datos[0]);
        System.out.println(datos[1]);
        System.out.println(datos[2]);
        System.out.println(datos[3]);
        System.out.println(datos[4]);
        System.out.println(datos[6]);
        System.out.println(datos[7]);
        System.out.println(datos[8]);
        System.out.println(datos[5]);
        */


      for (int a = 0;a <= cantidad-1; a++ ){
        System.out.println(datos[a]);
         if (datos[a]== "Senati") {
            System.out.println("Se encontró la palabra: "+ datos[a]);
            break; 
            }

        /*
        para convertir en object
        for (int a = 0;a <= cantidad-1; a++ ){
        System.out.println(datos[a]);
         if (datos[a]== (Object) 11) {
                System.out.println("Se encontró la palabra: "+ datos[a]);
                break; 
        }
        */


        // itinerando usar est cont IF() si encuentra la palabra senati print consola se encontro la palabra senati
        
       /* for (int a = 0; a < datos.length; a++) {
            if (datos[a].equals("Senati")) {
                System.out.println("Se encontró la palabra 'Senati'");
                break; 
            }
            }*/ 
       datos[9]="otro dato";
    }
    }
    //LISTAS
    public void list(){
        List <String> nombres =new ArrayList<>();
        nombres.add("Luz");
        nombres.add("Maria");
        nombres.add("Luisa");
        nombres.add("Gabriela");
        
        
        List <String> nuevos =new ArrayList<>();
        nuevos.add("Jose");
        nuevos.add("Lucas");
        nuevos.add("Pedro");
        nuevos.add("Mark");
        
        
        //addall para agregar los nombres d euna segunda lista a la principal 
        nombres.addAll(nuevos);
        //cantidad de datos
        int cantidad= nombres.size();
        System.out.println("La cantidad de datos es: "+ cantidad);
        //obtener un dato de mi lista
        //nombres.get(0);
        System.out.println("el dato es: "+ nombres.get(7));
        //
        
        for (int i = 0;i <= nombres.size()-1; i++ ){
        System.out.println(nombres.get(i));
        if (nombres.get(i)== (Object) "Lucas") {
            System.out.println("Se encontro a: "+nombres.get(i));
        }
        //remover
            System.out.println("--------------------------");
        nombres.remove("Luz");
        //Encontrar datos
                    System.out.println("--------------------------");

        nombres.contains("Luisa");
        //Encontrar datos
                    System.out.println("--------------------------");

        nombres.indexOf("Gabriela");
        //el indice de los datos
                    System.out.println("--------------------------");

        Collections.sort(nombres);
        //revertir una lista
                    System.out.println("--------------------------");

        Collections.reverse(nombres);
        //Remplazar un dato
                    System.out.println("--------------------------");

        nombres.set(1, "Luz");
        //Limpiar toda la lista
        System.out.println("--------------------------");

        //nombres.clear();
        
        for (String a:nombres){
            System.out.println("El dato es: "+ a);
        }
        }  

    }
    
     //MAPS
    public void map(){
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Marta", 50);        
        edades.put("Ada", 12);        
        edades.put("Diego", 45);        
        edades.put("Rony", 76);        
        edades.put("Elias", 23);
        
        //Eliminar
        edades.remove("Elias");
        //Cantidad de datos
        edades.size();
        //For y if 
        for(String a : edades.keySet()){
        if (edades.get(a) >=18){
            System.out.println("Clave: "+ a + " Valor: " + edades.get(a)+" es mayor de edad");
        } else {
            System.out.println("Clave: "+ a + " Valor: " + edades.get(a)+" es menor de edad");

            }




        
        }}
}
