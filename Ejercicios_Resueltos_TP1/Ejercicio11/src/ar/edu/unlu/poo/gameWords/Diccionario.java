package ar.edu.unlu.poo.gameWords;

import java.util.ArrayList;

public class Diccionario {
    private ArrayList<String> palabrasValidas = new ArrayList<>();

    public  Diccionario(){
        palabrasValidas.add("auto");
        palabrasValidas.add("armario");
        palabrasValidas.add("auto");
        palabrasValidas.add("balon");
        palabrasValidas.add("burro");
        palabrasValidas.add("bota");
        palabrasValidas.add("carcel");
        palabrasValidas.add("caramelo");
        palabrasValidas.add("cartel");
        palabrasValidas.add("dado");
        palabrasValidas.add("dedo");
        palabrasValidas.add("diamante");
        palabrasValidas.add("elefante");
        palabrasValidas.add("electricidad");
        palabrasValidas.add("farol");
        palabrasValidas.add("foco");
        palabrasValidas.add("fuxia");
        palabrasValidas.add("gato");
        palabrasValidas.add("girasol");
        palabrasValidas.add("gusano");
        palabrasValidas.add("helado");
        palabrasValidas.add("helicoptero");
        palabrasValidas.add("isla");
        palabrasValidas.add("jarron");
        palabrasValidas.add("kiwi");
        palabrasValidas.add("lampara");
        palabrasValidas.add("losa");
        palabrasValidas.add("manzana");
        palabrasValidas.add("mesa");
        palabrasValidas.add("mural");
        palabrasValidas.add("nido");
        palabrasValidas.add("oso");
        palabrasValidas.add("ornamento");
        palabrasValidas.add("pala");
        palabrasValidas.add("pelota");
        palabrasValidas.add("queso");
        palabrasValidas.add("quimera");
        palabrasValidas.add("ramo");
        palabrasValidas.add("remo");
        palabrasValidas.add("saltar");
        palabrasValidas.add("seguridad");
        palabrasValidas.add("tambor");
        palabrasValidas.add("trueno");
        palabrasValidas.add("uva");
        palabrasValidas.add("violin");
        palabrasValidas.add("vuelo");
        palabrasValidas.add("Waterpolo");
        palabrasValidas.add("Washington");
        palabrasValidas.add("xilófono");
        palabrasValidas.add("yoyo");
        palabrasValidas.add("zumba");
    }

    public ArrayList<String> getPalabrasValidas() {
        return palabrasValidas;
    }

    public Boolean palabraValida(String palabra){
        return palabrasValidas.contains(palabra.toLowerCase());
    }

    public void cargarPalabra(String palabra){
        palabrasValidas.add(palabra);
    }
}
