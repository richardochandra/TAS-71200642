package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {
    private ArrayList arrBarang = new ArrayList<Barang>();
    private Barang barang;

    public void inputBarang(Barang barang){
    arrBarang.add(barang);

    }

    public void tampilDaftarBarang(){
        System.out.println("Kode Barang\tNamaBarang\tStok\tHarga");
        System.out.println(barang.getKode()+"\t"+barang.getNama()+"\t"+barang.getStok()+"\t"+ barang.getHarga());

    }

    public PointOfSales() {
        this.arrBarang = arrBarang;
    }

    public void checkout(HashMap<Barang,Integer> keranjang, long nominal){
        int jumlah = 0;
        keranjang.put(barang,jumlah);
        long tagihan =  barang.getHarga()*jumlah;
        long kembalian = nominal - tagihan;
        System.out.println("Total Tagihan : "+tagihan);
        System.out.println("Total Bayar : "+nominal);
        System.out.println("Total Kembalian : "+kembalian);
        barang.setStok(barang.getStok()-1);



    }
}
