package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Record;
import com.example.demo.model.User;
import com.example.demo.repository.RecordsRepository;

@Service
public class RecordService {
	@Autowired
	private RecordsRepository recordRepository;
	
	public void addRecord(Record records, User user) {
		records.setUser(user);
		recordRepository.save(records);
	}
	
	public List<Record>  findUserRecords(User user){
		
		return recordRepository.findByUser(user);
	}
}
