/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springB.demo1.servicio;
import java.util.List;
import com.springB.demo1.modelo.Usuario;


public interface IUsuarioServicio {
    
    
    public List<Usuario> listarUsuario();
    public void guardar (Usuario user);
    public void eliminar (Usuario user);
    public Usuario buscar (Usuario user);
}
