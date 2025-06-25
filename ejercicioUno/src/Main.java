import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            Crea un funcion que sea capaz de encriptar y desencriptar texto utilizando el
            algoritmo de enctriptacion karaca

            -Cambiar la posicion de la palabra
            juan = nauj

            -Cada vocal se la sustituye por:
            a = 0;
            e = 1;
            i = 2;
            o = 3;
            u = 4;

            -Agregar al final de la palabra en aca
        */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el texto para su respectiva encriptacion: ");
        String textoIngresado = leer.nextLine();

        // Llamamos a la funcion para su correspodiente encriptación
        String textoInvertido = invertirTexto(textoIngresado.toLowerCase());
        String textoEncriptado = encriptar(textoInvertido);
        String textoDesencriptado = desencriptar(textoEncriptado);
        String textoNatural = desInvertir(textoDesencriptado);

        System.out.println("Texto Ingresado: " +textoIngresado);
        System.out.println("Texto Invertido: " +textoInvertido);
        System.out.println("Texto Encriptado: " +textoEncriptado);
        System.out.println("Texto Desencriptado: " +textoDesencriptado);
        System.out.println("Texto Des Invertido: " +textoNatural);
    }

    // Funcion para invertir el texto
    public static String invertirTexto(String textoIngresado){
        String textoInvertido = "";

        for (int i = textoIngresado.length() - 1; i >= 0 ; i--){
            char letra = textoIngresado.charAt(i);
            textoInvertido = textoInvertido + letra;
        }

        return textoInvertido;
    }

    // Funcion para la encriptacion
    public static String encriptar(String textoInvertido){

        String textoEncriptado = "";

        for (int i = 0; i < textoInvertido.length(); i++){
            char elemento = textoInvertido.charAt(i);

            if (elemento == 'a'){
                textoEncriptado = textoEncriptado + '0';
            } else if (elemento == 'e') {
                textoEncriptado = textoEncriptado + '1';
            }else if (elemento == 'i') {
                textoEncriptado = textoEncriptado + '2';
            }else if (elemento == 'o') {
                textoEncriptado = textoEncriptado + '3';
            }else if (elemento == 'u') {
                textoEncriptado = textoEncriptado + '4';
            }
            else{
                textoEncriptado = textoEncriptado + elemento;            }
        }
        return textoEncriptado + "aca";
    }

    // Funcion para desencriptar
    public static String desencriptar(String textoEncriptado){
        String textoDesencriptado = "";

        for (int i = 0; i < textoEncriptado.length(); i++){
            char elemento = textoEncriptado.charAt(i);

            if (elemento == '0'){
                textoDesencriptado = textoDesencriptado + 'a';
            } else if (elemento == '1') {
                textoDesencriptado = textoDesencriptado + 'e';
            }else if (elemento == '2') {
                textoDesencriptado = textoDesencriptado + 'i';
            }else if (elemento == '3') {
                textoDesencriptado = textoDesencriptado + 'o';
            }else if (elemento == '4') {
                textoDesencriptado = textoDesencriptado + 'u';
            }
            else{
                textoDesencriptado = textoDesencriptado + elemento;            }
        }

        return  textoDesencriptado;
    }

    // Funcion para desinvertir
    public static String desInvertir(String textoInvertido){

        String textoNatural = "";

        for (int i = textoInvertido.length() - 4; i>=0; i--){
            char elemento = textoInvertido.charAt(i);
            textoNatural = textoNatural + elemento;
        }

        return textoNatural;
    }
}