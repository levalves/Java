package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livros = new Livro();
		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livro {
	public String livros;
	public String numPaginas;
}