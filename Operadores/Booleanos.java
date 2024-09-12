package Operadores;
import java.io.BufferedReader;
import java.io.IOException;

import Utilites.Lectura;
public class Booleanos {


    public void booleano(BufferedReader bIn) throws IOException{
        boolean x = (boolean) Lectura.tecladoBoolean(bIn, "Ingresa el primer valor booleano (true/false): ");
        boolean y = (boolean) Lectura.tecladoBoolean(bIn, "Ingresa el segundo valor booleano(true/false): ");

        System.out.println("¿Cuál operación booleana deseas realizar?: ");
        System.out.println("1. AND (&&)");
        System.out.println("2. OR (||)");
        System.out.println("3. NOT (!)");
        int opcion = (int) Lectura.tecladoInt(bIn, "Escoja la operación a realizar: ");

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la operación AND es: " +(x&&y));
                break;
            case 2:
                System.out.println("El resultado de la operación OR es: " +(x||y)); 
            case 3:
                System.out.println("El resultado de la operación NOT para " +x + "es: " +(!x));
                System.out.println("El resultado de la operación NOT para " +y + "es: " +(!y));       
        
               default:
               System.out.println("Opción no valida");
                break;
        }

    }
    
}
