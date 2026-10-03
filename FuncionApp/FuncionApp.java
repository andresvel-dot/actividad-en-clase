import java.util.Scanner;

public class FuncionApp {
    public static void main(String[] args) {

        Scanner andres= new Scanner (System.in);

        String usuario, contrasena;

        System.out.println("Ingrese el usuario");
        usuario= andres.next();
        System.out.println("Ingrese la contraseña");
        contrasena= andres.next();

        validarUsuario(usuario, contrasena);

        andres.close();

       }

    public static boolean validarUsuario(String usuario, String contrasena){
     String USUARIOREAL="admin"; 
     String CONTRASENA="12345";
     if (USUARIOREAL.equalsIgnoreCase(usuario) && CONTRASENA.equalsIgnoreCase(contrasena)) {
        System.out.println("login correcto");
        return true;
        
     } else {
        System.out.println("login inccorrecto");
        return false;
     }
    }
    
}
