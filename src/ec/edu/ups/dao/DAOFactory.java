/**
 * 
 */
package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

/**
 * @author Orlando Real
 *
 */
public abstract class DAOFactory {


	protected static DAOFactory factory = new JPADAOFactory();

	public static DAOFactory getDAOFactory() {
		return factory;
	}

	public abstract LibroDAO getLibroDAO();

	public abstract CapituloDAO getCapituloDAO();

	public abstract AutorDAO getAutorDAO();

}
