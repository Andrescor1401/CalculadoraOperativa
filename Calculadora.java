import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Operadores.*;
import Utilites.Lectura;



public class Calculadora {
    static Lectura l = new Lectura();
    static Relacionales r = new Relacionales();
    static Cadenas c = new Cadenas();
    static Booleanos b = new Booleanos();
    static Aritmeticos a = new Aritmeticos();
    static OperadoresBits op = new OperadoresBits();
    static IncrementalesAritmeticos incre = new IncrementalesAritmeticos();
    static PrioridadOperadores p = new PrioridadOperadores();
    

    public static void main(String[] args) {
        BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) );
        try
        {
            menuPrincipal(bIn);

        }
        catch(IOException e)
        {

        System.err.println("Ocurrio un erro de IO" + e);

        }
        catch(Exception e)
        {

        System.err.println("Ocurrio un error grave " + e);

        }
    }

    public static void menuPrincipal(BufferedReader bIn) throws IOException
    {
        System.out.println("Elija el operador a utilizar: ");
        System.out.println("1. Operadores relacionales");
        System.out.println("2. Operadores para cadenas y condicional");
        System.out.println("3. Operadores booleanos");
        System.out.println("4. Operadores aritmeticos");
        System.out.println("5. Operadores de bits");
        System.out.println("6. Operadores incrementales y aritmeticos combinados");
        System.out.println("7.Prioridad de operadores");
        System.out.println("8.Salir del programa");
        int opcion;
        do{
            opcion = Lectura.tecladoInt(bIn, "Ingrese la operación a realizar: ");
            switch (opcion) {
                case 1:
                    r.mayorMenorIgual(bIn);
                    regresarMenu(bIn);
                    break;
                case 2:
                    c.menu(bIn);
                    regresarMenu(bIn);
                    break;
                case 3:
                    b.booleano(bIn);
                    regresarMenu(bIn);
                    break;
                case 4:
                    a.menuOpAritmetica(bIn);
                    regresarMenu(bIn);
                    break;
                case 5:
                    op.menuBits(bIn);
                    regresarMenu(bIn);
                    break;
                case 6:
                    incre.menuOpAritmetica(bIn);
                    regresarMenu(bIn);
                    break;
                case 7:
                    p.prioridadOps();
                    regresarMenu(bIn);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida");
                }
        }while(opcion > 8);
            
        

    }

    public static void regresarMenu(BufferedReader bIn)throws IOException{
        System.out.println("¿Desea salir del programa?");
        System.out.println("1.Sí");
        System.out.println("2.No");
        int salir = (int) Lectura.tecladoInt(bIn, "Seleccione la acción a realizar: ");
        if(salir ==2){
            menuPrincipal(bIn);
        }
        else{
            System.out.println("Saliendo...");
        }
    }

    
}
