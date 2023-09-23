package mx.edu.uaz.ingsoft.pooii.Flag_Football.modelo;

public class Jugador {

    private Long id;
    private String nombre;
    private String apellidos;
    private String posicion;
    private int numero;
    private String equipo_actual;

    public Jugador(String nombre, String apellidos, String posicion, int numero, String equipo_actual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.numero = numero;
        this.equipo_actual = equipo_actual;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo_actual() {
        return equipo_actual;
    }

    public void setEquipo_actual(String equipo_actual) {
        this.equipo_actual = equipo_actual;
    }

    @Override
    public String toString() {
        return id+","+nombre+","+apellidos+","+posicion+","+numero+","+equipo_actual;
    }
}
