
package fachada;

import objetosNegocio.Publicacion;
import objetosNegocio.Usuario;


public interface IFacade {
    
    void crearUsuario(Usuario usuario);
    void crearPublicacion(Publicacion post);
    void editarUsuario(Usuario usuario);
    void eliminarPublicacion(Publicacion post);
    void iniciarSesion(Usuario user);
    void inicioSesionTw(Usuario user);
    void inicioSesionGoogle(Usuario user);
    
    
    
    
}
