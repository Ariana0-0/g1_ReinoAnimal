package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Ave extends AnimalVertebrado {

    public Ave(String nombre, Integer edad, Float peso) {
        super(nombre, edad, peso);
        //TODO Auto-generated constructor stub
    }

    public boolean tieneAla() {
        if (tieneAla()) {
            System.out.println("El ave " + getNombre() + " tiene alas, puede volar.");
        } else {
            System.out.println("El ave " + getNombre() + " no tiene alas, no puede volar.");
        }
        return true;
    }

}
