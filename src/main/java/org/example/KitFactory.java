package org.example;

public class KitFactory implements ElementoFactory {
    @Override
    public Elemento createElemento(int codigo, double precio) {
        return new Kit(codigo);
    }
}
