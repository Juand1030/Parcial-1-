import java.util.LinkedList;
import java.util.Queue;

public class GestionCola {
    private Queue<Cliente> colaClientes;

    public GestionCola() {
        this.colaClientes = new LinkedList<>();
    }

    public void encolarCliente(Cliente cliente) {
        colaClientes.add(cliente);
    }

    public Cliente atenderSiguiente() {
        return colaClientes.poll(); 
    }

    public Cliente verProximo() {
        return colaClientes.peek();
    }

    public int obtenerTamano() {
        return colaClientes.size();
    }

    public void vaciarCola() {
        colaClientes.clear();
    }

    public Iterable<Cliente> getColaCompleta() {
        return colaClientes;
    }
}
