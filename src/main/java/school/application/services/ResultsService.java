package school.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.application.entites.Results;
import school.application.repository.ResultsRepository;

@Service
public class ResultsService implements ResultsServiceInterface{
	

	@Autowired
	public ResultsRepository resultsRepository;
	public List<Results> getResultslist() {
		
		return resultsRepository.findAll();
	}

}
