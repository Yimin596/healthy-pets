package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Record;
import com.example.demo.model.User;
/**
 * The interface of record repository extends the jparepository.
 * @author zijun mei, yimin li
 *
 */
@Repository
public interface RecordsRepository extends JpaRepository<Record, Long> { 
    //List<Record> findByName(String name);
	List<Record> findByUser(User user); 
}