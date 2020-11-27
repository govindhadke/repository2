package com.demo.main.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.model.LoanType;

@Repository
public interface LoanRepository extends CrudRepository<LoanType, Integer>{

	
}
