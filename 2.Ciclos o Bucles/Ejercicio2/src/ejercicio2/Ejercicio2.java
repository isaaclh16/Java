/*Ejercicio 2
Leer un numero e indicar si es positivo o negativo .
El proceso se repetira hasta que se introduzca 0 */
package ejercicio2;
import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
       int numero ;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        while(numero != 0){
            if (numero >0){
                System.out.println("El numero es positivo: " + numero);
            }
            else {
                System.out.println("El numero es negativo: " + numero);
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
        }
    }
}
