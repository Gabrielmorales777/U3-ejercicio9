public class ControlVelocidad {


    private double velocidadActual;
    private final double velocidadMaximaPermitida;


    public ControlVelocidad(double velocidadMaximaPermitida) {
        if (Double.isNaN(velocidadMaximaPermitida) || Double.isInfinite(velocidadMaximaPermitida)
                || velocidadMaximaPermitida <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser un número mayor a 0.");
        }
        this.velocidadActual = 0.0;
        this.velocidadMaximaPermitida = velocidadMaximaPermitida;
    }


    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getVelocidadMaximaPermitida() {
        return velocidadMaximaPermitida;
    }


    public boolean acelerar(double incremento) {
        if (!esValorValido(incremento)) {
            System.out.println("Error: el incremento debe ser un número mayor a 0 (se ingresó "
                    + incremento + ").");
            return false;
        }
        double nuevaVelocidad = velocidadActual + incremento;
        if (nuevaVelocidad > velocidadMaximaPermitida) {
            velocidadActual = velocidadMaximaPermitida;
            System.out.println("Límite alcanzado: la velocidad se limita a "
                    + velocidadMaximaPermitida + " km/h.");
        } else {
            velocidadActual = nuevaVelocidad;
            System.out.println("Acelerando: +" + incremento + " km/h. Velocidad actual: "
                    + velocidadActual + " km/h.");
        }
        return true;
    }

    public boolean frenar(double decremento) {
        if (!esValorValido(decremento)) {
            System.out.println("Error: el decremento debe ser un número mayor a 0 (se ingresó "
                    + decremento + ").");
            return false;
        }
        double nuevaVelocidad = velocidadActual - decremento;
        if (nuevaVelocidad < 0) {
            velocidadActual = 0.0;
            System.out.println("Vehículo detenido: la velocidad no puede ser menor a 0 km/h.");
        } else {
            velocidadActual = nuevaVelocidad;
            System.out.println("Frenando: -" + decremento + " km/h. Velocidad actual: "
                    + velocidadActual + " km/h.");
        }
        return true;
    }

    private boolean esValorValido(double valor) {
        return !Double.isNaN(valor) && !Double.isInfinite(valor) && valor > 0;
    }

    public String obtenerEstado() {
        return "Velocidad actual: " + velocidadActual + " km/h | Máxima permitida: "
                + velocidadMaximaPermitida + " km/h";
    }
}