package pkVetSystem.pkReinoViviente.pkAnimal;

import pkVetSystem.pkReinoViviente.pkVegetal.Alga;

public class PezPayaso extends Pez {

    public PezPayaso(String nombre, int edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public String comer(Alga alga) {
        return "El pez payaso " + getNombre() + " está comiendo algas: " + alga.getTipo();
    }

     public String comer() {
        return "El pez payaso " + getNombre() + " está comiendo hambre...";
    }
    
    public boolean estaNadando() {
        System.out.println("El pez payaso " + getNombre() + " está nadando alegremente en el acuario.");
        return true;
    }

    @Override
    public boolean estaVivo() {
        System.out.println("El pez payaso" + getNombre() + "está vivito y coleando.");
        return true;
    }
}