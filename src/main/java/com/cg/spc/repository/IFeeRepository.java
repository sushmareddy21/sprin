package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.User;

public interface IFeeRepository extends JpaRepository<Fee,String> {
		public Fee addFee(Fee fee);
		public Fee deleteFee(int id);
		public Fee updateFee(Fee fee);
		public Fee retrieveFee(int id);
		public Fee retrieveFeeByStudent(Student student);
		public List<Fee> retrieveAllFeeByMonth(int month);
		
		

}
