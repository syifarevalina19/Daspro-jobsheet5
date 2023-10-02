import java.util.Scanner;

public class PemilihanPercobaan328 {
    public static void main(String[] args) {
       
        double angka1, angka2, hasil;
        char operator;

        Scanner input28 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input28.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input28.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input28.next().charAt(0);

        switch (operator) {
            case '+':
               hasil = angka1 + angka2;
               System.out.println(angka1 + " + " + angka2 + "=" + hasil);
               break;
            case '-':
               hasil = angka1 - angka2;
               System.out.println(angka1 + " - " + angka2 + "=" + hasil);
               break;
            case '*':
               hasil = angka1 * angka2;
               System.out.println(angka1 + " * " + angka2 + "=" + hasil);
               break;
             case '/':
               hasil = angka1 * angka2;
               System.out.println(angka1 + " / " + angka2 + "=" + hasil);
               break;

        }
    }
}
