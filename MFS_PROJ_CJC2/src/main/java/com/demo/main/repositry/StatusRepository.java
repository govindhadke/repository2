package com.demo.main.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.model.StatusInfo;

@Repository
public interface StatusRepository extends CrudRepository<StatusInfo, Integer>{

}
