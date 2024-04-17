
package com.springB.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class controladorInit {
    
    @Value("$(index.mensaje)")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje = "Hola mundo Spring MVC";
        modelo.addAttribute("mensaje",mensaje);
        modelo.addAttribute("dato",dato);
        log.info("este programa se esta ejecutando");
        return "index";
    }
}
