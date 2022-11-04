package tugas.praktikum.pkg3.pert.pkg6;

public class Mahasiswa extends Manusia{
    String Nama,JenisKelamin,Alamat,Jurusan;
    int Nim,Umur;

    //setter
    public void setNim(int Nim) {
        this.Nim = Nim;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    //getter
    public int getNim() {
        return this.Nim;
    }
    
    public String getNama() {
        return this.Nama;
    }

    public String getJenisKelamin() {
        return this.JenisKelamin;
    }

    public int getUmur() {
        return this.Umur;
    }
    
    public String getAlamat() {
        return this.Alamat;
    }
    
    public String getJurusan() {
        return this.Jurusan;
    }
}

