package pizzeria;

public class Pedido {

    public int edad;
    public String Nombre;

    public Pedido() {
    }

    public Pedido(int edad, String getNombre) {
        this.edad = edad;
        this.Nombre = getNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGetNombre() {
        return Nombre;
    }

    public void setGetNombre(String getNombre) {
        this.Nombre = getNombre;
    }

}
