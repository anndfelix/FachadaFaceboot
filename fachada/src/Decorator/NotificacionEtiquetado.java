package Decorator;

import java.time.LocalDateTime;
import objetosNegocio.Notificacion;
import objetosNegocio.Publicacion;
import objetosNegocio.Usuario;

/**
 *
 * @author Andrea
 */
public class NotificacionEtiquetado implements INotificacion {

    INotificacion notificacion;

    public NotificacionEtiquetado(INotificacion not) {
        notificacion = not;
    }

    @Override
    public void enviarNotificacion(Notificacion not) {
        System.out.println(not);
    }

    public Notificacion crearNotificacion(Notificacion notificacion, Publicacion publicacion) {
        Notificacion not = new Notificacion(notificacion.getAsunto(), notificacion.getUsuarioRemitente(), notificacion.getUsuarioDestinatario(), notificacion.getFechaHoraEnvio(), publicacion);
        return not;
    }

    @Override
    public Notificacion crearNotificacion(String asunto, Usuario remitente, Usuario destinatario, LocalDateTime fecha) {
        Notificacion not = new Notificacion(asunto, remitente, destinatario, fecha);
        return not;
    }
}
