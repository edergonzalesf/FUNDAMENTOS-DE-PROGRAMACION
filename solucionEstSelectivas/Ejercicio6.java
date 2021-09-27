package a_sesiones.b_selectivas.sinScanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        String sensor1 = "luz";
        String estadoSensor1 = "error";
        String sensor2 = "humo";
        String estadoSensor2 =  "ok";
        String sensor3 = "puerta";
        String estadoSensor3 = "desconectado";

        //Para probar método calcularPuntajeXSensor para sensor1, sensor2 y sensor3
        int puntaje1 = calcularPuntajeXSensor(sensor1,estadoSensor1);
        System.out.printf("El puntaje de severidad para el sensor 1 es: %d \n", puntaje1);
        int puntaje2 = calcularPuntajeXSensor(sensor2,estadoSensor2);
        System.out.printf("El puntaje de severidad para el sensor 2 es: %d \n", puntaje2);
        int puntaje3 = calcularPuntajeXSensor(sensor3,estadoSensor3);
        System.out.printf("El puntaje de severidad para el sensor 3 es: %d \n", puntaje3);

        //Para probar método calcularPuntajeTotal
        int puntajeTotal = calcularPuntajeTotal(sensor1,estadoSensor1,sensor2,estadoSensor2,sensor3,estadoSensor3);
        System.out.printf("El puntaje total es: %d \n", puntajeTotal);

        //Para probar método obtenerPersonaContactar
        String persona = obtenerPersonaContactar(sensor1,estadoSensor1,sensor2,estadoSensor2,sensor3,estadoSensor3);
        System.out.printf("La persona a contactar es: %s \n ", persona);

    }

    static int calcularPuntajeXSensor(String sensor, String estadoSensor){
        int puntaje = 0;
        if (sensor.equals("luz") && estadoSensor.equals("ok")){
            puntaje = 0;
        }else if(sensor.equals("luz") && estadoSensor.equals("error")){
            puntaje = 1;
        }else if(sensor.equals("luz") && estadoSensor.equals("desconectado")){
            puntaje = 3;
        }else if(sensor.equals("humo") && estadoSensor.equals("ok")){
            puntaje = 0;
        }else if(sensor.equals("humo") && estadoSensor.equals("error")){
            puntaje = 2;
        }else if(sensor.equals("humo") && estadoSensor.equals("desconectado")){
            puntaje = 3;
        }else if(sensor.equals("puerta") && estadoSensor.equals("ok")){
            puntaje = 0;
        }else if(sensor.equals("puerta") && estadoSensor.equals("error")){
            puntaje = 3;
        }else if(sensor.equals("puerta") && estadoSensor.equals("desconectado")){
            puntaje = 4;
        }
        return puntaje;
    }

    static int calcularPuntajeTotal(String sensor1, String estadoSensor1,
                                    String sensor2, String estadoSensor2,
                                    String sensor3, String estadoSensor3){

        int puntaje1 = calcularPuntajeXSensor(sensor1,estadoSensor1);
        int puntaje2 = calcularPuntajeXSensor(sensor2,estadoSensor2);
        int puntaje3 = calcularPuntajeXSensor(sensor3,estadoSensor3);
        return puntaje1+puntaje2+puntaje3;
    }

    static String obtenerPersonaContactar(String sensor1, String estadoSensor1,
                                          String sensor2, String estadoSensor2,
                                          String sensor3, String estadoSensor3) {

        int puntajeTotal = calcularPuntajeTotal(sensor1, estadoSensor1, sensor2, estadoSensor2, sensor3, estadoSensor3);
        String persona = "";
        if (puntajeTotal == 0) {
            persona = "Ninguno";
        } else if (puntajeTotal >= 1 && puntajeTotal <= 3) {
            persona = "Jefe de Operaciones";
        } else if (puntajeTotal >= 4 && puntajeTotal <= 7) {
            persona = "Supervisor Operaciones";
        } else if (puntajeTotal >= 8) {
            persona = "Gerente Operaciones";
        }
        return persona;
    }
}
