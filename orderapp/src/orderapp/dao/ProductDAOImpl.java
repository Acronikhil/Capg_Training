package orderapp.dao;

import java.util.ArrayList;
import java.util.List;

import orderapp.data.Product;

public class ProductDAOImpl implements ProductDAO {
	@Override
	public Product getProductById(Integer productId) {
		Product product = null;
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<Product>();
		return productList;
	}

	@Override
	public Integer addProduct(Product productInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer updateProduct(Product updatedProductInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer deleteProductById(Integer productId) {
		Integer row = 0;
		return row;
	}
}
