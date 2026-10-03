import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
       Scanner andres = new Scanner (System.in);
        int edadEstudiante;
        edadEstudiante= andres.nextInt();


        if (edadEstudiante < 1 && edadEstudiante > 1 && edadEstudiante < 3)  {
           
            System.out.println("Estudiante apto para párvulos");


            
 } else if (edadEstudiante < 1) 
    
 { 
      System.out.println("Estudiante no apto para párvulos");

    }
     else if (edadEstudiante > 1 ) {

        System.out.println("Estudiante no apto para guarderia");
        
     }

     else if (edadEstudiante < 3){

        System.out.println("Estudiante no apto para prescolar");
        }
    andres.close();
    }
}
