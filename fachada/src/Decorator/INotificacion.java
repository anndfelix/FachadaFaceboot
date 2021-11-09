package Decorator;

import java.time.LocalDateTime;
import objetosNegocio.Notificacion;
import objetosNegocio.Usuario;

public interface INotificacion {

    public void enviarNotificacion(Notificacion not);
    public Notificacion crearNotificacion(String asunto, Usuario remitente, Usuario destinatario, LocalDateTime fecha);
}
