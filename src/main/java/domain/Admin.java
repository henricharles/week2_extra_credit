package domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Admin extends Person {
	


public Admin(){
	
}


public Project create_project(Date start,Date end,List<Task> task){

	return new Project(start,end,task);
	
}

public void update_task(Task t,Status s){
	
t.setStatus(s);
	
	
}

public void update_project(Project p,Status s){
	p.setStatus(s);
	
}
}
