import java.util.Scanner;

class v {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan :"); double x = input.nextDouble();
        System.out.println("Masukkan :"); double y = input.nextDouble();

        System.out.println(x > y ? "Benar" : "Salah");

        input.close();
    }
}