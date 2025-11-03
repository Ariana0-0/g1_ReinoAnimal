package pkVetSystem.pkReinoViviente.pkAnimal;

public class Camaleon extends Reptil {

    private String colorActual;


    public Camaleon(String nombre, int edad, Float peso, String colorActual) {
        super(nombre, edad, peso);
        setColorActual(colorActual);
    }


    public Boolean detectarAmenaza(Mamifero animal) {
        if (animal.getEstaVivo()) {
            System.out.println("¡El camaleon ha detectado una amenaza! El animal " + animal.getNombre() + " esta presente.");
            return true;
        } else {
            System.out.println("El camaleon no detectó ninguna amenaza.");
            return false;
        }
    }

    public void cambiarColor(String nuevoColor, Mamifero animal) {
        if (detectarAmenaza(animal)) {
            System.out.println("El camaleon " + getNombre() + " cambia su color de " + getColorActual() + " a " + nuevoColor + ".");
            setColorActual(nuevoColor);
        } else {
            System.out.println("El camaleon " + getNombre() + " mantiene su color actual: " + getColorActual() + ".");
        }
        
    }
    

    public void treparRama(Mamifero animal) {
        if (detectarAmenaza(animal)) {
            System.out.println("El camaleon " + getNombre() + " está trepando una rama silenciosamente...");
        } else {
            System.out.println("El camaleon " + getNombre() + " está descansando");
        } 
    }

    public String getColorActual() {
        return colorActual;
    }

    public void setColorActual(String colorActual) {
        this.colorActual = colorActual;
    }

}
