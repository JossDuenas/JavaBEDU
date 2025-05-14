package pacienteregistro;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        paciente p1 = new paciente();

            System.out.print("Ingrese el nombre del paciente: ");
          p1.nombre = input.nextLine();

            System.out.print("Ingrese la edad del paciente: ");
            p1.edad = input.nextInt();
            input.nextLine(); // limpiar el buffer



            System.out.print("Ingrese el número de expediente: ");
            p1.numeroExpediente = input.nextLine();


            input.close();
            p1.mostrarInformacion();
        }
    }

