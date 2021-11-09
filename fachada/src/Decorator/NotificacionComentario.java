package Decorator;

import java.time.LocalDateTime;
import objetosNegocio.*;

/**
 *
 * @author Andrea
 */
public class NotificacionComentario implements INotificacion {

    INotificacion notificacion;

    public NotificacionComentario(INotificacion not) {
        notificacion = not;
    }

    @Override
    public void enviarNotificacion(Notificacion not) {
        System.out.println(not);
    }

    public Notificacion crearNotificacion(Notificacion notificacion, Comentario comentario) {
        Notificacion not = new Notificacion(notificacion.getAsunto(), notificacion.getUsuarioRemitente(), notificacion.getUsuarioDestinatario(), notificacion.getFechaHoraEnvio(), comentario);
        return not;
    }

    @Override
    public Notificacion crearNotificacion(String asunto, Usuario remitente, Usuario destinatario, LocalDateTime fecha) {
        Notificacion not = new Notificacion(asunto, remitente, destinatario, fecha);
        return not;
    }

}
