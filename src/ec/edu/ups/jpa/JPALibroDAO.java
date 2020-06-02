package ec.edu.ups.jpa;

import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidades.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, String> implements LibroDAO{

	public JPALibroDAO()   {
		// TODO Auto-generated constructor stub
		super(Libro.class);
	}

}
