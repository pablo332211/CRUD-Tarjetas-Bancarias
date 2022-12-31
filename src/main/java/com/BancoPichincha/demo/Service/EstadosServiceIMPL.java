package com.BancoPichincha.demo.Service;
import com.BancoPichincha.demo.Entity.Estados;
import com.BancoPichincha.demo.Repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadosServiceIMPL implements EstadosService {

    @Autowired
    EstadoRepository estadoRepository;

    @Override
    public List<Estados> listaEstados() {
        return estadoRepository.findAll();
    }
}
