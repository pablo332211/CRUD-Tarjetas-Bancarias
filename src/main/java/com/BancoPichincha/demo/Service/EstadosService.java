package com.BancoPichincha.demo.Service;

import com.BancoPichincha.demo.Entity.Estados;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;

@Service
public interface EstadosService {

    List<Estados> listaEstados();

}
