package student.application.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class StudentDto {
private Long id;
private String name;
private String lastname;
private CityDto city;
private List<ResultsDto> resultlist;

}
