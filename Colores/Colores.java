

import java.util.Scanner;

public class Colores {

    public static void main(String[] args) {
        
        // 1. Quitamos las comillas de System.in
        Scanner andres = new Scanner(System.in);

        String color1 = "Rojo";
        String color2 = "Azul";
        String color3 = "Verde";
        String usuario;
        
        System.out.println("Ingrese el color:");
        System.out.println("Ingrese otro color");
        System.out.println("Ingrese el  ultimo color");
        usuario = andres.next();

        
        if (usuario.equalsIgnoreCase("Rojo")) {
            System.out.println("Entra");
        } else if (usuario.equalsIgnoreCase("Azul")) {
            System.out.println("Entra");
        } else if (usuario.equalsIgnoreCase("Verde")) {
            System.out.println("Entra");
        } else {
            System.out.println("No entra");
        }

        andres.close();
    }
}