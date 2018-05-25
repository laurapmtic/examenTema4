package examenTema4;

import java.util.Date;

public class ExamenAldo {

	private int aldo;
	private Date fechaExamen1;
	private String descripcion;	
	//getters and setter

	public int getAldo() {
		return aldo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public Date getFechaExamen() {
		return fechaExamen1;
	}

	public void setAldo(int aldo) {
		this.aldo = aldo;
	}
	
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public void setFechaExamen(Date fechaExamen)
	{
		this.fechaExamen1 = fechaExamen;

	}
	
}
