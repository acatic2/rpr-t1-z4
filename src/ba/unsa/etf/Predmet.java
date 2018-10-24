package ba.unsa.etf;

import java.util.Arrays;

public class Predmet {
    private Student[] niz;
    public int brojStudenata;
    public String naziv;
    public int sifra;
    public int maxBroj_studenata=1000;

    public Predmet(String naziv, int sifra, int maxBroj_studenata) {
        this.naziv = naziv;
        this.sifra = sifra;
        this.maxBroj_studenata = maxBroj_studenata;
    }

    public void upisi(Student s){
    niz[brojStudenata].ime=s.dajIme();
    niz[brojStudenata].prezime=s.dajPrezime();
    niz[brojStudenata].broj_indeksa=s.dajBroj_indeksa();
    brojStudenata++;
    }
    public void ispisi(Student s){
    for(int i=0;i<maxBroj_studenata;i++){
        if(niz[i].ime.equals(s.dajIme()) && niz[i].prezime.equals(s.dajPrezime()) && niz[i].broj_indeksa==s.dajBroj_indeksa()){
            for(int j=i;j<maxBroj_studenata-1;j++){
                niz[j]=niz[j+1];
            }
        }

    } brojStudenata--;
    }

    public String dajNaziv() {
        return naziv;
    }

    public void postaviNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int dajSifra() {
        return sifra;
    }

    public void postaviSifra(int sifra) {
        this.sifra = sifra;
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(niz);
    }
}
