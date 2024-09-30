package Taller_calculadora;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ingresar numeros
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();

        //crear instancia de la calculadora

        Calculadora calculadora = new Calculadora(num1, num2);

        //operaciones

        System.out.println(" Selecione la operacion a realizar: ");
        System.out.println(" 1 Realizar suma");
        System.out.println(" 2 Realizar resta");
        System.out.println(" 3 Realizar multiplicacion");
        System.out.println(" 4 Realizar division");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado suma: " + calculadora.sumar());
                break;
            case 2:
                System.out.println("Resultado resta:  " + calculadora.restar());
                break;
            case 3:
                System.out.println("Resultado multiplicacion: " + calculadora.multiplicar());
                break;
            case 4:
                try {
                    System.out.println("Resultado division: " + calculadora.dividir());
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;

        }
    }
}
