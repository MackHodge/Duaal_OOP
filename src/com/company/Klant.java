package com.company;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant (String nm, String ad, String pl ){
        naam = nm;
        adres = ad;
        plaats = pl;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", plaats='" + plaats + '\'' +
                '}';
    }
}
