
import java.util.Scanner;

public class ActividadEnClase {
    public static void main(String[] args) {
        Scanner andres= new Scanner (System.in);

        
        int totalExcelente = 0;
        int totalRegular = 0;
        int TotalMalo = 0;
        double TerminarEncuestas = 0;
       int totalVotantes = 0;
       int opcion=0;
       double PORCENTAJE= 70.0;
      
       

      do {  System.out.println("--Encuesta--");
        System.out.println("Si desea votar por excelente, seleccione 1:");
        System.out.println("Si desea votar por regular, seleccione 2:");
        System.out.println("Si desea votar por malo, seleccione 3:");
        System.out.println( "Si ya finalizo, seleccione la opcion 4: ");
        opcion=andres.nextInt();

       

        switch (opcion) {
            case 1:
                System.out.println("Excelente");
                 totalExcelente++;
                break;

            case 2:
                System.out.println("Regular");
                totalRegular++;
                break;

            case 3:
                System.out.println("Malo");
                TotalMalo++;
                break;

            case 4:
                System.out.println("Se Terminaron las encuestas");
                break;
        
            default:
                System.out.println("Opcion invalida");
                break;
        }
       } while (opcion!=4) ;

         if (opcion==4 && totalExcelente >= PORCENTAJE) {

               TerminarEncuestas= totalExcelente * PORCENTAJE;
               System.out.println("Meta de satisfaccion alcanzada: " + TerminarEncuestas);
                System.out.println("los votos totales de excelentes son: " + totalExcelente);
                System.out.println("los votos totales regulares fueron: " + totalRegular);
                System.out.println("los votos totales malos fueron: " + TotalMalo);
                   System.out.println("FINALIZAN LAS ENCUESTAS");
         
            } else  {
            
                 System.out.println("No se registro ningun voto");
              } 
             
            



        andres.close();



       }

       }