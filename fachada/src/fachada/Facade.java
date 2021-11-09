package fachada;

import DAO.PublicacionDAO;
import DAO.UsuarioDAO;
import objetosNegocio.Publicacion;
import objetosNegocio.Usuario;
//import objetosNegocio.Comentario;

public class Facade implements IFacade {

    PublicacionDAO pDAO;
    UsuarioDAO uDAO;
    
    @Override
    public void crearUsuario(Usuario usuario) {
        uDAO.agrega(usuario);
    }
    
    @Override
    public void crearPublicacion(Publicacion post) {
        pDAO.agrega(post);
        
    }
    
    @Override
    public void editarUsuario(Usuario usuario) {
        uDAO.actualiza(usuario);
        
    }
    
    @Override
    public void eliminarPublicacion(Publicacion post) {
        pDAO.eliminar(post);
    }
    
    @Override
    public void iniciarSesion(Usuario user) {
        
    }
    
    @Override
    public void inicioSesionTw(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void inicioSesionGoogle(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
