package school.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import school.application.entites.Student;
import school.application.entites.Subject;
import school.application.repository.StudentRepository;
@Service
public class StudentService implements StudentServiceInterface{
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudentList () {
		return studentRepository.findAll();
	}

		public void deleteStudent(Long id){
			 Optional<Student>  s=studentRepository.findById(id);
			
			if( s.equals(null))
				return ;
			else
				studentRepository.delete(s.get());
	;
		}
	public void addStudent (Student student) {
		studentRepository.save(student);
		
		
	}
	public Student moreInfo(Long id){
		 Optional<Student>  s= studentRepository.findById(id);
		return s.get();
	}
	
			
}

	
