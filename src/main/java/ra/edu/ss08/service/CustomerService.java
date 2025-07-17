package ra.edu.ss08.service;


import ra.edu.ss08.model.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllDishes();
    Customer getDishById(Long id);
    Customer createDish(Customer customer);
    Customer updateDish(Long id, Customer customer);
    void deleteDish(Long id);
}
