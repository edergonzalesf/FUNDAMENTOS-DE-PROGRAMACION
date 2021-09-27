package Trabajofinal;

public class Trabajofinal {

    public static void main(String[] args) {
        int volumen = 150;
        String tieneLicencia = "si";
        String tieneMedidor = "si";
        String tipoUso = "doméstico";

        double igv = 0.18;
        double factorAlcantarillado = 0.8;
        double precioAlcantarillado = 0.52;
        int Asignacion1 = 50;
        int Asignacion2 = 400;
        int Asignacion3 = 3000;
        int Asignacion4 = 2000;

    if (tieneLicencia.equals("si") && tieneMedidor.equals("si")){
        volumen = volumen;
        }else{
        volumen = switch (tipoUso) {
            case "doméstico" -> Asignacion1;
            case "comercial" -> Asignacion2;
            case "industrial" -> Asignacion3;
            case "estatal" -> Asignacion4;
            case "agrario" -> 0;
            default -> volumen;
        };
    }
        double montoAgua = obtenerCosSegunUso(volumen,tipoUso);
        System.out.printf("Monto por consumo de Agua: %.2f\n",montoAgua);
        double montoAlcantarillado = volumen*factorAlcantarillado*precioAlcantarillado;
        System.out.printf("Monto por servicio de alcantarillado: %.2f\n",montoAlcantarillado);
        double montoIGV = (montoAgua + montoAlcantarillado) * igv;
        System.out.printf("IGV: %.2f\n",montoIGV);
        double montoTOTAL = montoAgua + montoAlcantarillado + montoIGV;
        System.out.printf("MontoTOTAL: %.2f",montoTOTAL);
    }


    private static double obtenerCostoDomestico(int volumen) {
        double costo=0.0;
        for(int i=1; i<=volumen; i++){
            if (i>=1 && i<=29){
                costo = costo + 0.42;
            }else if (i>29){
                costo = costo + 1.56;
            }
        }
        return costo;
    }
    private static double obtenerCostoComercial(int volumen) {
        double costo=0.0;
        for(int i=1; i<=volumen; i++){
            if (i>=1 && i<=99){
                costo = costo + 1.56;
            }else if (i>99){
                costo = costo + 1.82;
            }
        }
        return costo;
    }
    private static double obtenerCostoIndustrial(int volumen) {
        double costo=0.0;
        for(int i=1; i<=volumen; i++){
            if (i>=1 && i<=399){
                costo = costo + 2.36;
            }else if (i>399){
                costo = costo + 2.76;
            }
        }
        return costo;
    }
    private static double obtenerCostoEstatal(int volumen) {
        double costo=0.0;
        for(int i=1; i<=volumen; i++){
            if (i>=1 && i<=1999){
                costo = costo + 1.56;
            }else if (i>1999){
                costo = costo + 1.82;
            }
        }
        return costo;
    }

    private static double obtenerCosSegunUso(int volumen,String tipoUso) {
        double costo = switch (tipoUso) {
            case "doméstico" -> obtenerCostoDomestico(volumen);
            case "comercial" -> obtenerCostoComercial(volumen);
            case "industrial" -> obtenerCostoIndustrial(volumen);
            case "estatal" -> obtenerCostoEstatal(volumen);
            default -> 0.0;
        };
        return costo;
    }
    }


