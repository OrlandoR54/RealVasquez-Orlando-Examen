package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String numero;
	private String titulo;
	@ManyToOne
	@JoinColumn
	private Libro libro;
	@OneToOne
	@JoinColumn
	private Autor autor;
	
	public Capitulo() {
		super();
	}

	public Capitulo(String numero, String titulo, Libro libro, Autor autor) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.libro = libro;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
   
	
	
}
