import javax.swing.*;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String DataDoEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, String dataDoEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        DataDoEmprestimo = dataDoEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDataDoEmprestimo() {
        return DataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        DataDoEmprestimo = dataDoEmprestimo;
    }

    public static void emprestarLivro() {
        String dataDoEmprestimo = JOptionPane.showInputDialog("Digite a data do empréstimo:");
        String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");

        Livro livro = null;
        Usuario usuario = null;

        //IgnoreCase -> para desconsiderar se o caracter foi digitado com maiuscula ou minuscula, evita erros na busca

        for (Livro l : Main.livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livro = l;
                break;
            }
        }

        for (Usuario u : Main.usuarios) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                usuario = u;
                break;
            }
        }

        if (livro != null && usuario != null) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario, dataDoEmprestimo);
            Main.emprestimos.add(emprestimo);
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Livro ou usuário não encontrado.");
        }
    }


}
