package examenTema4;

import java.util.Date;

public class ExamenAlan
{
	// Atributos
	
	private int nombre;
	private Date fechaExamen;

	// Getters & Setters
	
	public Date getFechaExamen()
	{
		return fechaExamen;
	}

	public void setFechaExamen(Date fechaExamen)
	{
		this.fechaExamen = fechaExamen;
	}

	public int getNombre()
	{
		return nombre;
	}

	public void setNombre(int nombre)
	{
		this.nombre = nombre;
	}
}
