import ar.edu.unlu.poo.gameWords.Jugador;

/*
Debemos resolver una pequeña parte de un juego donde cada jugador puede formar palabras, y cada palabra tendrá un puntaje.
Por el momento, el puntaje de una palabra va a estar dado por:

•	la cantidad de letras de la palabra y
•	las letras k, z, x, y, w, q suman un punto más.

El puntaje de cada jugador se determina en base a las palabras que pudo “formar”, pero para que esa palabra sea válida tiene que existir en un diccionario.
Se requiere poder agregar nuevas palabras a cada jugador, siempre y cuando éstas sean válidas. Finalmente, debo poder obtener el puntaje total de cada jugador
y poder determinar cuál es el jugador con el puntaje más alto.

Objetivos:
1.	Encontrar los objetos que participan del problema.
2.	Definir asociaciones entre los objetos y comportamiento de cada uno.
3.	Desarrollar una clase que cree 2 jugadores. Luego, asignarles palabras a cada uno y, finalmente, determinar cuál es el ganador.

 */
public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Cristian");
        Jugador jugador2 = new Jugador("Belen");

        jugador1.agregarPalabra("auto");
        jugador1.agregarPalabra("electricidad");
        jugador1.agregarPalabra("yoyo");

        jugador2.agregarPalabra("helicoptero");
        jugador2.agregarPalabra("xilófono");
        //jugador2.agregarPalabra("fdmslkf");


        int puntajeJugador1 = jugador1.calcularPuntaje();
        int puntajeJugador2 = jugador2.calcularPuntaje();

        if (puntajeJugador1 > puntajeJugador2){
            System.out.println("El jugador " + jugador1.getNombre() + " es el ganador, obteniendo " + puntajeJugador1 + " puntos ");
        }else {
            if (puntajeJugador2 > puntajeJugador1){
                System.out.println("El jugador " + jugador2.getNombre() + " es el ganador, obteniendo " + puntajeJugador2 + " puntos ");
            }else {
                System.out.println("Empate.");
            }
        }
    }
}