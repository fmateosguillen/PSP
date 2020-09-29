package com.salesianostriana.dam._SpringDataCompletoGrupo2.controladores;

import com.salesianostriana.dam._SpringDataCompletoGrupo2.servicios.ProductoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("lista", productoServicio.todosLosProductosConElNombreEnMayusculas);
        return "index";
    }
}
