public class Horno extends Electrodomestico{
    private int temperatura;
    private int temporizador;

    public Horno() {
        super(true);
        this.temperatura = 200;
        this.temporizador = 20;
    }

    public void cambiarTemperatura(int nuevaT) {
        if (nuevaT >= 0 && nuevaT <= 280) {
            temperatura = nuevaT;
            System.out.println("Nueva temperatura ajustada a " + temperatura);
        } else {
            System.out.println("Temperatura inválida. Debe estar entre 0 y 280.");
        }
    }

    public void cambiarTemporizador(int nuevoTiempo) {
        temporizador = nuevoTiempo;
        System.out.printf("El temporizador tiene %d minutos", temporizador);
    }

    public String obtenerEstado() {
        return "Horno " +(this.isEncendido() ? "encendido" : "apagado") +
                ", Temperatura: " + temperatura + ", Tiempo en minutos: " + temporizador;
    }
}
