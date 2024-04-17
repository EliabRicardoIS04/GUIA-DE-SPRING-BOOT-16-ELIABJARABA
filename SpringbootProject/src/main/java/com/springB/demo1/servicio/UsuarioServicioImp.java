
package com.springB.demo1.servicio;




import com.springB.demo1.modelo.Usuario;
import com.springB.demo1.dao.IUsuarioCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioServicioImp implements IUsuarioServicio {
    @Autowired
    IUsuarioCrud crudUser;
    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listarUsuario(){
        return (List<Usuario>) crudUser.findAll();
    }
    
    @Transactional
    @Override
    public void guardar(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Transactional
    @Override
    public void eliminar(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Transactional
    @Override
    public Usuario buscar(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
