package examenTema4;

import java.sql.Date;

public class ExamenRecupPEDRO {
	
	private Date fechaExamen;
	private String descripcion;
	private String prueba;
	
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
