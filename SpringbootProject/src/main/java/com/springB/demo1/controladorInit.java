
package com.springB.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.springB.demo1.modelo.Usuario;
import java.util.Arrays;
import java.util.List;

 ;

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
        
        Usuario u =new Usuario();
        u.setCedula("1234");
        u.setClave("cristina");
        u.setNombre("mario luigi");
        u.setEmail("mario@gamil.com");
        modelo.addAttribute("alguien", u);
        Usuario u4 =new Usuario();
        u.setCedula("1234");
        u.setClave("cristina");
        u.setNombre("mario luigi");
        u.setEmail("mario@gamil.com");
        Usuario u5 =new Usuario();
        u.setCedula("1234");
        u.setClave("cristina");
        u.setNombre("mario luigi");
        u.setEmail("mario@gamil.com");
        
        List<Usuario> listaUsuario = Arrays.asList(u4,u5);
        modelo.addAttribute("usuarios", listaUsuario );
        log.info("este programa se esta ejecutando");
        return "index";
    }
}
