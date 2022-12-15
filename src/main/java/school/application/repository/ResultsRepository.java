package school.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import school.application.entites.Results;

@Repository

public interface ResultsRepository extends JpaRepository<Results, Long>{

}
