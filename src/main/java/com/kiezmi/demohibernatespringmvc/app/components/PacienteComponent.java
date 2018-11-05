package com.kiezmi.demohibernatespringmvc.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.kiezmi.demohibernatespringmvc.domain.entities.Pacientes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.List;

@Component
@Qualifier("PacientesComponent")
public class PacientesComponent {

    private static final Log logger = LogFactory.getLog("iPacienteService.class");

    @Autowired
    private IPacienteService pacienteService;

    public void addPaciente ( Pacientes paciente){
        pacienteService.save(paciente);
    }

    public List<Pacientes> allPacientes()
    {
        return pacienteService.findAll();
    }


}