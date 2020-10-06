
public class Biblioteca {
	public static void main(String[] args) {

		Livro l1, l2, l3, l4, l5;

		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		l4 = new Livro();
		l5 = new Livro();

		l1.setTitulo("Livro 1");
		l1.setAutor("Chiquinho");
		l1.setCategoria("Suspense");
		l1.setAnoPublicacao(2001);
		l1.setEstante(11);
		l1.setPrateleira(4);
		l1.setEmprestado(true);

		l2.setTitulo("Livro 2");
		l2.setAutor("Maria");
		l2.setCategoria("Comedia");
		l2.setAnoPublicacao(1998);
		l2.setEstante(10);
		l2.setPrateleira(3);
		l2.setEmprestado(false);

		l3.setTitulo("Livro 3");
		l3.setAutor("Sebastiana");
		l3.setCategoria("Historia");
		l3.setAnoPublicacao(2015);
		l3.setEstante(8);
		l3.setPrateleira(7);
		l3.setEmprestado(true);

		l4.setTitulo("Livro 4");
		l4.setAutor("Claudomiro");
		l4.setCategoria("Drama");
		l4.setAnoPublicacao(2018);
		l4.setEstante(9);
		l4.setPrateleira(2);
		l4.setEmprestado(false);

		l5.setTitulo("Livro 5");
		l5.setAutor("Esmeraldo Silva");
		l5.setCategoria("Mitologia");
		l5.setAnoPublicacao(2019);
		l5.setEstante(4);
		l5.setPrateleira(2);
		l5.setEmprestado(false);

		l1.Imprimir();
		l3.Imprimir();
		l5.Imprimir();

	}
}
