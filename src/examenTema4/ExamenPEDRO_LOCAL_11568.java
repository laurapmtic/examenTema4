package examenTema4;

import java.sql.Date;

public class ExamenPEDRO {
	
	private int nombre;
	private Date fechaExamen;
	private String descripcion;
	
	public int getNombre () {
		
		return this.nombre;
		
	}
	
	public void setNombre(int nombre) {
		
		this.nombre=nombre;
		
	}
	
	public Date getFechaexm() {
		return this.fechaExamen;
	}
	
	public void setFechaexm(Date fecha) {
		this.fechaExamen = fecha;
	}
	
	public String getDescripcion() {
		
		return this.descripcion;
		
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion=descripcion;
		
		
	}
	
}
