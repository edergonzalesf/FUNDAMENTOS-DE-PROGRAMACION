package a_sesiones.b_selectivas.sinScanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Datos de prueba
        int tiempoServicio = 6;
        double ventas = 7700.0;

        //Para probar método calcularComision
        double comision = calcularComision(tiempoServicio,ventas);
        System.out.printf("La comisión es: %.2f \n ", comision);
    }

    static double calcularComision(int tiempoServicio, double ventas){
        double comision = 0.0;
        if (tiempoServicio >= 1  && tiempoServicio <= 4){
            if (ventas >= 1000  && ventas <= 2500){
                comision = ventas * 0.02;
            }else if(ventas >= 2501  && ventas <= 5000){
                comision = ventas * 0.03;
            }else if(ventas >= 5001  && ventas <= 10000){
                comision = ventas * 0.04;
            }else if(ventas > 15){
                comision = ventas * 0.05;
            }
        }else if(tiempoServicio >= 5  && tiempoServicio <= 10){
            if (ventas >= 1000  && ventas <= 2500){
                comision = ventas * 0.025;
            }else if(ventas >= 2501  && ventas <= 5000){
                comision = ventas * 0.035;
            }else if(ventas >= 5001  && ventas <= 10000){
                comision = ventas * 0.045;
            }else if(ventas > 15){
                comision = ventas * 0.055;
            }
        }else if(tiempoServicio >= 11  && tiempoServicio <= 15){
            if (ventas >= 1000  && ventas <= 2500){
                comision = ventas * 0.03;
            }else if(ventas >= 2501  && ventas <= 5000){
                comision = ventas * 0.04;
            }else if(ventas >= 5001  && ventas <= 10000){
                comision = ventas * 0.05;
            }else if(ventas > 15){
                comision = ventas * 0.06;
            }
        }else if(tiempoServicio > 15){
            if (ventas >= 1000  && ventas <= 2500){
                comision = ventas * 0.05;
            }else if(ventas >= 2501  && ventas <= 5000){
                comision = ventas * 0.06;
            }else if(ventas >= 5001  && ventas <= 10000){
                comision = ventas * 0.07;
            }else if(ventas > 15){
                comision = ventas * 0.08;
            }
        }
        return (1500 + comision);
    }
}
