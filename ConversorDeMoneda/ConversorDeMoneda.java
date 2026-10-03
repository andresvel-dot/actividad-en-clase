import java.util.Scanner;



public class ConversorDeMoneda {


     public static void main(String[] args) {
     Scanner andres= new  Scanner(System.in);
        
        double copUSD =0 ;
        double copEUR=0;
        int opcion;
        double resultadoCOPAUSD = 0;
        double resultadoCOPAEUR=0;
        double USD = 0.00025;
        double EUR= 0.00023;
       
    do {

        System.out.println("---CONVERSOR---");
        System.out.println("Si desea conertir COP a USD, seleccione 1: ");
        System.out.println("Si desea conertir COP a EUR, seleccione 2: ");
        System.out.println("Si desea salir seleccione 3: ");
        opcion=andres.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el valor en COP" );
                copUSD=andres.nextDouble();
                resultadoCOPAUSD= convertirAUSD(copUSD, USD);
                System.out.println("--CONVERTIDO--");
                System.out.println("Los pesos colombianos convertidos a USD son: " + resultadoCOPAUSD + " USD ");
               
                break;

            case 2: 
                  System.out.println("Ingrese el valor en COP");
                  copEUR=andres.nextDouble();
                  resultadoCOPAEUR= convertirAEUR(copEUR, EUR);
                  System.out.println("--CONVERTIDO--");
                  System.out.println("Los pesos colombianos a EUR son: " + resultadoCOPAEUR + " EUR ");
        
                break;

                
            case 3: 
                
                System.out.println("Ha salido...");
                break;
        
        
            default:
                System.out.println("Opcion invalida");
                break;
             }

        } while (opcion !=3);
  
            
            andres.close();
   
      }



    public static Double convertirAUSD (double copUSD, double USD){
        return copUSD * USD;
    }

      public static Double convertirAEUR (double copEUR, double EUR ){
        return copEUR * EUR;
    }

    

    
    
}
