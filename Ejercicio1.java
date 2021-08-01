package Practico3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {


    Scanner input = new Scanner(System.in);

    bienvenida();

    System.out.println("Ingrese un número y le diremos cual es el doble");
    int num = input.nextInt();

    int doble = calcularDoble(num);
    System.out.println("El doble de 5, " + "es, " + doble);

    finalizar();

    }

    //Escribir un metodo que reciba un numero y retorn su doble

    public static int calcularDoble(int num){

        return num * 2;
    }

    public static void bienvenida(){
        System.out.println("Bienvenido al programa!!");
    }

    public static void finalizar(){
        System.out.println("El programa ha finalizado");
    }


}
