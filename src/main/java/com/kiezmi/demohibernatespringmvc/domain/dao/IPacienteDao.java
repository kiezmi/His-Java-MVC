package com.kiezmi.demohibernatespringmvc.domain.dao;

import com.kiezmi.demohibernatespringmvc.domain.entities.Pacientes;
import org.springframework.data.repository.CrudRepository;

public interface IPacienteDao extends CrudRepository<Pacientes, Long> {

}