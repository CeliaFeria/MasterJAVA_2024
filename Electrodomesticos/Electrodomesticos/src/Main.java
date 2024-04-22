public class Main {
    public static void main(String[] args) {
        Lampara lampara = new Lampara();

        System.out.println("EL estado de la lampara es: " + lampara.obtenerEstado());
        lampara.apagar();

        Horno horno = new Horno();
        System.out.println("EL estado del horno es: " + horno.obtenerEstado());

        Television television = new Television();
        System.out.println("EL estado de la television es: " + television.obtenerEstado());


    }
}