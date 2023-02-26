package com.colegio.colegio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colegio.colegio.models.entity.Profesor;

@Controller
/*@RequestMapping("/index")*/
public class IndexController {
    @GetMapping({"/","","/index"})
    public String indeString(Model model){
        Profesor profesor = new Profesor();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("profesor",profesor);
        profesor.setNombre("Alvaro Antonio");
        profesor.setApellido("Rodriguez Fernandez");
        profesor.setCc("123456789");
        profesor.setTelefono("3508773820");
        profesor.setEmail("AlvaroAntonio@gmail.com");
        profesor.setDireccion("CALLE 23 14");
        profesor.setEdad(40);
        model.addAttribute("cuerpo", "perfil profesor");
        return "/index";
        
    }
}



