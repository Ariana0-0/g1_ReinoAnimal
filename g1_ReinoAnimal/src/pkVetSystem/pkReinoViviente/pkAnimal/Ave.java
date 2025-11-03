package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Ave extends AnimalVertebrado {

    public Ave(String nombre, Integer edad, Float peso, String especie) {
        especie = "Ave ";
        super(nombre, edad, peso, especie);
    }

    public boolean tieneAla() {
        if (tieneAla()) {
            System.out.println("El ave " + getNombre() + " tiene alas.");
        } else {
            System.out.println("El ave " + getNombre() + " no tiene alas.");
        }
        return true;
    }

    public String volar(boolean tieneAla) {
        if (tieneAla) {
            return "El ave " + getNombre() + " está volando alto en el cielo.";
        } else {
            return "El ave " + getNombre() + " no puede volar porque no tiene alas.";
        }
    }

}
