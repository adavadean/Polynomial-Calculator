import model.Op;
import model.Polinom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class Testare {

        private Op operatii = new Op();
        private Polinom a = new Polinom();
        private Polinom b = new Polinom();



    @Test
    void addition() {

        try {
           a.constr("2x^3+2x+2");
           b.constr("x^5-4x");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        assertEquals("+x^5+2x^3-2x+2", operatii.add(a,b).toString());
    }

    @Test
    void scadere() {


        try{
           a.constr("x-3");
           b.constr("2x-1");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        assertEquals("-1.0x-2",  operatii.sub(a,b).toString());
    }

   @Test
    void produs() {

        try{
            a.constr("3x+2");
            b.constr("5x-5");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        assertEquals("15x^2-15x^+10x-10",  operatii.produs(a,b).toString());
    }


   @Test
    void integrare() {
        try{
            a.constr("x");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        assertEquals("0.5x^2",  operatii.integrare(a).toString());
    }

    @Test
    void derivare() {
        a.constr("x^2");
        assertEquals("2", operatii.derivare(a).toString());

    }
}