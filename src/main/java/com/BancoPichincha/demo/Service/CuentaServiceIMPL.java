package com.BancoPichincha.demo.Service;

import com.BancoPichincha.demo.Entity.Cuentas;
import com.BancoPichincha.demo.Repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceIMPL implements CuentaService {

    @Autowired
    CuentaRepository cuentaRepository;

    @Override
    public List<Cuentas> listarCuentas() {
        return cuentaRepository.findAll();
    }
}
