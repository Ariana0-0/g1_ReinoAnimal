package pkVetSystem.pkReinoViviente;

public abstract class SerVivo {


    private Boolean estaVivo;
    private String nombre;
    private Integer edad;
    private Float peso;
    
    
    public SerVivo(String nombre, Integer edad, Float peso) {
        setEstaVivo(true);
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
    }
    
    public Boolean getEstaVivo() {
        return estaVivo;
    }
    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }


}
