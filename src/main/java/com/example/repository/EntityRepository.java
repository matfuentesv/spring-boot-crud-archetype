package com.example.repository;

import com.example.model.EntityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<EntityModel,Long> {
}
