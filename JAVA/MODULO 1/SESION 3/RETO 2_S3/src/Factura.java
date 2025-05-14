import java.util.Optional;

    public class Factura {
        private double monto;
        private String descripcion;
        private Optional<String> rfc;

        public Factura(double monto, String descripcion, String rfc) {
            this.monto = monto;
            this.descripcion = descripcion;
            this.rfc = (rfc == null) ? Optional.empty() : Optional.of(rfc);
        }

        public String getResumen() {
            String rfcTexto = rfc.isPresent() ? rfc.get() : "[No proporcionado]";
            return "📄 Factura generada:\n" +
                    "Descripción: " + descripcion + "\n" +
                    "Monto: $" + monto + "\n" +
                    "RFC: " + rfcTexto + "\n";
        }
    }
