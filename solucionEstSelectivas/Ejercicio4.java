package a_sesiones.b_selectivas.sinScanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Datos de prueba
        String tipoviaje = "Internacional";
        double kilometros = 27000.0;
        String tipocliente = "preferencial";
        String dia = "Martes";

        //Para probar método calcularBonificacion
        double factor1 = calcularBonificacion(tipoviaje,kilometros);
        System.out.printf("La primera bonificación es: %.2f \n", factor1);

        //Para probar método calcularOtraBonificacion
        double factor2 = calcularOtraBonificacion(tipocliente);
        System.out.printf("La segunda bonificación es: %.2f \n", factor2);

        //Para probar método calcularBonificacionDia
        double factor3 = calcularBonificacionDia(dia);
        System.out.printf("La tercera bonificación es: %.2f \n", factor3);

        //Para probar método calcularTotalKilometros
        double totalKilometros = calcularTotalKilometros(tipoviaje,kilometros,tipocliente,dia);
        System.out.printf("El total de kilometros es: %.2f \n ", totalKilometros);

    }

    static double calcularBonificacion(String tipoviaje, double kilometros){
        double factor = 0.0;
        switch (tipoviaje){
            case "Nacional":
                if (kilometros <= 10000){
                    factor = 10.61;
                }else if(kilometros > 10000 && kilometros <= 16000){
                    factor = 20.52;
                }else if(kilometros > 16000 && kilometros <= 18000){
                    factor = 30.43;
                }else if(kilometros>18000){
                    factor = 40.11;
                }
                break;
            case "Internacional":
                if (kilometros <= 25000){
                    factor = 45.34;
                }else if(kilometros > 25000 && kilometros <= 30000){
                    factor = 55.25;
                }else if(kilometros > 30000 && kilometros <= 45000){
                    factor = 65.16;
                }else if(kilometros>45000){
                    factor = 75.13;
                }
                break;
        }
        return factor;
    }

    static double calcularOtraBonificacion(String tipocliente){
        double factor = 0.0;
        if (tipocliente.equals("normal")){
            factor = 10.0;
        }else if(tipocliente.equals("preferencial")){
            factor = 12.0;
        }else if(tipocliente.equals("VIP")){
            factor = 20.0;
        }
        return factor;
    }

    static double calcularBonificacionDia(String dia){
        double factor = 0.0;
        switch (dia){
            case "Lunes":
                factor = 20.00;
                break;
            case "Martes":
                factor = 20.00;
                break;
            case "Miercoles":
                factor = 20.00;
                break;
            case "Jueves":
                factor = 15.00;
                break;
            case "Viernes":
                factor = 15.00;
                break;
            case "Sabado":
                factor = 10.00;
                break;
            case "Domingo":
                factor = 10.00;
                break;
        }
        return factor;
    }

    static double calcularTotalKilometros(String tipoviaje, double kilometros, String tipocliente, String dia){
        double totalKilometros = 0.0;
        double factor1 = calcularBonificacion(tipoviaje,kilometros)/100.0;
        double factor2 = calcularOtraBonificacion(tipocliente)/100.0;
        double factor3 = calcularBonificacionDia(dia)/100.0;

        double bonificacionTotal = kilometros * (factor1+factor2+factor3);
        totalKilometros = kilometros + bonificacionTotal;
        return totalKilometros;
    }
}
