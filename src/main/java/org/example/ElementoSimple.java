package org.example;

public class ElementoSimple extends Elemento {

    public ElementoSimple(int codigo, double precio) {
        super(codigo, precio);
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
    @Override
    public void mostrar(){
        System.out.println("Codigo: " + this.codigo + " Precio: " + this.precio);
    }

}

