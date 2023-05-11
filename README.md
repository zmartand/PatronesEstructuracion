# PatronesEstructuracion

## Nota:
Mi repositorio es: https://github.com/zmartand/PatronesEstructuracion.git

## Enunciado ejercicio 1:
Una empresa de mobiliario modular realiza ventas de varios tipos de «elementos». Los elementos pueden ser piezas simples o grupos de «elementos» que forma un «kit», 
con lo que un «kit» es un grupo de «elementos» de cualquiera de los dos tipos.  
Para cada tipo de elemento simple existe una clase definida que lo modela, heredera de la clase ELEMENTO que dispone de características diferidas precio:REAL y
codigo:INTEGER, sin embargo no existe en el sistema ninguna clase que modele el «kit».
Elabore el diagrama de clases así como el código en Java correspondiente de un sistema que permita la gestión de los elementos que vende la empresa,
considerando que cada «kit» tendrá un código numérico propio, y que el precio de un «kit» se calcula como la suma de los precios de sus elementos,
pero con un descuento del 10 %. Implemente completamente la clase que permite modelar un «kit», prestando especial atención a su construcción y
al cálculo de su precio, que debe realizarse en tiempo de ejecución.  

## Diagrama de clases:
<img src="http://www.plantuml.com/plantuml/svg/jLFDQiCm3BxxANHCs9872AKKndRP3eCzWUjemM37nLO6e-kxJsxg_8GCSkXkbVpf-r6LGo3fgRD6w9RGVqg5y6pGOalkHIfo_XlE0k11UPI4wIbJhjQDgu2d7k7aKMakQjST3URLm20kGYWZGnWw7zgU3DwJ-LNJVUYMiNS_PRdkUnqw6X527WDvBc2U_kgmc5YAvTnKZB39V0GsI4zNI9OdkjXxZqZk9IoSavzBHCZ6OoFze8At7-CwUFBBwJg2qMYhswrewwAEpswjgV0Vfz3_QVFUbjpBZ2lginlfLv_CXmhUTA1Tqjt7SKPDbVD_tjNs4EiVJrdk5xkie3_-83ZA5CRb-3RGyTaMnO9YySY3ue1jtLdp2m00">
