//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Entrada {
       //Atributos
        String evento;
        double precio;
        // constructor
        public Entrada(String evento, double precio) {
            this.evento = evento;
            this.precio = precio;
        }
        // Método
        public void mostrarInformacion(){
            System.out.println("Producto: " + evento + " | Precio: $" + precio);
        }
    }

