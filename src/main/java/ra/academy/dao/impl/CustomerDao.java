package ra.academy.dao.impl;

import org.springframework.stereotype.Component;
import ra.academy.dao.ICustomerDao;
import ra.academy.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CustomerDao implements ICustomerDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Customer> findAll() {
        return entityManager.createQuery("select C from Customer C", Customer.class).getResultList();
    }

    @Override
    public Customer findById(Long id) {
        return entityManager.find(Customer.class, id);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        entityManager.remove(findById(id));
    }

    @Transactional
    @Override
    public void save(Customer customer) {
        if (customer.getId() != null) {
            // Add new
            entityManager.persist(customer);
        } else {
            // Update
            entityManager.merge(customer);
        }
    }



}
