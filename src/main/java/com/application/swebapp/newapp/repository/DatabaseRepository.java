package com.application.swebapp.newapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.application.swebapp.newapp.model.Databaseentity;

public interface DatabaseRepository extends CrudRepository<Databaseentity, Integer>{

}
