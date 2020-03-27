package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.Socio;


public class SocioModelo extends Conector{
	
	public ArrayList<Socio> selectAll() {
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		
		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from socios");
			while(rs.next()) {
				Socio socio = new Socio();
				socio.setId(rs.getInt("id"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDni(rs.getString("dni"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				
				socios.add(socio);
				
			}
			return socios;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return socios;
		
	}
	
	public Socio select(int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from socios where =?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next()) {
				Socio socio = new Socio();
				socio.setId(rs.getInt("id"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apellido"));
				socio.setDni(rs.getString("dni"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				
				return socio;
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public boolean exist (int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from socios where = ?");
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
	
	public ArrayList <Socio> selectALL(){
		ArrayList<Socio> socios = new ArrayList();
		PrestamoModelo pm = new PrestamoModelo();
		
		
		
		return socios;
		
	}
	
	
}
