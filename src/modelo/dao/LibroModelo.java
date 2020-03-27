package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import modelo.Conector;
import modelo.bean.Libro;

public class LibroModelo extends Conector{
	
	public ArrayList<Libro> selectAll() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		
		try {
			Statement st = (Statement) super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros");
			while(rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setNum_pag(rs.getInt("num_pag"));
				
				libros.add(libro);
			}
			return libros;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return libros;
		
		
	}
	
	
	public Libro select(int id) {
		try {
			PreparedStatement pst =  super.conexion.prepareStatement("select * from libros where =?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setNum_pag(rs.getInt("num_pag"));
				
				return libro;
				
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}
	
	public boolean exist (int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from libros where titulo = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public ArrayList<Libro> selectALL(){
		ArrayList<Libro> libros = new ArrayList();
		PrestamoModelo pm = new PrestamoModelo();
		
		
		return null;
		
	}
	
	
	
	
}
