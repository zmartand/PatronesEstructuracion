package org.example.shapes.factories;

import org.example.shapes.Elemento;
import org.example.shapes.ElementoSimple;

public class ElementoSimpleFactory implements ElementoFactory {
    @Override
    public Elemento createElemento(int codigo, double precio) {
        return new ElementoSimple(codigo, precio);
    }
}