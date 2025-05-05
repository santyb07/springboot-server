package com.tcs.complaint.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.complaint.model.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

	List<Complaint> findByUserId(String id);

	Optional<Complaint> findByComplaintId(int id);
	
}
