package tugas.praktikum.pkg3.pert.pkg6.oop.mengimplementasikan.java.code.diagram.pkgclass;

public class ProgrammerBeraksi {
    public static void main(String[] args){
        
        // object 1
        Programmer Anton = new Programmer();
        /* memanggil atribut dan memberi nilai*/
        Anton.setNama ("Anton");
        Anton.setGajiPokok (9000000);
        Anton.setBonus (1000000);
        
        // untuk menampilkan hasil
        System.out.println("Nama        : " + Anton.getNama());
        System.out.println("Gaji Pokok  : " + Anton.getGajiPokok());
        System.out.println("Bonus       : " + Anton.getBonus());
        
        
        // object 2
        Programmer Riko = new Programmer();
        /* memanggil atribut dan memberi nilai*/
        Riko.setNama ("Riko");
        Riko.setGajiPokok (8500000);
        Riko.setBonus (800000);
        
        // untuk menampilkan hasil
        System.out.println("Nama        : " + Riko.getNama());
        System.out.println("Gaji Pokok  : " + Riko.getGajiPokok());
        System.out.println("Bonus       : " + Riko.getBonus());
       
    }
    
}