package com.BancoPichincha.demo.Controller;

import com.BancoPichincha.demo.Entity.Cuentas;
import com.BancoPichincha.demo.Entity.Estados;
import com.BancoPichincha.demo.Entity.Registro;
import com.BancoPichincha.demo.Service.CuentaService;
import com.BancoPichincha.demo.Service.EstadosService;
import com.BancoPichincha.demo.Service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class AdminController {

    @Autowired
    CuentaService cuentaService;

    @Autowired
    EstadosService estadosService;

    @Autowired
    RegistroService registroService;


    //metodo para mostrar Lista
    @GetMapping("/Formulario/ListaRegistro")
    public String listaRegistro(Model model){

        List<Registro> registro = registroService.listarRegistro();

        model.addAttribute("registro", registro);

        return "ListaRegistro";
    }


    //Metodo para mostrar formulario
    @GetMapping({"/Formulario","/"})
    public String mostrarFormulario(Model model){
       Registro registro = new Registro();
        List<Cuentas> cuentas = cuentaService.listarCuentas();
        List<Estados> estados = estadosService.listaEstados();
        model.addAttribute("registro", registro)
               .addAttribute("cuentas", cuentas)
               .addAttribute("estados", estados);
       return "/Formulario";

    }

    //metodo crear Registro
    @PostMapping("/Formulario")
    public String crearRegistro(@ModelAttribute("registro") Registro registro, Model model){

        registroService.guaradarRegistro(registro);
        List<Cuentas> cuentas = cuentaService.listarCuentas();
        List<Estados> estados = estadosService.listaEstados();
        model.addAttribute("registro", registro)
                .addAttribute("cuentas", cuentas)
                .addAttribute("estados", estados);

        registroService.guaradarRegistro(registro);

        return "/Formulario";

    }

    //metodo para mostar registro po ID
    @GetMapping("/Formulario/ListaRegistro/Editar/{id}")
    public String mostrarUnicoRegistro(@PathVariable Long id, Model model){

      Registro registro = registroService.obtenerRegistros(id);
      List <Cuentas> cuentas = cuentaService.listarCuentas();
      List<Estados> estados = estadosService.listaEstados();

      model.addAttribute("registro", registro)
              .addAttribute("estados", estados)
              .addAttribute("cuentas", cuentas );

        return "Editar";
    }

    //metodo actualizar registro
    @PostMapping("/Formulario/ListaRegistro/Editar/{id}")
    public String actualizarRegistro(@PathVariable Long id,@ModelAttribute("registro")Registro registro, Model model){


        List<Cuentas> cuentas = cuentaService.listarCuentas();
        List<Estados> estados = estadosService.listaEstados();
        model.addAttribute("registro", registro)
                .addAttribute("cuentas", cuentas)
                .addAttribute("estados", estados);

        Registro registroexistente = registroService.obtenerRegistros(id);
        registroexistente.setFecha_registro(registro.getFecha_registro());
        registroexistente.setFecha_final(registro.getFecha_final());
        registroexistente.setCuentas(registro.getCuentas());
        registroexistente.setEstados(registro.getEstados());
        registroexistente.setObservaciones(registro.getObservaciones());

        registroService.actualizarRegistro(registroexistente);

        return "redirect:/Formulario/ListaRegistro";
    }

    //metodo para eliminar Registro
    @GetMapping("Formulario/ListaRegistro/{id}")
    public String eliminarRegistro(@PathVariable Long id){
        registroService.eliminarRegistro(id);

        return "redirect:/Formulario/ListaRegistro";
    }








}
