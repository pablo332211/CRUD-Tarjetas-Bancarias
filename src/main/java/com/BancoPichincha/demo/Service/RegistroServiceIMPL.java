package com.BancoPichincha.demo.Service;

import com.BancoPichincha.demo.Entity.Registro;

import com.BancoPichincha.demo.Repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegistroServiceIMPL implements  RegistroService{

    @Autowired
    RegistroRepository registroRepository;


    @Override
    public List<Registro> listarRegistro() {
        return registroRepository.findAll();
    }

    @Override
    public Registro guaradarRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    @Override
    public Registro obtenerRegistros(Long id) {
        return registroRepository.findById(id).get();
    }

    @Override
    public Registro actualizarRegistro(Registro registro) {
        return registroRepository.save(registro);
    }

    @Override
    public void eliminarRegistro(Long id) {

        registroRepository.deleteById(id);

    }
}
