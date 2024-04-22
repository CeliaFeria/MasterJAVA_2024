//clase padre
public class Electrodomestico {
    private boolean encendido; // Indica si está encendida o apagada

    public void encender() {
        encendido = true;
        System.out.println("Electrodomestico encendido.");
    }

    // Método para apagar el electrodomestico
    public void apagar() {
        encendido = false;
        System.out.println("Electrodomestico apagado.");
    }

    public Electrodomestico(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
