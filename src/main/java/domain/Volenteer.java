package domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Volenteer extends Person{

	
	Volenteer(){
		
	}
	
	@OneToMany(mappedBy="volenteer")
	private List<Project>project=new ArrayList<Project>();
	
	@ManyToOne
	@JoinColumn(name="task_id")
	
	private Task task;
	
	
	
	
}
