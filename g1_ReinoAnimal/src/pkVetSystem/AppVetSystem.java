package pkVetSystem;

import pkVetSystem.pkhumano.Veterinario;
import pkVetSystem.pkReinoViviente.pkAnimal.Camaleon;
import pkVetSystem.pkReinoViviente.pkAnimal.Hiena;
import pkVetSystem.pkReinoViviente.pkAnimal.PezPayaso;

import java.util.Scanner;

import pkVetSystem.pkReinoViviente.pkAnimal.AnimalVertebrado;


public class AppVetSystem {
    

    public AppVetSystem(){

    }

    public void inicializar(){
        Scanner sc = new Scanner(System.in);

        //Instanciar animales
        Camaleon camaleon = new Camaleon("Federico", 3, 300.5f, "Reptil", "Verde Oscuro");
        Hiena hiena = new Hiena("Alfonso", 7, 65.0f, "Mamifero");
        PezPayaso pezPayaso = new PezPayaso("Nemo", 2, 0.2f, "Pez");


        //Interaccion del Camaleon
        camaleon.detectarAmenaza(hiena);
        camaleon.cambiarColor("Celeste", hiena);
        camaleon.treparRama(hiena);

        //Interaccion de la Pez Payaso
        pezPayaso.estaNadando();
        pezPayaso.comer();

        Veterinario vet = new Veterinario("1234567890","Juan","Pérez", "JuanVet","clave123" );
        
        int intentos = 3;
        boolean accesoConcedido = false;

        while (intentos > 0 && !accesoConcedido) {
            accesoConcedido = vet.iniciarSesion(sc);
            if (!accesoConcedido) {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Intentos restantes: " + intentos + "\n");
                } else {
                    System.out.println("Ha superado el número máximo de intentos. Acceso denegado.");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("\n");

        vet.entrarCentroConservacion();
        vet.registrarAnimal(camaleon);
        vet.registrarAnimal(hiena);
        vet.registrarAnimal(pezPayaso);
        
        atenderAnimalConReporte(vet, camaleon);
        atenderAnimalConReporte(vet, hiena);
        atenderAnimalConReporte(vet, pezPayaso);

        //Mostrar total de animales atendidos
        System.out.println("Total de animales atendidos por el veterinario " + vet.getNombre() + ": " + vet.getAnimalesAtendidos());
    


    sc.close();
    }
    private void atenderAnimalConReporte(Veterinario vet, AnimalVertebrado animal) {
        System.out.println("\n");
        vet.atenderAnimal(animal);
        System.out.println(vet.observarSintomas(animal));
        System.out.println(vet.diagnosticarAnimal(animal));
        System.out.println(vet.darTratamiento(animal));
        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println(vet.generarReporte(animal));
        System.out.println("------------------------------------------------------");
    }
}