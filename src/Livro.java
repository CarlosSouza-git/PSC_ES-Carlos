public class Livro{

    String titulo;

    String autor;

    int numPaginas;

    public Livro (String titulo, String autor, int numPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;

    }

    public void informacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("numero de Paginas: " + numPaginas);

    }


    }
