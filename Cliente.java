import java.io.Serializable;
import java.time.LocalTime;

public class Cliente implements Serializable {
    private String nombre;
    private String identificacion;
    private String tipoTransaccion;
    private LocalTime horaLlegada;
    private boolean esPrioritario;

    public Cliente(String nombre, String identificacion, String tipoTransaccion, boolean esPrioritario) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTransaccion = tipoTransaccion;
        this.horaLlegada = LocalTime.now();
        this.esPrioritario = esPrioritario;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
    public String getTipoTransaccion() { return tipoTransaccion; }
    public LocalTime getHoraLlegada() { return horaLlegada; }
    public boolean isEsPrioritario() { return esPrioritario; }

    @Override
    public String toString() {
        String prioStr = esPrioritario ? " [PRIORITARIO]" : "";
        return String.format("[%s] ID: %s | %s | Trámite: %s%s", 
            horaLlegada.withNano(0), identificacion, nombre, tipoTransaccion, prioStr);
    }
}
