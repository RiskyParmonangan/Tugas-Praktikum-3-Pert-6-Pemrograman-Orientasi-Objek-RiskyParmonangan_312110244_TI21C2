package tugas.praktikum.pkg3.pert.pkg6;

public class Manusia {
    String nim;
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;
    String jurusan;
    
    public void cetakInfo(){
        System.out.println("NIM            : " + this.nim);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Umur            : " + this.umur);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Jurusan          : " + this.jurusan);
    }
}