import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Livro> livros = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "****** Seja bem vindo a Livraria Potter ****** \n\n Digite a opção desejada:\n 1 - Cadastrar Livro\n 2 - Cadastrar Usuário \n 3 - Emprestar Livro \n 4 - Devolver Livro \n 5 - Renovar Emprestimo \n 6 - Listar Livros \n 7 - Listar Usuários \n 8 - Listar Empréstimos \n 9 - Sair"));

            switch (opcao) {

                case 1:
                    Livro.cadastrarLivro();
                    break;

                case 2:
                    Usuario.cadastrarUsuario();
                    break;

                case 3:
                    Emprestimo.emprestarLivro();
                    break;

                case 4:
                    Emprestimo.devolverLivro();
                    break;

                case 5:
                    Emprestimo.renovarLivro();

                case 6:
                    Livro.listarLivros();
                    break;

                case 7:
                    Usuario.listarUsuarios();
                    break;

                case 8:
                    Emprestimo.listarEmprestimos();
                    break;

                case 9:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;


            }
        }
    }
}