package org.example;

public class Demo {
    public void demo(){
            ElementoFactory elementoSimpleFactory = new ElementoSimpleFactory();
            ElementoFactory kitFactory = new KitFactory();

            Elemento silla = elementoSimpleFactory.createElemento(1, 100);
            Elemento mesa = elementoSimpleFactory.createElemento(2, 200);
            Elemento armario = elementoSimpleFactory.createElemento(3, 300);

            Kit kitDeMuebles = (Kit) kitFactory.createElemento(4, 0);
            kitDeMuebles.agregarElemento(silla);
            kitDeMuebles.agregarElemento(mesa);
            kitDeMuebles.agregarElemento(armario);

            System.out.println("Precio del kit de muebles: " + kitDeMuebles.getPrecio());

            kitDeMuebles.mostrar();

            // Crear un kit de kits
            Elemento cama = elementoSimpleFactory.createElemento(5, 500);
            Kit kitDeDormitorio = (Kit) kitFactory.createElemento(6, 0);
            kitDeDormitorio.agregarElemento(cama);
            kitDeDormitorio.agregarElemento(kitDeMuebles);

            System.out.println("\nPrecio del kit de dormitorio: " + kitDeDormitorio.getPrecio());

            kitDeDormitorio.mostrar();

    }
}
