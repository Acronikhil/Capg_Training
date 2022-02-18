package orderapp.service;

import java.util.List;

import orderapp.data.Product;

public interface ProductService {
//	CRUD
	
//	READ
	public Product getProductById(Integer productId);
	public List<Product> getAllProducts();
	
//	Create 
	public Integer addProduct(Product productInfo);
	
//	Update 
	public Integer updateProduct(Product updatedProductInfo);
	
// Delete
	public Integer deleteProductById(Integer productId);
}
