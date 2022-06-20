package com.rplbo.uasprojectpos;

import java.util.ArrayList;
import java.util.HashMap;

public class PointOfSales {
    private ArrayList<Barang> arrBarang = new ArrayList<Barang>();

    public void inputBarang(Barang barang){
    arrBarang.add(barang);

    }

    public void tampilDaftarBarang(){
        System.out.println("Kode Barang\t\tNamaBarang\t\t\t\tStok\tHarga");
        for (Barang i : arrBarang) {
            System.out.println(i.getKode()+"\t\t\t"+i.getNama()+"\t"+i.getStok()+"\t\t"+ i.getHarga());
        }


    }

    public PointOfSales() {
        this.arrBarang = arrBarang;
    }

    public void checkout(HashMap<Barang,Integer> keranjang, long nominal){
        long tagihan=0;
        long kembalian=0;
        for (Barang i : keranjang.keySet()) {
            tagihan+= i.getHarga() * keranjang.get(i);
            kembalian = nominal - tagihan;
            i.setStok(i.getStok()-keranjang.get(i));
        }
        System.out.println("-----Transaksi Sukses----");
        System.out.println("Total Tagihan : "+tagihan);
        System.out.println("Total Bayar : "+nominal);
        System.out.println("Total Kembalian : "+kembalian);

    }
}
