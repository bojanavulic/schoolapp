package school.application.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="city")

public class City{
	
@Column(name="name")
private String name;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private Long id;

}
