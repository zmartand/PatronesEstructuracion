package org.example.shapes.factories;

import org.example.shapes.Elemento;

public interface ElementoFactory {
    Elemento createElemento(int codigo, double precio);
}
