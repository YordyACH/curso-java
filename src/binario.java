import java.util.Scanner;
public class binario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce tu codigo binario de 4 digitos");
        int binario = teclado.nextInt();
        int d4 = binario % 10; //obtengo el primer numero
        int resto = binario / 10; //quedan los 3 numeros
        int d3 = resto % 10; //obtengo el segundo
        resto = resto / 10; //quedan 2
        int d2 = resto % 10; //obtengo el 3ro
        int d1 = resto / 10; //obtengo el 4to
        int calculo = ((d1 * 8) + (d2 * 4) + (d3 * 2) + (d4 * 1));
        System.out.println("tu codigo binario es "+calculo);
        teclado.close();
    }
}
