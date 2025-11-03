package pkVetSystem.pkReinoViviente.pkVegetal;

public class Alga {
    public String tipo;
    public int valorNutricional;
    private boolean esToxica;




    public Alga(String tipo) {
        setTipo(tipo);
    }


    public Alga(String tipo, int valorNutricional, boolean esToxica) {
        setTipo(tipo);
        setValorNutricional(valorNutricional);
        setEsToxica(esToxica);
    }




    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValorNutricional() {
        return valorNutricional;
    }
    public void setValorNutricional(int valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

    public boolean isEsToxica() {
        return esToxica;
    }
    public void setEsToxica(boolean esToxica) {
        this.esToxica = esToxica;
    }


    
}
