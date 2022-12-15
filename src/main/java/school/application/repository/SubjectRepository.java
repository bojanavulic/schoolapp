package school.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import school.application.entites.Student;
import school.application.entites.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
	

}



