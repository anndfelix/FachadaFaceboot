package Decorator;

import java.time.LocalDateTime;
import objetosNegocio.Notificacion;
import objetosNegocio.Usuario;

public class NotificacionDecorator implements INotificacion {

    private Notificacion notificacion;

    public NotificacionDecorator() {
    }

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviarNotificacion(Notificacion not) {
        System.out.println(not);
    }

    @Override
    public Notificacion crearNotificacion(String asunto, Usuario remitente, Usuario destinatario, LocalDateTime fecha) {
        Notificacion not = new Notificacion(asunto, remitente, destinatario, fecha);
        return not;
    }

}
