package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DateResult<List<Product>> getAll();
    Result add(Product product);
}
