package examenTema4;
import java.sql.Date;

public class ExamenMiguelSantiago 
{
	int nombre = 0;
	Date fechaExamen;
	String descripcion;

	//Set and get nombre
	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	//Set and get fecha
	public Date getFecha() {
		return fechaExamen;
	}

	public void setFecha(Date Fecha) {
		this.fechaExamen = Fecha;
	}
	
	//Set and get descripcion
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String des)
	{
		descripcion = des;
	}
	
	
}
