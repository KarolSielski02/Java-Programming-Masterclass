public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = isDuplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 100 && tonerAmount > 0) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }

    public int printPages (int pages) {
        int pagesToPrint = pages;
        if (this.duplex){
            System.out.println("Printing in duplex mode");
            pagesPrinted += ((pagesToPrint/2) + (pagesToPrint%2));
            return ((pagesToPrint/2) + (pagesToPrint%2));
        } else {
            pagesPrinted += pages;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
