import ar.edu.unlu.poo.contraseña.PasswordManager;

import java.util.Scanner;

/*
Se requiere diseñar un objeto que dando de parámetro una longitud determinada genera un password aleatorio. Por defecto,
la longitud será de 8, pero existe la posibilidad que se requiera una longitud más larga. En ambos casos, genera una
contraseña aleatoria con esa longitud automáticamente ante su creación. Además, se requiere saber si el password es fuerte.
Considere que una contraseña fuerte es aquella que tiene más de 2 mayúsculas, más de 1 minúscula y al menos dos números.
En caso de que la contraseña no sea fuerte, debe existir alguna forma de regenerarla y asegurarse de que el password sea fuerte.
En cualquier caso, debo poder obtener la contraseña y su longitud, y poder cambiar su longitud.

Objetivos:

1.	Definir estructura y comportamiento.
2.	Ahora, crear una clase que la use y que:
    1.	Crea una colección de Passwords con el tamaño que se indique por teclado.
    2.	Muestra todas las claves generadas y si es o no fuerte. Usa este simple formato:
        <la_contraseña> - Fuerte
        <la_contraseña> - Débil

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la contraseña (Predeterminado: Longitud = 8): ");
        String longitud = sc.nextLine();
        if (longitud.isEmpty()){
            PasswordManager pass = new PasswordManager();
            interactionPass(pass);
        }else {
            PasswordManager pass = new PasswordManager(longitud);
            interactionPass(pass);
        }
    }

    public static void interactionPass(PasswordManager pass){
        Scanner sc = new Scanner(System.in);
        String password = pass.getPassword();
        System.out.println("<" + password + "> " + pass.passwordNivel(password));

        if (pass.passwordNivel(password).equals("- Debil")){
            System.out.println("Contraseña debil, desea generar otra? y/n: ");
            String eleccion = sc.nextLine();
            if (eleccion.equals("y")){
                password = pass.passwordRegenerate();
                System.out.println("<" + password + "> " + pass.passwordNivel(password));
            }
        }

        int longitud = pass.getLongitud();
        System.out.println("Desea cambiar la longitud (Longitud actual: " + longitud + ")" + "y/n: ");
        String eleccion = sc.nextLine();
        if (eleccion.equals("y")){
            System.out.println("Ingrese la longitud: ");
            int size = sc.nextInt();
            pass.setLongitud(size);
            password = pass.passwordRandom();
            System.out.println("<" + password + "> " + pass.passwordNivel(password));
        }
    }

}