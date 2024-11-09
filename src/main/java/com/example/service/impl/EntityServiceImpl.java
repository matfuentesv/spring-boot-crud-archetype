package com.example.service.impl;

import com.example.model.EntityModel;
import com.example.repository.EntityRepository;
import com.example.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {

    @Autowired
    private EntityRepository entityRepository;


    @Override
    public List<EntityModel> findAll() {
        return entityRepository.findAll();
    }

    @Override
    public EntityModel findEntity(Long id) {
        if(entityRepository.findById(id).isPresent()){
            return entityRepository.findById(id).get();
        } else {
            return new EntityModel();
        }
    }

    @Override
    public EntityModel createEntity(EntityModel entityModel) {
        return entityRepository.save(entityModel);
    }

    @Override
    public EntityModel updateEntity(EntityModel entityModel) {
        return entityRepository.save(entityModel);
    }

    @Override
    public void deleteEntity(Long id) {
        entityRepository.deleteById(id);
    }
}
