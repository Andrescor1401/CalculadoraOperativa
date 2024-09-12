package Operadores;

import Utilites.Lectura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class PrioridadOperadores{
    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));
    
        public void prioridadOps() throws IOException {
        try {
            System.out.println("Realizacion de  ");
            double num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero: ");
            double num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo numero: ");
            double num3 = Lectura.tecladoDouble(bIn, "Ingresa el tercer número: ");
            double num4 = Lectura.tecladoDouble(bIn, "Ingresa el cuarto número: ");
            double num5 = Lectura.tecladoDouble(bIn, "Ingresa el quinto número: ");
                if (num5 == 0) {
                throw new ArithmeticException("División por cero no permitida");}
            
            System.out.println("Resultado de num1 + num2 * num3 - num4 / num5, este sin agrupaciones: " + (num1 + num2 * num3  - num4 / num5));
            System.out.println("Resultado con agrupaciones (num1 + num2) * (num3 - num4) / num5 : " + ((num1 + num2) * num3 - num4 / num5));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
