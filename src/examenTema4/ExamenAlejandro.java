package examenTema4;

/**
 * @author Alejandro Mart�nez Soriano
 */
public class ExamenAlejandro
{
	//Atributo
	int nombre;
	String descripcion;
	Date fechaExamen;
	
	//Constructor
	
	public ExamenAlejandro()
	{
		
	}
	
	//getter
	public int getNombre()
	{
		return nombre;
	}
	public String getDescripcion()
	{
		return descripcion;
	}

	public Date getFechaExamen()
	{
		return fechaExamen;
	}
	//setter
	public void setNombre(int nom)
	{
		nombre = nom;
	}
	public void setDescripcion(String descrp)
	{
		descripcion = descrp;
	}
	
	public void setFechaExamen(Date fecha)
	{
		fechaExamen = fecha;
	}
	
}
