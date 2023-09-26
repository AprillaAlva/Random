import java.util.Scanner;

class Coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        long nim;
        float a,b,c,nilai;
        double rata;

        System.out.print("Nama :"); nama=input.nextLine();
        System.out.print("NIM :"); nim=input.nextLong();
        System.out.print("Nilai Matkul 1 :"); a=input.nextFloat();
        System.out.print("Nilai Matkul 2 :"); b=input.nextFloat();
        System.out.print("Nilai Matkul 3 :"); c=input.nextFloat();

        System.out.println("===================================");

        System.out.println("Nama anda adalah " + nama);
        System.out.println("NIM anda adalah " + nim);
        System.out.println("Nilai Matkul 1 " + a);
        System.out.println("Nilai Matkul 2 " + b);
        System.out.println("Nilai Matkul 3 " + c);

        nilai = a+b+c;
        rata = nilai/3;
        System.out.println("Total nilai anda " + nilai);
        System.out.println("Rata Rata nilai anda adalah " + rata);

        input.close();
        
    }
}