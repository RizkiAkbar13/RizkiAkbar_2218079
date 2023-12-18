/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbab10;

/**
 *
 * @author Rizky
 */
public class Identitas {
    String Nama, Nik, Tanggallahir, JenisKelamin, Umur, Statuskawin, Agama, Pekerjaan, Alamat;
// Overloading constructor
    public Identitas() {
        this.Nama = "Muhammad Rizki Akbar";
        this.Nik = "2218079";
    }
    
    public Identitas(String Nama, String Nik) {
       this.Nama = Nama;
       this.Nik = Nik;
    }
   void informasiData (){
       this.Nama = "Rizki Akbar";
       this.Nik = "2218079";
   }

    
    // Setter
    public void setDataNama(String Nama) {
        this.Nama = Nama;
    }

    public void setDataNik(String Nik) {
        this.Nik = Nik;
    }

    public void setDataTanggallahir(String Tanggallahir) {
        this.Tanggallahir = Tanggallahir;
    }

    public void setDataJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setDataUmur(String Umur) {
        this.Umur = Umur;
    }

    public void setDataStatuskawin(String Statuskawin) {
        this.Statuskawin = Statuskawin;
    }

    public void setDataAgama(String Agama) {
        this.Agama = Agama;
    }

    public void setDataPekerjaan(String Pekerjaan) {
        this.Pekerjaan = Pekerjaan;
    }

    public void setDataAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    // Getter
    public String getDataNama() {
        return Nama;
    }

    public String getDataNik() {
        return Nik;
    }

    public String getDataTanggallahir() {
        return Tanggallahir;
    }

    public String getDataJenisKelamin() {
        return JenisKelamin;
    }

    public String getDataUmur() {
        return Umur;
    }

    public String getDataStatuskawin() {
        return Statuskawin;
    }

    public String getDataAgama() {
        return Agama;
    }

    public String getDataPekerjaan() {
        return Pekerjaan;
    }

    public String getDataAlamat() {
        return Alamat;
    }
    
    
   public String Nama(){
       return Nama;
       
   }
   public String nik(){
       return Nik;
   }  
  // polimorrfisme 
 @Override
    public String toString() {
        return "Identitas: " +
                "\nNama: " + Nama +
                "\nNIK: " + Nik;
    }
    public String infoLengkap() {
        return "Info DATA";
    }
}


