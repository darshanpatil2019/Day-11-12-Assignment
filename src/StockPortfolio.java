import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    //ArrayList of Stock Account

    ArrayList<Stock> stockList = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    //Method for Number of Stock Account

    public static void main(String[] args) {
        StockPortfolio stockPortfolio = new StockPortfolio();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }

    private void setStocks() {
        System.out.println("Enter the Number of Stocks You Want: ");
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            Stock stock = new Stock();
            setStocksInfo(stock, 1);
        }
    }

    private void setStocksInfo(Stock stock, int i) {
        //System.out.println("Enter the Stock " + (i + 1) + "Information : ");
        System.out.println("Enter the Stock Name : ");
        stock.setStockNames(sc.next());
        System.out.println("Enter the Number of Shares : ");
        stock.setNumOfShares(sc.nextInt());
        System.out.println("Enter the Price of Shares : ");
        stock.setSharePrices(sc.nextDouble());
        stock.setTotalValueOfShares(stock.getNumOfShares(), stock.getSharePrices());
        stockList.add(stock);
    }

    private void getStockInfo() {
        int i = 1;
        for (Stock stock : stockList) {
            System.out.println("The Stock " + i + " Information is :");
            System.out.println("Stock Name : " + stock.getStockNames());
            System.out.println("Number of Shares : " + stock.getNumOfShares());
            System.out.println("Price of Shares : " + stock.getSharePrices());
            System.out.println("Total Value of Shares : " + stock.getTotalValueOfShares());
            i++;
        }
    }
}
