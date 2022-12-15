package school.application.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.application.entites.Results;
import school.application.entites.Student;
import school.application.infrastracture.Mapper;
import school.application.services.StudentServiceInterface;
import student.application.dto.ResultsDto;
import student.application.dto.StudentDto;



	@RestController
	@RequestMapping("/student")
	public class StudentController {
		@Autowired
		private StudentServiceInterface studentService;
		 private Mapper mapper= new Mapper();
		 
		
		//private ModelMapper modelMaper= new ModelMapper();
		
		@CrossOrigin
		@GetMapping("/student-list")
		public Object getStudentList() {
			List<Student> s= studentService.getStudentList();
			List<StudentDto> studentDtoList= new ArrayList<StudentDto>();
			for (Student student : s) {
			StudentDto	studentDto=mapper.mapStudent(student);
			studentDtoList.add(studentDto);
				
			}
			 return studentDtoList;
		}
			
		@CrossOrigin
		@DeleteMapping ("/student-delete/{id}")
		public void deleteStudent (@PathVariable Long id) {
			studentService.deleteStudent(id);
		}
			
			@CrossOrigin
			@PostMapping("user-add")
			public void addStudent(@RequestBody Student student) {
				studentService.addStudent(student);
		
}
			@CrossOrigin
			@GetMapping ("/student-more/{id}")
			public StudentDto moreInfo (@PathVariable Long id) {
				
				Student student=studentService.moreInfo(id);
				return mapper.mapStudent(student);
				
								
			}
				
				
			}
