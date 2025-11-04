package pkVetSystem.pkhumano;

import pkVetSystem.pkReinoViviente.pkAnimal.AnimalVertebrado;
import pkVetSystem.pkReinoViviente.pkAnimal.PezPayaso;

public class Veterinario extends Persona {
    private String login;
    private String password;
    private int animalesAtendidos = 0;
        
    public Veterinario(String nombre, String apellido) {
        super (nombre, apellido);
    }

    public Veterinario(String cedula, String nombre, String apellido) {
      super(cedula, nombre, apellido);
    }

    public boolean setClave(String login, String password) {
        if (login != null && password != null) {
            setLogin(login);
            setPassword(password);
            return true;
        }
        return false;
    }

    public boolean registrarAnimal(AnimalVertebrado animal) {
        if (animal != null) {
            System.out.println("Animal registrado: " + animal.getNombre());
            return true;
        }
        return false;
    }

    public boolean atenderAnimal(AnimalVertebrado animal) {
        if (animal == null) {
            return false;
        }
        System.out.println("El veterinario " + getNombre() + " está revisando un " + animal.getEspecie() + ".");
        System.out.println("Atendiendo al animal: " + animal.getNombre());
        animalesAtendidos++; 
        return true;
    }
    
    public String diagnosticarAnimal(AnimalVertebrado animal) {
        if (animal instanceof PezPayaso) {
            return "El animal presenta una infección bacteriana.";
        }
        return "El animal está en buen estado de salud.";
    }

    public String darTratamiento(AnimalVertebrado animal) {
        if (animal instanceof PezPayaso) {
            return "Dar antibiótico acuático durante una semana y mejorar calidad del agua.";
        }
        return "No necesita tratamiento ya que tiene un buen estado de salud.";
    }
    public int getAnimalesAtendidos() {
        return animalesAtendidos;
    }

    public String generarReporte (AnimalVertebrado animal) {
        return "Reporte del animal: " + animal.getNombre() + "\n" +
               "Especie:" + animal.getEspecie() + "\n" +
               "Diagnóstico: " + diagnosticarAnimal(animal) + "\n" +
               "Tratamiento: " + darTratamiento(animal);
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

