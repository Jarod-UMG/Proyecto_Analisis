/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Pan;
/**
 *
 * @author JAROD
 */
public class Principal {
	public static void main(String[] args) {
		Pan.PanBuilder builder = new Pan.PanBuilder();
		
		Pan p1 = builder.setNombre("Pan Pirujo")
                                 .setPrecio(1)
                                 .setCategoria("Desabrido")
                                 .setTamaño("Grande")
                                 .build();

		Pan p2 = builder.setNombre("Cubiletes")
				.setPrecio(0.50)
				.setCategoria("Dulce")
				.setTamaño("pequeño")
				.build();
				
		p1.showInfo();
		p2.showInfo();
	}

}
