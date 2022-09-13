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
		
		Pan p1 = builder
                                 .setPrecio(2)
                                 .setTipo("Desabrido")
                                 .setTamaño("Grande")
                                 .build();

		Pan p2 = builder
				.setPrecio(1.50)
				.setTipo("Dulce")
				.setTamaño("pequeño")
				.build();
				
		p1.showInfo();
		p2.showInfo();
	}

}
