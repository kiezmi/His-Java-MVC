package com.kiezmi.demohibernatespringmvc.domain.services;

import com.kiezmi.demohibernatespringmvc.domain.entities.Pacientes;
import java.util.List;
import java.util.Optional;


public interface iPacienteService {
    public List<Pacientes> findall();
    public void save (Pacientes paciente);
    public Optional<Pacientes> findOne(Long id);
    public void delete(Long id);
}
