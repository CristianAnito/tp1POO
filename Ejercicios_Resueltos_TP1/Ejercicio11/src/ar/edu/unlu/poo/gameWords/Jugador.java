package ar.edu.unlu.poo.gameWords;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<String> listWord = new ArrayList<>();
    private int puntaje;
    private Diccionario diccionario = new Diccionario();

    public Jugador(){
        nombre = "Sin definir";
        puntaje = 0;
    }

    public Jugador(String name){
        nombre = name;
        puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListWord() {
        return listWord;
    }

    public void agregarPalabra(String palabra){
        if (diccionario.palabraValida(palabra)){
            listWord.add(palabra);
        }else {
            System.out.println("La palabra " + palabra + " es invalida.");
        }
    }

    public int calcularPuntaje(){
        int puntos = 0;
        int contadorLetra = 0;

        for (String palabra : listWord) {
            Palabra objPalabra = new Palabra(palabra);
            for (int i = 0; i < palabra.length(); i++){
                contadorLetra++;
            }
            puntos = contadorLetra + objPalabra.getValor();
        }
        return puntos;
    }
}
