package tugas.praktikum.pkg3.pert.pkg6;

public class TugasPraktikum3Pert6 {
    public static void main(String[] args) {
          // Membuat Objek
        Mahasiswa Anton = new Mahasiswa();
        Mahasiswa Riko = new Mahasiswa();
        
        /* memanggil atribut dan memberi nilai */
        
        // Mahasiswa
        Anton.nim = "52751651";
        Anton.nama = "Anton";
        Anton.jenisKelamin = "Pria";
        Anton.umur = 23;
        Anton.alamat = "Babakan";
        Anton.jurusan = "Teknik Informatika";
        
        Anton.cetakInfo();
        
        Riko.nim = "51640540";
        Riko.nama = "Riko";
        Riko.jenisKelamin = "Pria";
        Riko.umur = 27;
        Riko.alamat = "Warbong";
        Riko.jurusan = "Hukum";
        
        Riko.cetakInfo();
    }
}