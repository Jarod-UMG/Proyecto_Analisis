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
	//Atruibutos
        private String nombre;
	private String categoria;
	private String tamaño;
	private double precio;
	
	public Pan(PanBuilder pb) {
                nombre = pb.nombre;
		categoria = pb.categoria;
		precio = pb.precio;
		tamaño = pb.tamaño;
	}
	public void showInfo() {
		System.out.println("Nombre: " + nombre + "\n" +
                                "Categoria: " + categoria + "\n" + 
				"Precio: Q" + precio + "\n" + 
				"Tamaño: " + tamaño + '\n');
	}
	
	// Clase estatica interna del builder
	public static class PanBuilder{
                private String nombre;
		private String categoria;
		private String tamaño;
		private double precio;
		
		//Constructor
		public PanBuilder() {
                        this.nombre = nombre;
			this.categoria = categoria;
			this.tamaño = tamaño;
                        this.precio = precio;
		}
                
		// Setters con tipo de retorno PanBuilder
                public PanBuilder setNombre(String n){ 
                        nombre = n;
                        return this;
                }
		
                public PanBuilder setCategoria(String t) {
			categoria = t;
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

		// Crear y devolver Pan:
		public Pan build() {
			return new Pan(this);
		}
	}
}
