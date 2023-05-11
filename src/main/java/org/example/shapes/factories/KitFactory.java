package org.example.shapes.factories;

import org.example.shapes.Elemento;
import org.example.shapes.Kit;

public class KitFactory implements ElementoFactory {
    @Override
    public Elemento createElemento(int codigo, double precio) {
        return new Kit(codigo);
    }
}
