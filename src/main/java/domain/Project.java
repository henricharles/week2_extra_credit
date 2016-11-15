package domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity

public class Project {
@Id
@GeneratedValue

private int Project_id;

@Lob
private byte[] discription;

@Temporal(TemporalType.DATE)
private Date startDate;


@Temporal(TemporalType.DATE)
private Date endDate;

@Embedded
private Address location;



public Address getLocation() {
	return location;
}

public void setLocation(Address location) {
	this.location = location;
}

@OneToMany(mappedBy="project")
private List<Task>tasks=new ArrayList<Task>();

@Enumerated(EnumType.STRING)

private Status status;

@OneToMany(mappedBy="project")
List<Beneficiaries>benefit=new ArrayList<Beneficiaries>();

@ManyToOne
@JoinColumn(name="Volenteer_Id")

private Volenteer volenteer;


public Project(){
	
}

Project(Date start,Date end,List<Task>task){
	
	this.startDate=start;
	this.endDate=end;
	this.tasks=task;
	
	
}

public byte[] getDiscription() {
	return discription;
}

public void setDiscription(byte[] discription) {
	this.discription = discription;
}

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Date getEndDate() {
	return endDate;
}

public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

public List<Task> getTasks() {
	return tasks;
}

public void setTasks(List<Task> tasks) {
	this.tasks = tasks;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public List<Beneficiaries> getBenefit() {
	return benefit;
}

public void setBenefit(List<Beneficiaries> benefit) {
	this.benefit = benefit;
}

public Volenteer getVolenteer() {
	return volenteer;
}

public void setVolenteer(Volenteer volenteer) {
	this.volenteer = volenteer;
}
}
