package com.colegio.colegio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.colegio.colegio.models.entity.Alumnos;
import com.colegio.colegio.models.entity.Profesor;

@Controller
/* @RequestMapping("/index") */
public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String indeString(Model model) {
        Profesor profesor = new Profesor();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("profesor", profesor);
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

    @ModelAttribute("alumnos")

    public List<Alumnos> poblarAlumnos() {
        List<Alumnos> alumnos = Arrays.asList(
                new Alumnos("Johan Sebastian", "Grisales Montoya", "1094956880", "3172381281", "sebaz@gmail.com", "Ciudad Dorada", 26,
                        "Software", 4.5),
                new Alumnos("santiago", "Hernandez Lopez", "147258369", "3128568987", "santiago@gmail.com", "Las America", 20,
                        "software", 4.5),
                        new Alumnos("santiago", "Quintero", "147258369", "3208654523", "santiagoQuintero@gmail.com", "Ciudad Dorada", 19,
                        "software", 4.5));
        return alumnos;
    }

}
