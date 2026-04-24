import java.util.Scanner;

public class StreamerStats {

    public static double calcularIngresosDiarios (double cuotaMes, int cantSubs) {
        double ingresosBrutos = cuotaMes * cantSubs;
        double IVA = ingresosBrutos * 0.21;
        double ingresosNetos = ingresosBrutos - IVA;

        return ingresosNetos;
    }

    public static void main(String[] args) {

        double cuotaMes, ingresosDiarios , ingresoFinal, totalIngresos;
        int cantSubs, acumLogros, dias, acumSubs;
        
        acumLogros = 0;
        totalIngresos= 0;
        acumSubs = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("+---------------------------------------------+");
        System.out.println("|   HOLA! Bienvenido a la calculadora de      |");
        System.out.println("|        Ganancias de Streaming :)            |");
        System.out.println("+---------------------------------------------+");

        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("| Cual es el valor de tu cuota mensual dentro de la plataforma?      |");
        System.out.println("+--------------------------------------------------------------------+");

        cuotaMes = scanner.nextDouble();

        System.out.println("+----------------------------------------------------------+");
        System.out.println("| Cuantos dias quieres registrar?                          |");
        System.out.println("+----------------------------------------------------------+");

        dias = scanner.nextInt();

        for ( int i = 1 ; i <= dias; i++ ) {

            System.out.println("+----------------------------------------------------------+");
            System.out.println("| Día: " + i + " ¿Cuántos suscriptores lograste hoy?               |");
            System.out.println("+----------------------------------------------------------+");

            cantSubs = scanner.nextInt();

            ingresosDiarios = calcularIngresosDiarios(cuotaMes, cantSubs);

            if (cantSubs >= 30) {
                ingresoFinal = ingresosDiarios * 1.05;
                acumLogros++; //contador
            }
            else {
                ingresoFinal = ingresosDiarios;
            }

            totalIngresos += ingresoFinal; //acumulador
            acumSubs += cantSubs;  // acumulador 
        }

        System.out.println("+-------------------------------------------+");
        System.out.println("|              RESUMEN FINAL                |");
        System.out.println("+-------------------------------------------+");
        System.out.println("Suscriptores totales: " + acumSubs);
        System.out.println("Días registrados: " + dias);
        System.out.println("Ganancia total: " + totalIngresos);
        System.out.println("Días con bono de 5%: " + acumLogros);
        System.out.println("---------------------------------------------");
        scanner.close();
    }
}