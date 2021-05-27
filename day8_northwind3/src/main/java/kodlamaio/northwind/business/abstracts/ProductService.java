package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    DateResult<List<Product>> getAll();
    Result add(Product product);

    DateResult<Product> getByProductName(String productName);

    DateResult<Product> getByProductNameAndCategory(String productName, int categoryId);

    DateResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

    DateResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DateResult<List<Product>> getByProductNameContains(String productName);

    DateResult<List<Product>> getByProductNameStartsWith(String productName);

    DateResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
}
