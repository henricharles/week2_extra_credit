package dao;

import org.springframework.data.repository.CrudRepository;

import domain.Admin;

public interface AdminDao extends CrudRepository<Admin, Integer> {

}
