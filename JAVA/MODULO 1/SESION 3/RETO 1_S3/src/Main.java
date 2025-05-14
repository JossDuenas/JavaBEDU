

public class Main {
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("Ana Martinez", "UX123");
        Vuelo v1 = new Vuelo("UX123", "París", "14:30");

        if (v1.reservarAsiento(p1)) {
            System.out.println("Reserva realizada con éxito.");
        }
        System.out.println(v1.obtenerItinerario());

        v1.cancelarReserva();
        System.out.println(v1.obtenerItinerario());

        if (v1.reservarAsiento("Mario Gonzalez", "GT123")) {
            System.out.println(" Reserva realizada con éxito.");
        }
        System.out.println(v1.obtenerItinerario());
    }
}
