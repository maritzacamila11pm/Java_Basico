package javabasico;

import java.util.ArrayList;
import java.util.List;


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
        for (int i = 0;i <= nombres.size()-1; i+=1 ){
        System.out.println(nombres.get(i));
        if (nombres.get(i)== (Object) "Lucas") {
            System.out.println("Se encontró la palabra: "+nombres.get(i));
        }
        }  
    }
     
    public void map(){
    }
}
