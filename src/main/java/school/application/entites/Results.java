package school.application.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="results")

public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public Long id;
	@ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;
	@ManyToOne
    @JoinColumn(name = "id_subject")
    private Subject subject;
	@Column(name="mark")
	private int mark;


}
