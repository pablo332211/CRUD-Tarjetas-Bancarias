package com.BancoPichincha.demo.Service;

import com.BancoPichincha.demo.Entity.Cuentas;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuentaService{

    List<Cuentas> listarCuentas();

}

