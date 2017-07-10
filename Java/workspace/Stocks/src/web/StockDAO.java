package web;

import java.util.List;

public interface StockDAO {
	public Stock getStock(String symbol);
	public double getPrice(String symbol);
	public String getName(String symbol);
	public String getSymbol(String name);
	public double getHigh(String symbol);
	public List<Stock> getAllStocks();
}
