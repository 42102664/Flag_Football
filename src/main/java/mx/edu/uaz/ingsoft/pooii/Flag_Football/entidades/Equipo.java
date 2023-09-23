package mx.edu.uaz.ingsoft.pooii.Flag_Football.entidades;

public class Equipo {
    private Long id;
    private String nombre;
    private String pais;
    private String estadio;
    private String entrenador;

    public Equipo(String nombre, String pais, String estadio, String entrenador) {
        this.nombre = nombre;
        this.pais = pais;
        this.estadio = estadio;
        this.entrenador = entrenador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return id+","+nombre+","+pais+","+estadio+","+entrenador;
    }
}
