import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit = lectura.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");

        lectura.close();
    }

}