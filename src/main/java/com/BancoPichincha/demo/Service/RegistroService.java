package com.BancoPichincha.demo.Service;

import com.BancoPichincha.demo.Entity.Registro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistroService {

    List<Registro> listarRegistro();

    Registro guaradarRegistro(Registro registro);

    Registro obtenerRegistros(Long id);

    Registro actualizarRegistro(Registro registro);

    void eliminarRegistro(Long id);



}
