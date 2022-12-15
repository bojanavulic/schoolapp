package school.application.infrastracture;

import java.util.ArrayList;
import java.util.List;

import school.application.entites.City;
import school.application.entites.Results;
import school.application.entites.Student;
import school.application.entites.Subject;
import student.application.dto.CityDto;
import student.application.dto.ResultsDto;
import student.application.dto.StudentDto;
import student.application.dto.SubjectDto;

public class Mapper {

	public StudentDto mapStudent(Student student) {
		StudentDto studentDto= new StudentDto();
		studentDto.setId(student.getId());
		studentDto.setName(student.getName());
		studentDto.setLastname(student.getLastname());	
		List<ResultsDto> resultsDtoList= new ArrayList<ResultsDto>();
		for (Results result : student.getResultList()) {
			ResultsDto resultsDto= mapResult(result);
        	resultsDtoList.add(resultsDto);
		}
		studentDto.setResultlist(resultsDtoList);
		CityDto cityDto = mapCity(student.getCity());	
		studentDto.setCity(cityDto);
		return studentDto;
	}

	private SubjectDto  mapSubject(Subject subject) {
		SubjectDto subjectDto= new SubjectDto();
		subjectDto.setId(subject.getId());
		subjectDto.setName(subject.getName());
		return subjectDto;
	}

	public CityDto mapCity(City city) {
		CityDto cityDto= new CityDto();
		cityDto.setId(city.getId());
		cityDto.setName(city.getName());
		return cityDto;
	}
	
	public ResultsDto mapResult(Results result) {
		ResultsDto resultsDto= new ResultsDto();
		resultsDto.setId(result.getId());
		resultsDto.setMark(result.getMark());		
		SubjectDto subjectDto =mapSubject(result.getSubject());
		resultsDto.setSubject(subjectDto);
		return resultsDto;
	}
	
	
}
