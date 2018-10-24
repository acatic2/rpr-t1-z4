package ba.unsa.etf;

public class Student {
    public String ime;
    public String prezime;
    public int broj_indeksa;

    public Student(String ime, String prezime, int broj_indeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj_indeksa = broj_indeksa;
    }

    public String dajIme() {
        return ime;
    }

    public String dajPrezime() {
        return prezime;
    }

    public int dajBroj_indeksa() {
        return broj_indeksa;
    }

    public void postaviIme(String ime) {
        this.ime = ime;
    }

    public void postaviPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void postaviBroj_indeksa(int broj_indeksa) {
        this.broj_indeksa = broj_indeksa;
    }

    @Override
    public String toString() {
        return "" + prezime + " " + ime + " " + broj_indeksa;
    }
}
