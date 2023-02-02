import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 *
 * @author Damian Nogueiras
 * @version 0.1
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;

    private void EntradaSalida() {

    }

    ;

    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param msj    cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null, "Sale por un ventana " + msj);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }

    /**
     * Método para obtener numeros enteros por consola
     *
     * @param comentario mensaje al usuario
     * @return si es true: correcto si no false
     */
    public static Boolean entradaEnteros(String comentario) {
        Scanner cubrir = new Scanner(System.in);
        int numero = 0;
        try {
            System.out.println(comentario);
            numero = cubrir.nextInt();
            System.out.println("Has introducido el número " + numero);
            return true;
        } catch (Exception e) {
            System.out.println("Has introducido un caracter no numérico, BOBO");
            return false;
        }
    }

    /**
     * Método para obtener mensajes por consola
     *
     * @param comentario mensaje al usuario
     * @return esi es true: correcto si no false
     */
    public static Boolean entradaCadena(String comentario) {
        Scanner cubrir = new Scanner(System.in);
        String mensaje = "";
        try {
            System.out.println(comentario);
            mensaje = cubrir.nextLine();
            System.out.println("Has introducido '" + mensaje + "'");
            return true;
        } catch (Exception e) {
            System.out.println("Error al introducir el mensaje");
            return false;
        }
    }
}
