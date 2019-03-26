import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrinter {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void canCheckPaper(){
        assertEquals(0,printer.checkPaper());
    }
    @Test
    public void canCheckToner(){
        assertEquals(0,printer.checkToner());
    }
    @Test
    public void canFillPaper(){
        printer.fillPaper(100);
        assertEquals(100,printer.checkPaper());
    }
    @Test
    public void canFillToner(){
        printer.fillToner(20);
        assertEquals(20,printer.checkToner());
    }

    @Test
    public void canPrint__Positive(){
        printer.fillPaper(20);
        printer.fillToner(20);
        printer.printJob(2,10);
        assertEquals(0,printer.checkPaper());
        assertEquals(19, printer.checkToner());
    }
    @Test
    public void canPrint__Negative___Paper(){
        printer.fillPaper(29);
        printer.fillToner(20);
        printer.printJob(3,10);
        assertEquals(29,printer.checkPaper());
        assertEquals(20, printer.checkToner());
    }
    @Test
    public void canPrint__Negative___Toner(){
        printer.fillPaper(20);
        printer.printJob(2,10);
        assertEquals(20,printer.checkPaper());
    }

    @Test
    public void canReportFailure(){
        assertEquals("PC Load Letter",printer.reportFailure());
    }

}
