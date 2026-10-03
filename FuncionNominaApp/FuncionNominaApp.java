import java.util.Scanner;

public class FuncionNominaApp {
    public static void main(String[] args) {

        Scanner andres= new Scanner (System.in);
    
    double valorHora, horasLaboradas, salarioantesDeducciones, salarioTotal, deduccionesSalario;
    double PORCENTAJEDEDEDUCCION = 0.04;

 System.out.println("¿Cual es el valor de la hora?");
 valorHora= andres.nextDouble();
 
 System.out.println("Cuantas horas laboradas");
 horasLaboradas = andres.nextDouble();

 salarioantesDeducciones= salarioBruto(valorHora, horasLaboradas);
 
 deduccionesSalario = deduccionSalud(salarioantesDeducciones, PORCENTAJEDEDEDUCCION);
 
 salarioTotal = salarioantesDeducciones - deduccionesSalario;

  System.out.println("--Colilla de pago--");
 System.out.println("El salario base es: $" + salarioantesDeducciones);
  System.out.println("Las deducciones por ley son:  $" + deduccionesSalario);
  System.out.println("Su salario a pagar es: $" + salarioTotal);

  andres.close();

  
    }

    public static Double salarioBruto (double valorHora, double horasLaboradas){
        return valorHora * horasLaboradas;

    }

    public static Double deduccionSalud (double salarioantesDeducciones, double PORCENTAJEDEDEDUCCION) {
        return salarioantesDeducciones * PORCENTAJEDEDEDUCCION;
    }
   
    public static void colillaPago (double salarioantesDeducciones, double deduccionesSalario, double salarioTotal)
    {
 System.out.println("--Colilla de pago--");
 System.out.println("El salario base es: $" + salarioantesDeducciones);
  System.out.println("Las deducciones por ley son:  $" + deduccionesSalario);
  System.out.println("Su salario a pagar es: $" + salarioTotal);


    }
    
    
    
}
