package modelo.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private int num_pag;
	
	//Libro d
	
	private ArrayList<Prestamo> prestamos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNum_pag() {
		return num_pag;
	}
	public void setNum_pag(int num_pag) {
		this.num_pag = num_pag;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public int select(int idLibro) {
		
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		return idLibro;
		
	}
	public boolean exist(int idLibro) {
		
		Iterator<Prestamo> i = this.prestamos.iterator();
		Prestamo prestamo;
		
		while(i.hasNext()){
			prestamo = i.next();
			if(!prestamo.esEntregado()){
				
				return false;
			}
		}
		
		return true;
		
	}
	public ArrayList<Libro> selectAll(){
		
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		
		return null;
		
	}
	
}
