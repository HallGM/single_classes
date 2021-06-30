import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before
    public void before() {
        printer = new Printer(20, 20);
    }
    @Test
    public void noOfSheets() {
        assertEquals(20, printer.getSheets());
    }
    @Test
    public void print(){
        printer.print(10,2);
        assertEquals(0, printer.getSheets());
    }
    @Test
    public void noPrintIfTooManySheets(){
        printer.print(100, 5);
        assertEquals(20, printer.getSheets());
    }
    @Test public void hasTonerVolume(){
        assertEquals(20, printer.getTonerVolume());
    }
    @Test public void printRemovesToner(){
        printer.print(1,1);
        assertEquals(19, printer.getTonerVolume());
    }
}
