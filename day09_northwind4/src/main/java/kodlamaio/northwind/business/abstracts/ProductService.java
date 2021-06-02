package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    DateResult<List<Product>> getAll();

    DateResult<List<Product>> getAllSorted();

    DateResult<List<Product>> getAll(int pageNo, int pageSize);

    Result add(Product product);

    DateResult<Product> getByProductName(String productName);

    DateResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);

    DateResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);

    DateResult<List<Product>> getByCategoryIdIn(List<Integer> categories);

    DateResult<List<Product>> getByProductNameContains(String productName);

    DateResult<List<Product>> getByProductNameStartsWith(String productName);

    DateResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DateResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
