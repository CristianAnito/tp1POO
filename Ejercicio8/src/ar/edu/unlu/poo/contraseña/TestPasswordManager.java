package ar.edu.unlu.poo.contraseña;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPasswordManager {
    Scanner sc = new Scanner(System.in);
    @Test
    public void listaPassword(){
        ArrayList<Object> list = new ArrayList<>();
        PasswordManager pass = new PasswordManager("10");
        System.out.println("------Lista de contraseñas------");
        for (int i = 0; i < 10; i++){
            String password = pass.passwordRandom();
            list.add(password);
            System.out.println("<" + password + "> " + pass.passwordNivel(password));
        }

    }
}
