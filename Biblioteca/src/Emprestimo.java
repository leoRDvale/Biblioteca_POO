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


}
