package com.uas.prakrplbo;

public class Cerberus extends Monster{
    public Cerberus(String nama) {
        super(nama);
    }

    public String bergerak() {
        return "berlari...";
    }

    public String bersuara(){
        return "Rawrrawr";
    }


}
