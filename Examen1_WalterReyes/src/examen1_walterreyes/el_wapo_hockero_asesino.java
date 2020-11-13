
package examen1_walterreyes;


public class el_wapo_hockero_asesino extends Personas {
protected int rip;

    public el_wapo_hockero_asesino() {
    super();
    }

    public el_wapo_hockero_asesino(int rip, String nombre, int edad, String sexo, Armas arma) {
        super(nombre, edad, sexo, arma);
        this.rip = rip;
    }

    public int getRip() {
        return rip;
    }

    public void setRip(int rip) {
        this.rip = rip;
    }

    @Override
    public String toString() {
        return  super.toString()+ "Gente que ayudó a desaparecer" + rip + "\n";
    }
    
    

}
