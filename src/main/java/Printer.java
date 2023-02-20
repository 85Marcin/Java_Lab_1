public class Printer {
    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public void printPages (int numOfPages, int numOfCopies) {
        int number = numOfPages * numOfCopies;
        if(this.sheets >= number) {
            this.sheets -= number;

        }

    }


    public int getSheets() {
        return this.sheets;
    }
}
