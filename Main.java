public class Main {

    public static void main(String[] args) {


        ControlVelocidad control = new ControlVelocidad(120);

        System.out.println("=== Estado inicial ===");
        System.out.println(control.obtenerEstado());

        System.out.println("\n=== Aceleraciones normales ===");
        control.acelerar(40);
        control.acelerar(30);

        System.out.println("\n=== Aceleración extrema (supera el límite) ===");
        control.acelerar(200);
        System.out.println(control.obtenerEstado());

        System.out.println("\n=== Frenados normales ===");
        control.frenar(50);
        control.frenar(20);

        System.out.println("\n=== Frenado extremo (por debajo de cero) ===");
        control.frenar(500);
        System.out.println(control.obtenerEstado());

        System.out.println("\n=== Valores inválidos ===");
        control.acelerar(-10);
        control.frenar(0);
        control.acelerar(Double.NaN);

        System.out.println("\n=== Estado final ===");
        System.out.println(control.obtenerEstado());
        System.out.println("Velocidad consultada con getter: " + control.getVelocidadActual() + " km/h");


    }
}
