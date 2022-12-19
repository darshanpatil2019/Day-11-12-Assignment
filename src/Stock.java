public class Stock {

    //Variables

    private String stockNames;
    private int numOfShares;
    private double sharePrices;
    private double totalValueOfShares;

    //Getter and Setter Methods


    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public double getSharePrices() {
        return sharePrices;
    }

    public void setSharePrices(double sharePrices) {
        this.sharePrices = sharePrices;
    }

    public double getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public void setTotalValueOfShares(int numOfShares, double sharePrices) {
        totalValueOfShares = numOfShares * sharePrices;
    }
}
