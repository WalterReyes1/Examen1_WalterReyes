
package examen1_walterreyes;

public class Armas {
  protected String tipo;
  protected float daño;

    public Armas(String tipo, float daño) {
        this.tipo = tipo;
        this.daño = daño;
    }

    public Armas() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getDaño() {
        return daño;
    }

    public void setDaño(float daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "tipo=" + tipo + ", da\u00f1o=" + daño + '}';
    }
  
}
