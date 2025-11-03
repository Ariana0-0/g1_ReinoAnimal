package pkVetSystem.pkReinoViviente.pkAnimal;

public class Alga {
    private String tipo;
    private int valorNutricional;
    private boolean esToxica;

  
    public Alga(String tipo, int valorNutricional, boolean esToxica) {
        this.tipo = tipo;
        this.valorNutricional = valorNutricional;
        this.esToxica = esToxica;
    }

  
    public int getValorNutricional() {
        return this.valorNutricional;
    }

  
    public String getTipo() {
        return this.tipo;
    }

    
    public boolean esComestible() {
       
        return !this.esToxica; 
    }

   
    public boolean esToxica() {
        return this.esToxica;
    }

    public boolean isEsToxica() {
        return esToxica;
    }

    public void setEsToxica(boolean esToxica) {
        this.esToxica = esToxica;
    }

    public void setValorNutricional(int valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
