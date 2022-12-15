package school.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.application.entites.Student;
import school.application.entites.Subject;
import school.application.repository.SubjectRepository;

@Service
public class SubjectService implements SubjectServiceInterface{
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> getSubjectList () {
		return subjectRepository.findAll();
				
		
	}
	

	}
	
	
	
	

