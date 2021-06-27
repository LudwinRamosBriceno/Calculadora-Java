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

    }
}
