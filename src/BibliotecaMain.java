public class BibliotecaMain {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Hobbit", "J.R.R Tolkien");

        //usa os getters para "ler" os dados
        System.out.println("Livro criado com sucesse!");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
    }
}