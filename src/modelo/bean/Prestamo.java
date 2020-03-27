package modelo.bean;

import java.sql.Date;
import java.util.ArrayList;

public class Prestamo {
	private Libro libro;
	private Socio socio;
	private boolean devuelto;
	private Date fecha;
	private boolean entregado;
	private boolean inscrito;
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public boolean esEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}
	public void setInscrito(boolean inscrito) {
		this.inscrito = inscrito;
	}
	
	public boolean esInscrito() {
		
		return inscrito;
	}
	public ArrayList<Prestamo> selectAll(){
		
		ArrayList<Libro> libros = new ArrayList<Libro>();
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		return null;
		
	}
	
}
