/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbab10;

/**
 *
 * @author Rizky
 */
// Interface InformasiKaryawan
public class Karyawan extends Identitas {
public String NomorPegawai;
public String Jabatan;
double Gaji;

// Setter
public void setNomorPegawai(String NomorPegawai) {
this.NomorPegawai = NomorPegawai;
}

public void setJabatan(String Jabatan) {
this.Jabatan = Jabatan;
}
public void setGaji(double Gaji) {
this.Gaji = Gaji;

}

// Getter
public String getNomorPegawai() {
return NomorPegawai;
}

public String getJabatan() {
return Jabatan;
}

public Double getGaji() {
return Gaji;
}
@Override
public String Nama() {
return "Karyawan: " + super.Nama();
}

@Override
public String nik() {
return "NIK Karyawan: " + super.nik();
}
@Override
public String infoLengkap() {
return "Info Lengkap dari Karyawan: " +
"\nNomor Pegawai: " + NomorPegawai +
"\nJabatan: " + Jabatan +
"\nGaji: " + Gaji;
    }
}


   



