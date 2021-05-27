package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DateResult<List<Product>> getAll() {
        return new SuccessDataResult(this.productDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }

    @Override
    public DateResult<Product> getByProductName(String productName) {
        return new SuccessDataResult(this.productDao.getByProductName(productName), "Data listelendi");
    }

    @Override
    public DateResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult(this.productDao.getByProductNameAndCategory(productName, categoryId), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
        return new SuccessDataResult(this.productDao.getByProductNameOrCategory(productName, categoryId), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult(this.productDao.getByCategoryIn(categories), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult(this.productDao.getByProductNameContains(productName), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult(this.productDao.getByProductNameStartsWith(productName), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult(this.productDao.getByNameAndCategory(productName, categoryId), "Data listelendi");
    }
}
