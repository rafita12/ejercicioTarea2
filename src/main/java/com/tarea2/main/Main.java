package com.tarea2.main;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.tarea2.entidad.Product;
import com.tarea2.enumerado.Tax;

public class Main {
	
	private static BigDecimal precioIva = new BigDecimal("0");
	private static BigDecimal total = new BigDecimal("0");
	
	public static void main(String[] args) {



		List<Product> shoppingCart = Arrays.asList(
		new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
		new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
		new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
		new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
		new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
		new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
		
		System.out.println("-----Lista de productos-----");
		
		//Cálculo del total y muestra cada producto con su IVA añadido
		shoppingCart.stream().forEach(n -> {
			precioIva = n.getPrecio().multiply(n.getTax().getPrecio());
			total = total.add(precioIva);
			System.out.println("El precio de " + n.getNombre() + " con el IVA añadido es --> " + precioIva + " €");
			});
		
		System.out.println();
		
		//Mostrar el precio total
		System.out.println("Precio total --> " + total + " €");
		
		System.out.println();
		
		System.out.println("-----Lista de productos que empiezan por C-----");
		
		//Sacamos los productos que empiezan por C y lo listamos por consola
		Stream <Product> productos=shoppingCart.stream().filter(producto->producto.getNombre().startsWith("C")).sorted();
        productos.forEach((n)-> {
            System.out.println(n.getNombre());
        });

	
	}

}
