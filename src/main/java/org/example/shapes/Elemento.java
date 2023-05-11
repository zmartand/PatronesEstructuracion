package org.example.shapes;
public abstract class Elemento {
    protected int codigo;
    protected double precio;

    public Elemento(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public abstract double getPrecio();

    public void agregarElemento(Elemento elemento) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    public void eliminarElemento(Elemento elemento) {
        throw new UnsupportedOperationException("Operación no soportada");
    }
    public abstract void mostrar();
}


