import java.util.Scanner;

class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        long nim;
        float nilai;

        System.out.print("Nama  :"); nama=input.nextLine();
        System.out.print("NIM   :"); nim=input.nextLong();
        System.out.print("Nilai :"); nilai=input.nextFloat();

        System.out.println("Nama anda adalah " + nama);
        System.out.println("NIM anda adalah " + nim);
        System.out.print("Nilai anda adalah " + nilai);

        input.close();
    }
}