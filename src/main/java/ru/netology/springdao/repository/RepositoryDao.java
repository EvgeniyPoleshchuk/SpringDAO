package ru.netology.springdao.repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Repository
public class RepositoryDao {

    @PersistenceContext
    private EntityManager entityManager;
    public List<String> getProductName(String customerName) {
        String param = "select o.productName from CustomerOrders o where lower(customers.name) = lower(:name)";

        return entityManager.createQuery(param, String.class).setParameter("name", customerName).getResultList();
    }

}
