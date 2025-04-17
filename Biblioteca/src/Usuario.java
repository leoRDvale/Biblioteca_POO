import javax.swing.*;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void cadastrarUsuario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do usuário:");
        String email = JOptionPane.showInputDialog("Digite o e-mail do usuário:");

        Usuario usuario = new Usuario(nome, cpf, email);
        Main.usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
}


    }
