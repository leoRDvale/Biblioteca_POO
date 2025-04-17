#Biblioteca

Você deve desenvolver um sistema para o controle de empréstimos de livros em uma biblioteca. Para isso
o sistema deve possuir informações dos livros, usuários e do empréstimo. Dos usuários, o sistema deve
armazenar nome, CPF e e-mail. Dos livros as informações relevantes são: Nome, autor, editora e edição.
Do empréstimo é necessário armazenar: o livro emprestado, o usuário que realizará o empréstimo, data de
início do empréstimo (pode ser representado por String ou Date). Todas as classes desenvolvidas devem
estar encapsuladas.
Algumas regras devem ser aplicadas ao realizar e controlar empréstimos. É obrigatório que todo
empréstimo tenha um Livro e um Usuário. O livro só pode ser emprestado para um usuário por vez. O
usuário pode renovar o empréstimo quantas vezes for necessário. No entanto, ao renovar um número
superior a 3 vezes, deve ser gerada uma multa de R$1,00 por renovação acima das 3 permitidas. Ao
entregar o livro, deve ser informado o valor total da multa.
