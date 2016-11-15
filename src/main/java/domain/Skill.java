package domain;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity 
public class Skill {

	@Id
	@GeneratedValue
	
	private int Skill_Id;
	
	private String name;
	
public int getSkill_Id() {
		return Skill_Id;
	}


	public void setSkill_Id(int skill_Id) {
		Skill_Id = skill_Id;
	}


	public Task getTask() {
		return task;
	}


	public void setTask(Task task) {
		this.task = task;
	}


public	Skill(){
		
	}
	

@ManyToOne
@JoinColumn(name="Task_Id")

private Task task;



}
