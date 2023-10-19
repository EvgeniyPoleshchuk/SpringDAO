package ru.netology.springdao.service;

import org.springframework.stereotype.Service;

import ru.netology.springdao.repository.RepositoryDao;

import java.util.List;


@Service
public class ServiceDao {
    private RepositoryDao repository;

    public ServiceDao(RepositoryDao repository) {
        this.repository = repository;
    }

    public List<String> productName(String name){
        return repository.getProductName(name);
    }
}
