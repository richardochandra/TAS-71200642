package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private static int nextNum;
    private String nama;
    private long harga;


    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }

    public Barang(String nama, int stok, long harga){
        this.nama=nama;
        this.stok=stok;
        this.harga=harga;
        String[] pisah = nama.split(" ");
        if (pisah[0].toLowerCase()=="keyboard"){
            kode= "KB00";
        }
        else if (pisah[0].toLowerCase()=="mouse"){
            kode= "MS00";
        }
        else if (pisah[0].toLowerCase()=="headset"){
            kode= "HS00";
        }
    }

    public Barang(String kode, int stok, String nama, long harga) {
        this.kode = kode;
        this.stok = stok;
        this.nama = nama;
        this.harga = harga;
    }
}
