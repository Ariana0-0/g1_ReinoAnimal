package pkVetSystem.pkReinoViviente.pkAnimal;



public class Buho extends Ave {

    public Buho(String nombre, Integer edad, Float peso, String especie) {
        super(nombre, edad, peso, especie);
        //TODO Auto-generated constructor stub
    }

    // Agregar el método cazar que recibe un PezPayaso como parámetro cuando exista la clase PezPayaso

    public String cazar(PezPayaso pecesillo){
        return "El buho " + getNombre() + " ha cazado al pez payaso " + pecesillo.getNombre() + ".";
    }

    public String ulular() {
        return "El buho " + getNombre() + " está ululando: Huuu Huuu Huuu...";
    }

    public String girarCabeza() {
        return "El buho " + getNombre() + " ha girado su cabeza 270 grados.";
    }
}
