public class Printer {
    private int sheets;
    private int tonerVolume;
    public Printer(int sheets, int tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getTonerVolume(){
        return this.tonerVolume;
    }
    public void print(int pages, int copies){
        int totalSheetsPrinted = pages * copies;
        if (this.sheets >= totalSheetsPrinted) {
            this.sheets -= totalSheetsPrinted;
            this.tonerVolume -= totalSheetsPrinted;
        }
    }
}
