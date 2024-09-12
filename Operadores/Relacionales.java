package Operadores;
import java.io.BufferedReader;
import java.io.IOException;

import Utilites.Lectura;

public class Relacionales {


    public void mayorMenorIgual(BufferedReader bIn)throws IOException{
        System.out.println("Vamos a conocer cual de los 2 números es mayor ");
        double x = (double) Lectura.tecladoDouble(bIn,"Ingrese el primer número: ");
        double y = (double) Lectura.tecladoDouble(bIn, "Ingrese el segundo número: ");
        if (x>y){
            System.out.println("El número " +x + " es mayor que el número " +y);    
        }else if(x==y){
            System.out.println("Los números son iguales");
        }
        else{
            System.out.println("El número " +y+ " es mayor que el número " +x);
        }
        

    }


    
}