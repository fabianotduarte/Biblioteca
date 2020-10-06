
public class Livro {

	private String Titulo; 
	private String Autor; 
	private String Categoria;
	private String Emprest; //transformar variavel Emprestado [true or false] em Sim ou Não
	private int AnoPublicacao;
	private int Estante;
	private int Prateleira;
	private boolean Emprestado;

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public int getAnoPublicacao() {
		return AnoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		AnoPublicacao = anoPublicacao;
	}
	public int getEstante() {
		return Estante;
	}
	public void setEstante(int estante) {
		Estante = estante;
	}
	public int getPrateleira() {
		return Prateleira;
	}
	public void setPrateleira(int prateleira) {
		Prateleira = prateleira;
	}
	public boolean isEmprestado() {
		return Emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		Emprestado = emprestado;
	}
	
	public void emprestar() {
		Emprestado = true;
	}

	public void devolver() {
		Emprestado = false;
	}
	
	
	public void Imprimir() {

		System.out.println("Titulo:     " + Titulo);
		System.out.println("Autor:      " + Autor);
		System.out.println("Categoria:  " + Categoria);
		System.out.println("Publicacao: " + AnoPublicacao);
		System.out.println("Estante:    " + Estante);
		System.out.println("Prateleira: " + Prateleira);
		
		if(Emprestado) {
			Emprest = "Sim";
		} 
		else {
			Emprest = "Nao";
		}
		
		System.out.println("Emprestado? " + Emprest);
		System.out.println(" ");
		
	}
	
	
}
