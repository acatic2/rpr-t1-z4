package ba.unsa.etf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void dajIme() {
        Student s=new Student("Mujo","Mujic",11111);
        assertEquals("Mujo",s.dajIme());
    }

    @Test
    void dajPrezime() {
        Student s=new Student("Mujo","Mujic",11111);
        assertEquals("Mujic",s.dajPrezime());
    }

    @Test
    void dajBroj_indeksa() {
        Student s=new Student("Mujo","Mujic",11111);
        assertEquals(11111,s.dajBroj_indeksa());
    }

    @Test
    void postaviIme() {
        Student s=new Student("Mujo","Mujic",11111);
        s.postaviIme("Marko");
        assertEquals("Marko",s.dajIme());
    }

    @Test
    void postaviPrezime() {
        Student s=new Student("Marko","Mujic",11111);
        s.postaviPrezime("Maric");
        assertEquals("Maric",s.dajPrezime());

    }

    @Test
    void postaviBroj_indeksa() {
        Student s=new Student("Marko","Maric",11111);
        s.postaviBroj_indeksa(22222);
        assertEquals(22222,s.dajBroj_indeksa());

    }
}