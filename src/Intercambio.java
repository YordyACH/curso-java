import java.util.Scanner;
public class Intercambio {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = teclado.nextInt();
        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;
        System.out.println("ahora tu numero 1 es el segundo: "+numero1);
        System.out.println("ahora tu numero 2 es el primero: "+numero2);
        teclado.close();
    }
}
