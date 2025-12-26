public interface ProductService {
    Product createProduct(Product p);
    Product getProduct(Long id);
    List<Product> getAllProducts();
}
