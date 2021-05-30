package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DateResult;
import kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
    Result add(User user);

    DateResult<User> findByEmail(String email);
}
