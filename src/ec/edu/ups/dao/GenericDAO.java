/**
 * 
 */
package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulo;
import ec.edu.ups.entidades.Libro;


/**
 * @author Orlando Real
 *
 */
public interface GenericDAO<T, ID> {

	public boolean create(T entity);

	public T read(ID id);
	
	public List<T> find();
	
	Libro findLibro(String correo, String pass);
	
	public List<Libro> findByIdOrMail(String context);
	
	public List<Capitulo> findByCorreo(String correo);
	
	public Autor findByAutorId(String cedula);
	
	public Libro findbyLibroId(int tel_codigo);
	
	public Capitulo findbyCapituloId(int tel_number);
}
