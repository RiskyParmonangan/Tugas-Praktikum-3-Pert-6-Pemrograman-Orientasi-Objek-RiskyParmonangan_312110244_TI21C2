package tugas.praktikum.pkg3.pert.pkg6.oop.mengimplementasikan.java.code.diagram.pkgclass;

public class ManagerBeraksi {
    public static void main(String[] args) {
        // Object 1
        Manager Anton = new Manager();
         /* memanggil atribut dan memberi nilai*/
        Anton.setNama("Anton");
        Anton.setGajiPokok (8000000);
        Anton.setTunjangan (1000000);
        
        // untuk menampilkan hasil
        System.out.println("Nama        : " + Anton.getNama());
        System.out.println("Gaji Pokok  : " + Anton.getGajiPokok());
        System.out.println("Tunjangan   : " + Anton.getTunjangan());
        
   
        // Object 2
        Manager Riko = new Manager();
        /* memanggil atribut dan memberi nilai*/
        Riko.setNama ("Riko");
        Riko.setGajiPokok (7000000);
        Riko.setTunjangan (1500000);
        
        // untuk menampilkan hasil
        System.out.println("Nama        : " + Riko.getNama());
        System.out.println("Gaji Pokok  : " + Riko.getGajiPokok());
        System.out.println("Tunjangan   : " + Riko.getTunjangan());
    }
}