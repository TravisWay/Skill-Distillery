package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

public class ProductDaoFileImpl implements ProductDao {
	Map<Integer, product> inventory = new HashMap<>();
	
	
	@Override
	public product getproduct(int id) {
		
		return inventory.get(id);
	}

	@Override
	public List<product> getAllproducts() {
		
		return new ArrayList<product>(inventory.values());
	}
	
	public ProductDaoFileImpl(ServletContext context) {
		loadProductsFromFile(context,"WEB-INF/products.txt");
	
		
	}
	
	private void loadProductsFromFile(ServletContext context, String fileName){
		InputStream is = context.getResourceAsStream(fileName);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br= new BufferedReader(isr);
		String line;
		try {
			while((line = br.readLine()) != null){
			String[] col= line.split(", ?");
			String name= col[1].replaceAll("\"", "");
			product product = new product(new Integer(col[0]), name, new Double(col[2]));
			inventory.put(new Integer(col[0]), product);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}