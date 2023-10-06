package ar.edu.unlu.poo.ecuacionsg;

public class EcuacionSG {
    private double a;
    private double b;
    private double c;

    //Constructores, para cada escenario posible.
    public EcuacionSG(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }
    public EcuacionSG(double a){
        this.a = a;
        this.b = 1;
        this.c = 1;
    }

    public EcuacionSG(double a, double b){
        this.a = a;
        this.b = b;
        this.c = 1;
    }
    public EcuacionSG(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Comportamiento

    public double calcularDiscriminante(){
        return ((b * b) - 4 * a * c);
    }

    public void calcularRaices(){
        double discriminante = calcularDiscriminante();
        if (discriminante < 0){
            System.out.println("No hay raices reales");
        }else {
            if (discriminante == 0){
                System.out.println("Existe solo una raiz y es: " + (-b / 2 * a));
            }else {
                System.out.println("Raiz 1: " + ((-b + Math.sqrt(discriminante)) / 2 * a));
                System.out.println("Raiz 1: " + ((-b - Math.sqrt(discriminante)) / 2 * a));
            }
        }
    }

    public double calcularResultado(String valor1, String valor2){
        double x1 = Double.parseDouble(valor1);
        double x2 = Double.parseDouble(valor2);
        return  (a * (x1 * x1) + b * x2 + c);
    }
}
