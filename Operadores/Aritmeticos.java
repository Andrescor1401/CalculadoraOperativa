package Operadores;
import Utilites.Lectura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aritmeticos {

    BufferedReader bIn = new BufferedReader(new InputStreamReader(System.in));

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1 / num2;
    }

    public double modulo(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1 % num2;
    }
    
    //Menu para aritmeticos
    
    
    public void menuOpAritmetica(BufferedReader bIn)throws IOException{
        double num1;
        double num2; 
        System.out.println("1. Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        System.out.println("5.Modulo");
        int opcion = (int) Lectura.tecladoInt(bIn, "Ingrese la opción a realizar: ");
        
        switch (opcion) {
            case 1:
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número a sumar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a sumar: ");
                System.out.println("La suma de los numeros ingresados es: " + suma(num1, num2));                    
                break;
                
            case 2:
                
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número a restar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a restar: ");
                System.out.println("La diferencia de los numeros ingresados es: " + resta(num1, num2));                
                break;
                
            case 3:
                
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero a multiplicar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a multiplicar: ");
                System.out.println("El producto de los numeros ingresados es: " + multiplicacion(num1, num2)); 
                break;    
                
            case 4: 
                
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero, el dividendo: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número, el divisor: ");
                
                try {
                System.out.println("la division de los numeros ingresados es: " + division(num1, num2));
                } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                }
                
                break;  
                    
            case 5: 
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número: ");
                System.out.println("la division de los numeros ingresados es: " + modulo(num1, num2)); 
                break;  
                                   
            default:
                System.out.println("Elección inválida. Por favor, inténtalo de nuevo.");
            }
        }
    }