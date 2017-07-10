package data;

import java.util.List;

public interface ProductDao {
	product getproduct(int id);
	List<product> getAllproducts();
	
	
}
