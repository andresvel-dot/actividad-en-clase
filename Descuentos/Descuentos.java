import java.util.Scanner;

public class Descuentos {

    public static void main(String[] args) {
        
        Scanner andres= new Scanner (System.in);


        Double compra;
        

        System.out.println("Ingrese el valor de la compra total");
        compra= andres.nextDouble();

        if (compra>100000) {
            compra= compra - (compra * 0.10 );
             System.out.println("El valor de la compra mas el descuento seria: " + compra);
            
        } else  {
            System.out.println("Debes de pagar el total de la compra");
            
        }



        andres.close();
    }
    
}
