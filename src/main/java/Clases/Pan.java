/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JAROD
 */
public class Pan {
	// Mandatory attributes:
	private String tipo;
	private String tamaño;
	private double precio;
	
	public Pan(PanBuilder pb) {
		tipo = pb.tipo;
		precio = pb.precio;
		tamaño = pb.tamaño;
	}
	public void showInfo() {
		System.out.println("Tipo: " + tipo + "\n" + 
				"Precio: " + precio + "\n" + 
				"Tamaño: " + tamaño + '\n');
	}
	
	// Static inner Builder class:
	public static class PanBuilder{
		private String tipo;
		private String tamaño;
		private double precio;
		
		// Overloaded constructor to set mandatory attributes:
		public PanBuilder() {
			this.tipo = tipo;
			this.tamaño = tamaño;
                        this.precio = precio;
		}

		// Setters with return type IceCreamBuilder
		// to allow method chaining:

		public PanBuilder setTipo(String t) {
			tipo = t;
			return this;
		}
		public PanBuilder setTamaño(String t) {
			tamaño = t;
			return this;
		}
		public PanBuilder setPrecio(double p) {
			precio = p;
			return this;
		}

		// Create and return an IceCream:
		public Pan build() {
			return new Pan(this);
		}
	}
}
