import javax.swing.*;


public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int edicao;

    public Livro(String titulo, String autor, String editora, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public static void cadastrarLivro() {
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
        String editora = JOptionPane.showInputDialog("Digite a editora do livro:");
        int edicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a edição do livro:\n(Ex: 1, 2, 3...)"));

        Livro livro = new Livro(titulo, autor, editora, edicao);
        Main.livros.add(livro);
        JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
    }

}