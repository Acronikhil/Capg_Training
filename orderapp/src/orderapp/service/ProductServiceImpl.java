package orderapp.service;

import java.util.List;

import orderapp.dao.ProductDAO;
import orderapp.dao.ProductDAOImpl;
import orderapp.data.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO = new ProductDAOImpl();
	
	@Override
	public Product getProductById(Integer productId) {
		return productDAO.getProductById(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	@Override
	public Integer addProduct(Product productInfo) {
		return productDAO.addProduct(productInfo);
	}

	@Override
	public Integer updateProduct(Product updatedProductInfo) {
		return productDAO.updateProduct(updatedProductInfo);
	}

	@Override
	public Integer deleteProductById(Integer productId) {
		return productDAO.deleteProductById(productId);
	}

}
