package Main;

import Operaciones.Operaciones;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un ángulo en grados: ");
        double angulo_en_grados = sc.nextDouble();
        
        Operaciones op = new Operaciones();
        op.menu();
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println(op.cos(angulo_en_grados));
                break;
            case 2:
                System.out.println(op.sin(angulo_en_grados));
                break;
            case 3:
                System.out.println(op.tan(angulo_en_grados));
                break;
            case 4:
                System.out.println(op.arccos(angulo_en_grados));
                break;
            case 5:
                System.out.println(op.arcsin(angulo_en_grados));
                break;
            case 6:
                System.out.println(op.arctan(angulo_en_grados));
                break;
            case 7:
                System.out.println(op.cosh(angulo_en_grados));
                break;
            case 8:
                System.out.println(op.sinh(angulo_en_grados));
                break;
            case 9:
                System.out.println(op.tanh(angulo_en_grados));
                break;
            default:
                System.out.println("Error. Número fuera del rango establecido.");
                break;
        }
    }
}
