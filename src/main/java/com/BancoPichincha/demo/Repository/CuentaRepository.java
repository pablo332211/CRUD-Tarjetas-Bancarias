package com.BancoPichincha.demo.Repository;


import com.BancoPichincha.demo.Entity.Cuentas;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;
import java.util.ResourceBundle;


@Repository
public interface CuentaRepository extends JpaRepository<Cuentas, Long> {



}
