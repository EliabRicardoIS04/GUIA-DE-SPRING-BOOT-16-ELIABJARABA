
package com.springB.demo1.controladores;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.springB.demo1.modelo.Usuario;
import com.springB.demo1.dao.IUsuarioCrud;
import com.springB.demo1.servicio.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import java.util.List;

 ;

@Controller
@Slf4j
public class controladorInit {
    
   @Autowired
   IUsuarioServicio userServicio;
    
    @GetMapping("/")
    public String inicio(Model modelo){
        String mensaje = "Hola mundo Spring MVC";
        modelo.addAttribute("mensaje",mensaje);
      
       
        List<Usuario> listaUsuario = (List<Usuario>) userServicio.listarUsuario();
        modelo.addAttribute("usuarios", listaUsuario );
        log.info("este programa se esta ejecutando");
        return "index";
    }
}
