package ar.edu.unlu.poo.gameWords;

import java.util.ArrayList;
import java.util.List;

public class Palabra {
    private String texto;
    private int valor;

    private List<String> caracteresSuman = new ArrayList<>();

    public Palabra(String palabra){
        texto = palabra;
        caracteresSuman.add("k");
        caracteresSuman.add("z");
        caracteresSuman.add("x");
        caracteresSuman.add("y");
        caracteresSuman.add("w");
        caracteresSuman.add("q");
        valor = calcularValor();
    }

    public int getValor() {
        return valor;
    }

    public List<String> getCaracteresSuman() {
        return caracteresSuman;
    }

    private Integer calcularValor(){
        int valor = 0;
        for (int i = 0; i < texto.length(); i++){
            String caracterTexto = String.valueOf(texto.charAt(i));

            for (String caracter:
                 caracteresSuman) {
                if (caracterTexto.equals(caracter)){
                    valor++;
                }
            }
        }
        return valor;
    }
}
