import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void print(){
        printer.printPages(45, 2);
        assertEquals(10, printer.getSheets());
    }
}
