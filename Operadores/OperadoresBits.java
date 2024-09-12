package Operadores;
import java.io.BufferedReader;
import java.io.IOException;
import Utilites.Lectura;


public class OperadoresBits{
    
    public int operadorAnd(int num1, int num2) {
        return num1 & num2 ;
    }

    public int operadorOr(int num1, int num2) {
        return num1 | num2;
    }

    public int operadorXor(int num1, int num2) {
        return num1 ^ num2;
    }

    public int operadorNot(int num1) {
        return ~num1;
    }

    public int moverIzquierda(int num1, int posicion) {
        return num1 << posicion;
    }

    public int moverDerecha(int num1, int posicion) {
        return num1 >> posicion;
    }


    public void menuBits(BufferedReader bIn)throws IOException{
        int num1;
        int num2; 
        System.out.println("1.Operador AND");
        System.out.println("2.Operador Or");
        System.out.println("3.Operador Xor");
        System.out.println("4.Operador Not");
        System.out.println("5.Mover izquierda");
        System.out.println("6.Mover derecha");
        int opcion = (int) Lectura.tecladoInt(bIn, "Ingrese la opción a realizar: ");
        
        switch (opcion) {
            case 1:
                num1 = Lectura.tecladoInt(bIn, "Ingresa el primer número: ");
                num2 = Lectura.tecladoInt(bIn, "Ingresa el segundo número: ");
                System.out.println("El resultado es: " + operadorAnd(num1, num2));                    
                break;
                
            case 2:
                
                num1 = Lectura.tecladoInt(bIn, "Ingresa el primer número: ");
                num2 = Lectura.tecladoInt(bIn, "Ingresa el segundo número: ");
                System.out.println("El resultado es: " + operadorOr(num1, num2));                
                break;
                
            case 3:
                
                num1 = Lectura.tecladoInt(bIn, "Ingresa el primer número: ");
                num2 = Lectura.tecladoInt(bIn, "Ingresa el segundo número: ");
                System.out.println("El resultado es: " + operadorXor(num1, num2)); 
                break;    
                
            case 4: 
                
                num1 = Lectura.tecladoInt(bIn, "Ingresa el número: "); 
                System.out.println("El resultado es:  " + operadorNot(num1));                
                break;
                    
            case 5: 
                num1 = Lectura.tecladoInt(bIn, "Ingresa el número: "); 
                num2 = Lectura.tecladoInt(bIn, "Ingresa la posición: "); 
                System.out.println("El resultado es: " + moverIzquierda(num1, num2)); 
                break;
            case 6:
                num1 = Lectura.tecladoInt(bIn, "Ingresa el número: "); 
                num2 = Lectura.tecladoInt(bIn, "Ingresa la posición: "); 
                System.out.println("El resultado es: " + moverDerecha(num1, num2)); 
                break;
                    
                                   
            default:
                System.out.println("Elección inválida. Por favor, inténtalo de nuevo.");
            }
        
    }



}