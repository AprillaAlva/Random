public class Nilai {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String nama;
        String status="Tidak Lulus";
        long nim;
        int mtk,ipa,bhs;
        double rata,total;
        nama = "Aprilla Alva Rifki";
        nim = 2311016210003L;

        mtk = 55;
        ipa = 66;
        bhs = 77;
        total = mtk+ipa+bhs;
        rata = total/3;

        if (rata >= 60.0) {
            status= "Lulus";
        }

        System.out.println("Nama : " +nama);
        System.out.println("NIM  : " +nim);
        System.out.println();
        System.out.println("Nilai : ");
        System.out.println("---------------");
        System.out.println("Matematika : " +mtk);
        System.out.println("IPA        : " + ipa);
        System.out.println("Bahasa     : " +bhs);
        System.out.println("---------------");
        System.out.println("Nilai Total : " +rata);

        System.out.println("Status : " +status);
        // if (rata >= 60.0) {
          //  System.out.println("Status      : Lulus");
         //}
         //if (rata <=60.0) {

         //}
         //else System.out.println("Status      : Tidak Lulus");

    }
}
