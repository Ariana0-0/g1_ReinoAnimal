package pkVetSystem.pkReinoViviente.pkAnimal;

public class Buho extends Ave {

    public Buho(String nombre, Integer edad, Float peso) {
        super(nombre, edad, peso);
        //TODO Auto-generated constructor stub
    }

    // Agregar el método cazar que recibe un Pezpayaso como parámetro cuando exista la clase Pezpayaso

    /*public String cazar(Pezpayaso pecesillo){
        return "El buho " + getNombre() + " ha cazado al pez payaso " + pecesillo.getNombre() + ".";
    }*/

    public String ulular() {
        return "El buho " + getNombre() + " está ululando: Huuu Huuu Huuu...";
    }

    public String girarCabeza() {
        return "El buho " + getNombre() + " ha girado su cabeza 270 grados.";
    }
}
