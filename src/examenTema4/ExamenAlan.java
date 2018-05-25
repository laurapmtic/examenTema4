package examenTema4;

import java.util.Date;

public class ExamenAlan
{
	// Atributos
	
	private int nombre;
	private String descripcion;
	private Date fechaExamen;
	
	// Constructor 
	
	public ExamenAlan(int n, String desc, Date fech)
	{
		n = nombre;
		desc = descripcion;
		fech = fechaExamen;
	}

	// Getters & Setters
	
	public String getDescripcion()
	{
		return descripcion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
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
