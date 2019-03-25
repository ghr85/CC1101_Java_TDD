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

/*
    Create a Printer class that has a property for number of sheets of paper left.
    Add a method to print that takes in a number of pages and number of copies.
    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
    Create a method to refill the printer paper.
    Add a toner volume property to the class.
    Modify the printer so that it reduces the toner by 1 for each page printed.
*/


}
