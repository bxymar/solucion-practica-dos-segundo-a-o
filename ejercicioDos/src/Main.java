import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        /*
            Escribe un programa que, dado un número, compruebe y muestre si es primo, Fibonacci y par

            Ejemplo:

            Con el número 2, nos dirá: “2 es primo, Fibonacci y es par”
   	        Con el número 7, nos dirá: “7 es primo, no es Fibonacci y es impar”
         */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número para verificar");
        int numero = leer.nextInt();

        String mensaje = numero + ", ";

        // Primos
        if (esPrimo(numero)){
            mensaje = mensaje + "es primo, ";
        }else{
            mensaje = mensaje + "no es primo, ";
        }

        // Fibonnaci
        if (esFibonnaci(numero)){
            mensaje = mensaje + "Fibonacci ";
        }else{
            mensaje = mensaje + "no es Fibonacci ";
        }

        // Par
        if (esPar(numero)){
            mensaje = mensaje + "y es par";
        }else{
            mensaje = mensaje + "y es impar";
        }

        System.out.println(mensaje);
    }

    // Funcion para determinar si el numero es primo
    public static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }

        int divisores = 0;

        for (int i = 1; i <= numero; i++ ){
            if (numero % i == 0){
                divisores++;
            }
        }

        return divisores == 2;
    }

    // Funcion para determinar si el numero es fibonnaci
    public static boolean esFibonnaci(int numero){

        if (numero < 0){
            return false;
        }

        int a = 0;
        int b = 1;

        while (a <= numero){

            if (a == numero){
                return true;
            }

            int numeroTemporal = a + b;
            a = b;
            b = numeroTemporal;
        }

        return true;
    }

    // Funcion para determinar si un numero es par o impar
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}