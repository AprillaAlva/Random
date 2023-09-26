import java.util.Scanner;

class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        long nim;
        

        System.out.print("Nama "); nama=input.nextLine();
        System.out.print("NIM "); nim=input.nextLong();

        System.out.println("Nama " +nama);
        System.out.println("NIM " +nim);

        input.close();
    }
}