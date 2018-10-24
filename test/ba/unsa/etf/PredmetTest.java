package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi() {
    }

    @Test
    void ispisi() {
    }

    @Test
    void dajNaziv() {
    }

    @Test
    void postaviNaziv() {
    }

    @Test
    void dajSifra() {
        Predmet p=new Predmet("RPR",11111,100);
        assertEquals(11111,p.dajSifra());
    }

    @Test
    void postaviSifra() {
        Predmet p=new Predmet("RPR",11111,100);
        p.postaviSifra(22222);
        assertEquals(22222,p.dajSifra());
    }
}