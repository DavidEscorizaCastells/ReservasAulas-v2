package org.iesalandalus.programacion.reservasaulas.modelo.dominio.permanencia;

public enum Tramo {
	MANANA("Ma�ana"), TARDE("Tarde");
	private String cadenaAMostrar;
	
	private Tramo (String cadenaAMostrar) {
		this.cadenaAMostrar=cadenaAMostrar;
	}
	
	@Override
	public String toString() {
		return String.format("%s", cadenaAMostrar);
	}
}
