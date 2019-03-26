public class Printer {
    private int paper;
    private int tonerVolume;

    public Printer(){
        this.paper = 0;
        this.tonerVolume = 0;
    }
    public int checkPaper(){
        return this.paper;
    }
    public int checkToner(){
        return this.tonerVolume;
    }
    public void fillPaper(int sheetNumber){
        this.paper += sheetNumber;
    }
    public void fillToner(int tonerVolume){
        this.tonerVolume += tonerVolume;
    }
    public void printJob(int pages, int copies){
        int jobTotal = pages * copies;
        if (checkJobCapacity(jobTotal)) {
            this.paper -= jobTotal;
            this.tonerVolume -= 1;
        }
        else {
        this.reportFailure();
        }
    }
    public boolean checkJobCapacity(int jobTotal) {
        if ((jobTotal <= this.paper) && (this.tonerVolume > 0)) {
            return true;
        } else {
            return false;
        }
    }
    public String reportFailure(){
        return "PC Load Letter";
    }
}
