package Decorator;

import java.time.LocalDateTime;
import objetosNegocio.Notificacion;
import objetosNegocio.Mensaje;
import objetosNegocio.Usuario;

public class NotificacionMensaje implements INotificacion {

    INotificacion notificacion;

    public NotificacionMensaje(INotificacion not) {
        notificacion = not;
    }

    @Override
    public void enviarNotificacion(Notificacion not) {
        System.out.println(not);
    }

    public Notificacion crearNotificacion(Notificacion notificacion, Mensaje mensaje) {
        Notificacion not = new Notificacion(notificacion.getAsunto(), notificacion.getUsuarioRemitente(), notificacion.getUsuarioDestinatario(), notificacion.getFechaHoraEnvio(), mensaje);
        return not;
    }

    @Override
    public Notificacion crearNotificacion(String asunto, Usuario remitente, Usuario destinatario, LocalDateTime fecha) {
        Notificacion not = new Notificacion(asunto, remitente, destinatario, fecha);
        return not;
    }

}
