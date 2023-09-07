package ar.edu.unlu.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    public void getFecha(String fecha) throws ParseException {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
        try{
            Date fechaVarificar = dateFormat1.parse(fecha);
            System.out.println("La fecha es: " + dateFormat1.format(fechaVarificar));
        }catch (ParseException e){
            try {
                Date fechaVerificar = dateFormat2.parse(fecha);
                System.out.println("La fecha es: " + dateFormat2.format(fechaVerificar));
            }catch (ParseException i){
                System.out.println("El formato de la fecha no es valido.");
            }
        }
    }

    public Boolean estaEntre(String fecha1, String fecha2, String fecha3){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date pFecha = dateFormat.parse(fecha1);
            Date sFecha = dateFormat.parse(fecha2);
            Date tFecha = dateFormat.parse(fecha3);

            return (((pFecha.before(sFecha) && pFecha.after(tFecha)) || ((pFecha.after(sFecha) && pFecha.before(tFecha)))));
        }catch (ParseException e){
            System.out.println("Formato invalido.");
        }
        return false;
    }

    public Boolean esMayor(String fechaM1, String fechaM2){
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date pFecha = date.parse(fechaM1);
            Date sFecha = date.parse(fechaM2);

            return pFecha.after(sFecha);
        }catch (ParseException e){
            System.out.println("Formato invalido.");
        }
        return false;
    }

    public Boolean esMenor(String fecham1, String fecham2){
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date pFecha = date.parse(fecham1);
            Date sFecha = date.parse(fecham2);

            return pFecha.before(sFecha);
        }catch (ParseException e){
            System.out.println("Formato invalido.");
        }
        return false;
    }
}
