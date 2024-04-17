
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
import org.springframework.validation.Errors;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;

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

    /**
     *
     * @param usuario
     * @return
     */
    @GetMapping("/agregar")
    public String agregar(Usuario usuario){
    return "modificar";
    }
    
    @PostMapping("/agregar")
    public String guardar ( Usuario usuario, Errors errores){
        if(errores.hasErrors()){return "modificar";}
        
        userServicio.guardar(usuario);
    return "redirect:/";
    }
    
     @GetMapping("/editar/{cedula}")
    public String editar (Usuario usuario, Model modelo){
        log.info("Invocando el metodo EDITAR");
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario",usuario);
    return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar (Usuario usuario, Model modelo){
        
      userServicio.eliminar(usuario);
       
    return "redirect:/";
    }
    
}
