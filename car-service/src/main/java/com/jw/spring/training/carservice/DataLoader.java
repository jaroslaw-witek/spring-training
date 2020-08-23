package com.jw.spring.training.carservice;

import com.jw.spring.training.carservice.model.Car;
import com.jw.spring.training.carservice.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    private RepositoryInterface repo;


    @PostConstruct
    public void loadData() {
        repo.save(new Car("toyota","corolla","grey"));
        repo.save(new Car("fiat","punto","green"));
        repo.save(new Car("opel","astra","green"));
        repo.save(new Car("opel","astra","red"));
        repo.save(new Car("fiat","126p","red"));
        repo.save(new Car("toyota","auris","black"));
        repo.save(new Car("toyota","auris","blue"));
        repo.save(new Car("subaru","impreza","blue"));
        repo.save(new Car("ferrari","488","red"));
        repo.save(new Car("porsche","911","white"));

    }
}
