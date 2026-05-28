package oop.exam_studies.ex_02;

public class ProductDao {
    private Product[] products;
    private int productsCount;

    public ProductDao(int productsLength){
        this.products = new Product[productsLength];
        this.productsCount = 0;
    }

    public boolean saveProduct(Product product){
        if (products == null || productsCount >= products.length){
            return false;
        }

        products[productsCount] = product;
        productsCount++;

        return true;
    }

    public Product findById(int id){
        for (int i = 0; i < productsCount; i++){
            Product product = products[i];
            if (product != null && product.getId() == id){
                return product;
            }
        }

        return null;
    }
}
