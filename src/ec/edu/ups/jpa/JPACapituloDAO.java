package ec.edu.ups.jpa;

import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.entidades.Capitulo;

public class JPACapituloDAO  extends JPAGenericDAO<Capitulo, String> implements CapituloDAO{

	public JPACapituloDAO() {
		// TODO Auto-generated constructor stub
		super(Capitulo.class);
	}

}
