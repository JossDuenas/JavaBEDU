public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado = null;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

    public void cancelarReserva() {
        if (asientoReservado != null) {
            System.out.println("❌ Cancelando reserva...");
            asientoReservado = null;
        } else {
            System.out.println("Cancelación fallida: no hay reserva actual.");
        }
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null)
                ? asientoReservado.getNombre()
                : "[Sin reserva]";
        return "\n✈️ Itinerario del vuelo:\n" +
                "Código: " + codigoVuelo + "\n" +
                "Destino: " + destino + "\n" +
                "Salida: " + horaSalida + "\n" +
                "Pasajero: " + pasajeroInfo + "\n";
    }
}

