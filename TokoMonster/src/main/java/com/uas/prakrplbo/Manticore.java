package com.uas.prakrplbo;

public class Manticore extends Monster{
    public Manticore(String nama) {
        super(nama);
    }

    public String bergerak() {
        return "terbang...";
    }
    public String bersuara(){
        return "Roarroar";
    }
}
