package modelo.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Socio {
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String poblacion;
	private String provincia;
	private String dni;
	
	private ArrayList<Prestamo> prestamos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public int select(int idSocio) {
		
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		return idSocio;
		
	}
	public boolean exist(int idSocio) {
		
		Iterator<Prestamo> i = this.prestamos.iterator();
		Prestamo prestamo;
		
		while(i.hasNext()){
			prestamo = i.next();
			if(!prestamo.esInscrito()){
				
				return false;
			}
		}
		
		return true;
		
	}
	public ArrayList<Socio> selectAll(){
		
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		return null;
		
	}


	
}
