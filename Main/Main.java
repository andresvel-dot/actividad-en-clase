import java.util.Scanner;

    public class Main {
  public static void main (String[] args) {
   
       Scanner leer = new Scanner (System.in);
    

      int edadUsuario= 18;
     
      String licencia;
   
     System.out.println("Digame la edad:");
      edadUsuario= leer.nextInt();

      System.out.println("Tiene licencia:");
         licencia = leer.next();


         if (edadUsuario >=18 || licencia == "si") {

          System.out.println("Es mayor de edad");

          }   

          else {

            System.out.println("No es mayor de edad");
            
            }

             if (licencia.equalsIgnoreCase("si || no")) {

          System.out.println("Apto para conducir");

          }

          else {

            System.out.println("No apto para conducir");
            
            }


     
      
                 
          leer.close();
         
  }

}
