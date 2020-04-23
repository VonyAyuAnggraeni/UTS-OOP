/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author VONY
 */
public class Data {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;

    public Data() {
        nama = "";
        nim = "";
        prodi = "";
        alamat = "";
    }

    public Data(String nama, String nim, String prodi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    public void setnim(String nama) {
        this.nama = nama;
    }

    public void setnama(String nim) {
        this.nim = nim;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getnama() {
        return nama;
    }

    public String getnim() {
        return nim;
    }

    public String getprodi() {
        return prodi;
    }

    public String getalamat() {
        return alamat;
    }
}
