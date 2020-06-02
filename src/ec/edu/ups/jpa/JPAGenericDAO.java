package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		System.out.println("Prueba de SQL" + em.find(persistentClass, id));
		return em.find(persistentClass, id);
	}

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		List<T> lista = null;
		try {
			javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
			cq.select(cq.from(persistentClass));
			lista = em.createQuery(cq).getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Libro findLibro(String correo, String pass) {
		return null;
		// TODO Auto-generated method stub
	/*	Query nativeQuery = em.createNativeQuery("SELECT * FROM Libro where correo = ? AND password= ?",
				Usuario.class);
		nativeQuery.setParameter(1, correo);
		nativeQuery.setParameter(2, pass);

		return (Usuario) nativeQuery.getSingleResult();
	*/}

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
