package pkVetSystem.pkReinoViviente.pkAnimal;

public abstract class Pez extends AnimalVertebrado{

    public Pez(String nombre, int edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
    }

    public void tragar() {
        System.out.println("El pez está tragando... Hamrbreee!");
    }

    public void nadar() {
        System.out.println("El pez está nadando en el agua.");
    }

    public boolean estaVivo() {
        return true;
    }

    public void excretar() {
        System.out.println("El pez está excretando desechos.");
    }

}
