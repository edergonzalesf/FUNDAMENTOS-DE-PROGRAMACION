package a_sesiones.b_selectivas.sinScanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Datos de prueba
        double sueldoBruto = 4000;
        double utilidad = 6000;

        double sueldoAnual = sueldoBruto * 14 + utilidad;
        double neto = sueldoAnual - 3600 * 7;

        double impuesto;

        if (neto < 0){
            impuesto = 0;
        }else {
            impuesto = neto*0.21;
        }
<<<<<<< HEAD
        System.out.printf("El impuesto final es: %.2f \n", impuesto);
        System.out.printf("Esto es una prueba con Inteligent");
=======
        System.out.printf("El impuesto es: %.2f \n", impuesto);
>>>>>>> 60671db249f98912a6d960db4633d7a06a82a3d1
    }
}
