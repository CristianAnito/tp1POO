package ar.edu.unlu.poo.contraseña;

import java.util.Random;

public class PasswordManager {
    private Integer longitud;
    private String password;

    public PasswordManager(){
        longitud = 8;
        password = passwordRandom();
    }

    public PasswordManager(String longitud){
        setLongitud(Integer.parseInt(longitud));
        password = passwordRandom();
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public String passwordRandom(){
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        //StringBuilder es una clase útil cuando necesitas construir o manipular cadenas de caracteres
        // de manera eficiente y mutable en Java.

        for (int i = 0; i < longitud; i++){
            char randomCaracter = caracteres.charAt(random.nextInt(caracteres.length()));
            //charAt es un método para acceder a un carácter específico dentro de una cadena (String)
            // en función de su posición (índice) en la cadena.
            //nextInt(n): Este método de la clase Random genera un número entero aleatorio en el
            // rango de 0 (incluido) hasta n (excluido)
            password.append(randomCaracter);
        }

        return password.toString();
    }

    public String passwordNivel(String password){
        int minusculas = 0;
        int mayusculas = 0;
        int numeros = 0;

        for (int i = 0; i < password.length(); i++){
            char caracter = password.charAt(i);

            if (Character.isUpperCase(caracter)){
                mayusculas++;
            }else {
                if (Character.isLowerCase(caracter)){
                    minusculas++;
                }else {
                    numeros++;
                }
            }
        }

        if (mayusculas > 2 && minusculas > 1 && numeros >= 2){
            return "- Fuerte";
        }else {
            return "- Debil";
        }
    }

    public String passwordRegenerate() {
        String nivel = " ";
        String password = null;

        while (!nivel.equals("- Fuerte")) {
            password = passwordRandom();
            nivel = passwordNivel(password);
        }

        return password;
    }
}
