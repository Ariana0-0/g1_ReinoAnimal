package pkVetSystem.pkhumano;

import pkVetSystem.pkReinoViviente.pkAnimal.AnimalVertebrado;

public class Veterinario extends Persona {
    public Veterinario() {
        super();
    }
    public Veterinario(String cedula, String nombre, String apellido) {
      super(cedula, nombre, apellido);
   }
    public boolean registarAnimal(AnimalVertebrado animal) {
        if (animal != null) {
            System.out.println("Animal registrado: " + animal.getNombre());
            return true;
        }
        return false;
    }

    public boolean atenderAnimal(AnimalVertebrado animal) {
          if (animal != null) {
                System.out.println("Atendiendo al animal: " + animal.getNombre());
                return true;
          }
          return false;
    }
    
    public String diagnosticarAnimal (AnimalVertebrado animal) {
        return "El animal " + animal.getNombre() + " está enfermo.";
    }

    public String darTratamiento (AnimalVertebrado animal) {
        return "Se debe dar una pasatilla al dia durante una semana a: " + animal.getNombre() + ".";
    }

    public String clasificarAnimal (AnimalVertebrado animal) {
        return "El animal " + animal.getNombre() + " pertenece a la clase: ";
    }

    public String generarReporte (AnimalVertebrado animal) {
        return "Reporte del animal: " + animal.getNombre() + "\n" +
               "Clase: \n" +
               "Diagnóstico: " + diagnosticarAnimal(animal) + "\n" +
               "Tratamiento: " + darTratamiento(animal);
    }


}

