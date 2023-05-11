package org.example;

public class ElementoSimpleFactory implements ElementoFactory {
    @Override
    public Elemento createElemento(int codigo, double precio) {
        return new ElementoSimple(codigo, precio);
    }
}