package student.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultsDto {
	
	private Long id;
	private int mark;
	private SubjectDto subject;

}
