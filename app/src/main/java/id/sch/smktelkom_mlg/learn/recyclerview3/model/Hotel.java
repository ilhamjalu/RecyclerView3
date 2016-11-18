package id.sch.smktelkom_mlg.learn.recyclerview3.model;

/**
 * Created by ILHAM on 05/11/2016.
 */
public class Hotel {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String lokasi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.lokasi = lokasi;
        this.detail = detail;
    }
}
