package Operadores;
import java.io.IOException;
import java.io.BufferedReader; 
import Utilites.Lectura;
public class Cadenas {

    public void palabraMasLarga(BufferedReader bIn) throws IOException{
        String x = (String) Lectura.tecladoLinea(bIn, "Ingrese el primer texto: ");
        String y = (String) Lectura.tecladoLinea(bIn, "Ingrese el segundo texto: ");
        String leng = (x.length()>y.length())? "El texto 1 es más largo que el texto 2" : "El texto 2 es más largo que el texto 1";
        System.out.println(leng);
    }

    public void concatenar(BufferedReader bIn) throws IOException{
        String x = (String) Lectura.tecladoLinea(bIn, "Ingrese el primer texto: ");
        String y = (String) Lectura.tecladoLinea(bIn, "Ingrese el segundo texto: ");
        System.out.println("El texto concatenado es: " +x + " " + y);
    }
    
    public void menu(BufferedReader bIn)throws IOException{
        System.out.println("¿Cuál operación para la cadena deseas realizar? ");
        System.out.println("1. Concatenar 2 textos");
        System.out.println("2. Saber cual texto es más largo");
        int opcion = (int) Lectura.tecladoInt(bIn, "Escoja la opción a realizar: ");
        
        switch (opcion) {
            case 1:
                concatenar(bIn);        
                break;
            case 2:
                palabraMasLarga(bIn); 
                break;   
        
            default:
                System.out.println("Opción no valida");
                break;
        }

    }
}
