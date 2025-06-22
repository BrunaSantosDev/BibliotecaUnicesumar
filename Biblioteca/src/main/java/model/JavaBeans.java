package model;
public class JavaBeans {
/*create table livros (
id int primary key auto_increment,
titulo varchar(500) not null, 
Autor varchar (255) not null, 
Ano int,
ISBN varchar(20) not null
);*/
	private int id;
	private String titulo;
	private String autor;
	private int ano;
	private String isbn;
	
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavaBeans(int id, String titulo, String autor, int ano, String isbn) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
