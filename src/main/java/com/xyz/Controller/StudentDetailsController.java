package com.xyz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.Model.StudentDetails;
import com.xyz.Service.StudentDetailsServiceI;

@RestController
@RequestMapping("/studentdetails")
public class StudentDetailsController {
	@Autowired
	private StudentDetailsServiceI ss;
	@PostMapping("/add")
	public void addStudentDetails(@RequestBody StudentDetails studentdetails) {
		ss.addStudentDetails(studentdetails);
	}
	@GetMapping("/findAll")
	public List<StudentDetails>showstudentdetails() {
		List<StudentDetails>list=ss.showstudentdetailsdata();
		return list;
	}
	@PutMapping("/update")
	public StudentDetails update (@RequestBody StudentDetails studentdetails) {
		StudentDetails sdt=ss.update(studentdetails);
		return sdt;
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		ss.delete(id);
	}}