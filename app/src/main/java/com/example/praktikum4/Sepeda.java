package com.example.praktikum4;

public class Sepeda {
    private String nama,merk,warna;
    private int foto;
    public Sepeda(String nama, String merk, String warna, int foto){
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.foto = foto;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getMerk(){ return merk; }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }

    public int getFoto() { return foto; }
    public void setFoto(int foto) { this.foto = foto; }
}
