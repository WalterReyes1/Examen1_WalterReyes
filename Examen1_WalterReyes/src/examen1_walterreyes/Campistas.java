
package examen1_walterreyes;

/**
 *
 * @author hp
 */
public class Campistas extends Personas {
 protected String tipo;
 protected String estado;

    public Campistas() {
        super();
    }

    public Campistas(String tipo, String estado, String nombre, int edad, String sexo, Armas arma) {
        super(nombre, edad, sexo, arma);
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString()+  "tipo: " + tipo + ", estado: " + estado + "\n";
    }
 
 
}
