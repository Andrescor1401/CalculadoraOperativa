package Operadores;
import Utilites.Lectura;
import java.io.BufferedReader;
import java.io.IOException;


public class IncrementalesAritmeticos {
    
    public double incremento(double num1) {
        return num1++;
    }
    public double decremento(double num1) {
        return num1--;
    }
    public double sumaComb(double num1, double num2) {
        return num1 += num2;
    }
    public double restaComb(double num1, double num2) {
        return num1 -= num2;
    } 
     public double multiplicacionComb(double num1, double num2) {
        return num1 *= num2;
    }
    public double divisionComb(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1/= num2;
    }
    public double moduloComb(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return num1%= num2;
    }
     public double ambosComb(double num1) {
        return num1 += num1++ + ++num1;
    }

    public void menuOpAritmetica(BufferedReader bIn)throws IOException{
        double num1;
        double num2;    
        System.out.println("Seleccione la acción a realizar");
        System.out.println("1.Suma combinada");
        System.out.println("2.Resta combinada");
        System.out.println("3.Multiplicación combinada");
        System.out.println("4.División combinada");
        System.out.println("5.Modulo combinado");
        System.out.println("6.Operadores incrementales y aritmeticos combinados");
        System.out.println("7.Incremento");
        System.out.println("8.Decremento"); 
        int opcion = (int) Lectura.tecladoInt(bIn, "Ingrese la acción a realizar");     
        switch (opcion) {
            case 1:
                System.out.println("Suma Combinada \nIngrese los dos dumeros que desea sumar usando operadores combinados");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número a sumar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a sumar: ");
                System.out.println("La suma de los numeros ingresados es: " + sumaComb(num1, num2));                    
                break;
                
            case 2:
                System.out.println("Resta combinada \nIngrese los dos dumeros que desea restar usando operadores combinados");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer número a restar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a restar: ");
                System.out.println("La diferencia de los numeros ingresados es: " + restaComb(num1, num2));                
                break;
                
            case 3:
                System.out.println("Multiplicacion Combinada \nIngrese los dos dumeros que desea multiplicar usando operadores combinados");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero a multiplicar: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número a multiplicar: ");
                System.out.println("El producto de los numeros ingresados es: " + multiplicacionComb(num1, num2)); 
                break;    
                
            case 4: 
                System.out.println("Division Combinada \nIngrese los dos dumeros que desea dividir usando operadores combinados");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero, el dividendo: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número, el divisor: ");
                
                try {
                System.out.println("la division de los numeros ingresados es: " + divisionComb(num1, num2));
                } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                }
                
                break;  
                    
            case 5: 
                System.out.println("Modulo combinado \nIngrese los dos dumeros que desea aplicar el operador modulo usando operadores combinados");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el primer numero: ");
                num2 = Lectura.tecladoDouble(bIn, "Ingresa el segundo número: ");
                System.out.println("El modulo de los numeros ingresados es: " + moduloComb(num1, num2)); 
                break;  
                
            case 6: 
                System.out.println("Operadores Incrementales y Aritmeticos Combinados "
                        + "\nIngrese los dos dumeros que desea aplicar la combinacion de operadores aritmeticos e incrementales combinados ");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el numero:para operar ");
                System.out.println("La combinacion de operadores de los numeros ingresados es: " + ambosComb(num1)); 
                break;  
            
             case 7: 
                System.out.println("Suma \nIngrese los dos dumeros que desea aplicar la combinacion de operadores aritmeticos usando operadores combinados ");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el numero que desea aumentar en una unidad: ");
                System.out.println("la division de los numeros ingresados es: " + incremento(num1)); 
                break;  
                
             case 8: 
                System.out.println("Suma \nIngrese los dos dumeros que desea aplicar la combinacion de operadores aritmeticos usando operadores combinados ");
                num1 = Lectura.tecladoDouble(bIn, "Ingresa el numero que desea disminuir en una unidad: ");
                System.out.println("la division de los numeros ingresados es: " + decremento(num1)); 
                break;  
                                   
            default:
                System.out.println("Elección inválida. Por favor, inténtalo de nuevo.");
            }
        }
    }