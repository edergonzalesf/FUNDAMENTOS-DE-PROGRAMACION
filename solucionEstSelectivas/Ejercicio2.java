package a_sesiones.b_selectivas.sinScanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Datos de prueba
        double escrito = 95;
        double oral = 76;

        //Para probar método determinarNivel
        int nivel;
        nivel = determinarNivel(escrito,oral);
        System.out.println("El nivel es: " + nivel);

        //Para probar método determinarPrecio
        int precio;
        precio = determinarPrecio(escrito,oral);
        System.out.println("El precio a pagar es: " + precio);

    }

    static int determinarNivel(double escrito, double oral){
        int nivel = 0;
        if (escrito>95 && oral > 75){
            nivel = 3;
        }else if(escrito>95 && oral <= 75){
            nivel = 2;
        }else if(escrito<=95){
            nivel = 1;
        }
        return nivel;
    }

    static int determinarPrecio(double escrito, double oral){
        int nivel = determinarNivel(escrito,oral);
        int precio = 0;
        switch (nivel){
            case 3:
                precio = 400;
                break;
            case 2:
                precio = 250;
                break;
            case 1:
                precio = 150;
                break;
        }
        return precio;
    }
}
