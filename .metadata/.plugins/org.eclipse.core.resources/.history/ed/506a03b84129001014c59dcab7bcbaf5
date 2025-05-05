package com.tcs.complaint.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.complaint.config.NoComplaintFoundException;
import com.tcs.complaint.model.Complaint;
import com.tcs.complaint.repository.ComplaintRepository;


@Service
public class ComplaintService {
	
	@Autowired
	private ComplaintRepository complaintRepository;
	
	//1. create =>insertion=>save()
	
	public void Save(Complaint complaint) {
		this.complaintRepository.save(complaint);
	}
	
	//2.read the data
	//1.read the entire=>findall()
	public List<Complaint> get(){
		return this.complaintRepository.findAll();
	}
	
		
	//2.findById
	public Complaint get(int id) {
		Optional<Complaint> output = this.complaintRepository.findById(id);
		try {
			
		if(output.isEmpty()) {
			throw new NoComplaintFoundException("Please enter the correct id");//throw an exception
		}
		}catch(Exception e) {			
			return null;
		}
		return  output.get();
	}
//	
	/*
	 * //also can be written as public Bill getId(int id) throws Exception { Bill
	 * output = this.billRepository.findById(id).orElseThrow(()-> new
	 * Exception("Please give the correct id"));
	 * 
	 * return output; }
	 */
	
	//3.update => save
	
	public void update(Complaint complaint) {
		if(get(complaint.getId())==null) {
			return;
		}
		this.complaintRepository.save(complaint);
	}
	
	//4.delete =>delete()
	
	public void delete(int id) {
		Complaint complaint = get(id);
		if(complaint == null) {
			return;
		}
		
		this.complaintRepository.delete(complaint);
	}
	
	public List<Complaint> getUserById(String id){
		return this.complaintRepository.findByUserId(id);
	}

}
