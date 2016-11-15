package service;

import domain.Volenteer;

public interface VolenteerService {
	public Iterable<Volenteer> getAllVolenteer();
	public void saveCustomer(Volenteer volenteer);
	public void getAllProject();


}
