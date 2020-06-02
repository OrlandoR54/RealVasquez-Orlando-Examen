package ec.edu.ups.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.LibroDAO;
import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulo;
import ec.edu.ups.entidades.Libro;

/**
 * Servlet implementation class IngresoLibro
 */
@WebServlet("/IngresoLibro")
public class IngresoLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresoLibro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = "";
		String isbn = "";
		String numPagString = "";
		
		nombre = request.getParameter("nombreLib");
		isbn = request.getParameter("isbn");
		numPagString = request.getParameter("numPaginas");
		int numPag = Integer.parseInt(numPagString);
		
		
		String numCap = request.getParameter("numero");
		String titulo = request.getParameter("titulo");
		
		String autorStr = request.getParameter("autor");
		int autorID = Integer.parseInt(autorStr);
				
		System.out.println(nombre);
		
		LibroDAO libroDAO = DAOFactory.getDAOFactory().getLibroDAO();
		Libro libro = new Libro(nombre, isbn, numPag, null);
		
		CapituloDAO capituloDAO = DAOFactory.getDAOFactory().getCapituloDAO();
		Capitulo capitulo = new Capitulo(numCap, titulo, libro);
		
		AutorDAO autorDAO = DAOFactory.getDAOFactory().getAutorDAO();
		Autor autor = new Autor("Juan Martin", "eeuu", capitulo);
		
		autor.setCapitulo(capitulo);
		autorDAO.create(autor);
		
		
		if (libroDAO.create(libro) == true) {
            //response.sendRedirect("Sesio");
            
            System.out.println("Usuario Creado");
           /*out.println("<script type='text/javascript'>");
        	out.println("alert('Usuario creado');");
        	out.println("location='/Practica-de-laboratorio-01-Servlets-JSP-y-JDBC/Public/HTML/inicioSesion.html';");
        	out.println("</script>");*/
            //request.getRequestDispatcher("Public/HTML/inicioSesion.html").forward(request, response);  
            response.sendRedirect("JSP/index.jsp"); 
            
           
			//getServletContext().getRequestDispatcher("/Public/HTML/incioSesion.html").forward(request, response);
		}else{
            System.out.println("Usuario No Creado");
            /*out.println("<script type='text/javascript'>");
        	out.println("alert('No se pudo registrar, faltan datos');");
        	out.println("location='/Practica-de-laboratorio-01-Servlets-JSP-y-JDBC/Public/HTML/inicioSesion.html';");
        	out.println("</script>");
        	
        	out.println("<meta http-equiv='refresh' content='3;URL=index.html'>");//redirije despues de 3 segundos
        	out.println("<p style='color:red;'>User or password incorrect!</p>");
        	*/
            response.sendRedirect("JSP/index.jsp");
        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
