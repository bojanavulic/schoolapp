package school.application.services;

import java.util.List;

import school.application.entites.Student;

public interface StudentServiceInterface {
	
	public List<Student> getStudentList();
	public void deleteStudent(Long id);
	public void addStudent (Student student);
	public Student moreInfo(Long id);



}
