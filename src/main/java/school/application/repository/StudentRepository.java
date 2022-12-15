package school.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import school.application.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	public Optional<Student> findById (Long id);
	
}

