package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Elemento {
    private List<Elemento> elementos;

    public Kit(int codigo) {
        super(codigo, 0);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public void eliminarElemento(Elemento elemento) {
        this.elementos.remove(elemento);
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Elemento elemento : this.elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal * 0.9; // Aplicar el descuento del 10%
    }
    @Override
    public void mostrar() {
        System.out.println("Elementos del kit:");
        for (Elemento elemento : this.elementos) {
            System.out.println("Elemento:" + elemento.getCodigo() + " Precio: " + elemento.getPrecio());
        }
    }
}
