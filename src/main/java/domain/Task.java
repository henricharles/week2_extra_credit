package domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Task {

	@Id
	@GeneratedValue
	
	private int Task_Id;
	
	public Task(){
		
	}


@Temporal(TemporalType.DATE)
private Date start;


public Date getStart() {
	return start;
}

public void setStart(Date start) {
	this.start = start;
}

public Date getEnd() {
	return end;
}

public void setEnd(Date end) {
	this.end = end;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public Project getProject() {
	return project;
}

public void setProject(Project project) {
	this.project = project;
}

public List<Skill> getSkils() {
	return skils;
}

public void setSkils(List<Skill> skils) {
	this.skils = skils;
}


@Temporal(TemporalType.DATE)
private Date end;

	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name="Project_Id")
	
	Project project;
	
	@OneToMany(mappedBy="task")
List<Skill>skils=new ArrayList<Skill>();
	
	 @OneToMany(mappedBy="task")
	List<Volenteer>volenteers=new ArrayList<Volenteer>();
	 
	 void addVolenteer(Volenteer v){
		 
		 volenteers.add(v);
	 }
	
	
}
