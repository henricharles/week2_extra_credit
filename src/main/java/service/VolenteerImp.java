package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.VolenteerDao;
import dao.VolenteerDao;
import domain.Volenteer;


@Service
public class VolenteerImp implements VolenteerService{
	@Autowired
	private VolenteerDao customerDao;
	
	
	public Iterable<Volenteer> getAllVolenteer(){
		return customerDao.findAll();
	}
	
	public void saveCustomer(Volenteer volenteer){
		customerDao.save(volenteer);
	}

	@Override
	public void getAllProject() {
		// TODO Auto-generated method stub
		
		
	}

}
