package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ec.edu.ups.dao.GenericDAO;
import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulo;
import ec.edu.ups.entidades.Libro;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID>{

	private Class<T> persistentClass;
	protected EntityManager em;
	
	public JPAGenericDAO(Class<T> persistentClass) {
		// TODO Auto-generated constructor stub
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	}

	@Override
	public boolean create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		return true;
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro findLibro(String correo, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Libro> findByIdOrMail(String context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Capitulo> findByCorreo(String correo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Autor findByAutorId(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro findbyLibroId(int tel_codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Capitulo findbyCapituloId(int tel_number) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
