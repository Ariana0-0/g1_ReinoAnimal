package pkVetSystem;

import pkVetSystem.pkReinoViviente.pkAnimal.Camaleon;
import pkVetSystem.pkReinoViviente.pkAnimal.Hiena;

public class AppVetSystem {
    

    public AppVetSystem(){

    }

    public void inicializar(){
        
        //Instanciar animales
        Camaleon camaleon = new Camaleon("Federico", 3, 300.5f, "Reptil", "Verde Oscuro");
        Hiena hiena = new Hiena("Alfonso", 7, 65.0f, "Mamifero");


        //Interaccion del Camaleon
        camaleon.detectarAmenaza(hiena);
        camaleon.cambiarColor("Celeste", hiena);
        camaleon.treparRama(hiena);

    }
}