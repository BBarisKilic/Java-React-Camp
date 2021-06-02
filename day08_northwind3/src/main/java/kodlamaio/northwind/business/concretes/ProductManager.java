package kodlamaio.northwind.business.concretes;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "productName");
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getAll(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);

        return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent(), "Data listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }

    @Override
    public DateResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data listelendi");
    }

    @Override
    public DateResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_CategoryIdIn(categories), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName), "Data listelendi");
    }

    @Override
    public DateResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName, categoryId), "Data listelendi");
    }
}
