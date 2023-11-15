# Sistema para Academias em Java
 

# Sobre o projeto

O Sistema de Gestão de Alunos para Academias é uma aplicação Java desenvolvida para otimizar a administração e a personalização do treinamento dos alunos em academias. Este programa visa facilitar o acompanhamento individualizado de cada aluno, levando em consideração seus objetivos, níveis de condicionamento físico e preferências de atividades. 

Público-Alvo:
O sistema destina-se a academias e centros de treinamento que buscam aprimorar a gestão de alunos e a oferta de programas personalizados. Além disso, é voltado para instrutores, gestores de academia e alunos, proporcionando uma interação simplificada e personalizada para melhorar o planejamento e a execução dos programas de treinamento.


## Nome dos desenvolvedores e RA
Maressa Ledur  - RA 202100190

Vivian Micucci - RA 202108810

# Tecnologias empregadas

Linguagem Java: É a linguagem de programação utilizada no código. Java é amplamente adotado para desenvolvimento de aplicações robustas e é uma escolha comum para sistemas corporativos.

ArrayList e List: São estruturas de dados da biblioteca padrão do Java. No código, elas são usadas para armazenar listas de alunos, exercícios e para associar os exercícios a cada aluno.

Classes e Objetos: O código utiliza conceitos de orientação a objetos, como classes (Aluno, Exercicio, Academia) e objetos, para organizar e gerenciar os dados.

Métodos CRUD: São implementados para criação, leitura, atualização e remoção de alunos e exercícios na classe Academia.

Utiliza os princípios de orientação a objetos do Java, demonstrando a criação de classes, métodos  e associação entre objetos.


# Descrição da arquitetura

## Estrutura das Classes:
Aluno:
Representa um aluno da academia.
Atributos: id, nome, idade, telefone e uma lista de exercícios associados.
Métodos: Construtor, getters, setters e métodos para adicionar e remover exercícios.

Exercicio:
Representa um exercício disponível na academia.
Atributos: id, nome e descrição.
Métodos: Construtor, getters e setters.

Academia:
É responsável por gerenciar alunos e exercícios.
Atributos: Listas de alunos e exercícios.
Métodos: Métodos CRUD para alunos (criar, ler, atualizar, deletar) e exercícios.

Main (Classe principal):
Contém o método main que é responsável por criar instâncias de academia, alunos, exercícios e associá-los.
Relação entre as Classes:

Aluno e Exercicio: Um aluno pode ter uma lista de exercícios associados a ele. Essa relação é estabelecida pelo método adicionarExercicio na classe Aluno.
Academia, Aluno e Exercicio: A classe Academia gerencia as listas de alunos e exercícios. Ela permite criar, ler, atualizar e deletar alunos e exercícios. Há métodos na Academia para associar exercícios a alunos, mas não há uma relação direta entre Academia e Exercicio ou Academia e Aluno além do armazenamento das listas.

A arquitetura do código é simples e segue os princípios de orientação a objetos, com classes definidas que representam entidades do domínio (Aluno e Exercicio) e uma classe de gerenciamento (Academia).
Alunos têm a responsabilidade de manter seus próprios exercícios, a Academia gerencia os alunos e exercícios, e a classe Main é responsável por iniciar o sistema e fazer algumas operações de exemplo.

# Funcionalidade 

O código apresenta funcionalidades CRUD (Create, Read, Update, Delete) para os objetos Aluno e Exercício, bem como uma classe Academia que gerencia esses objetos.

## Operações CRUD para Aluno:
Create (criarAluno): Permite criar um novo aluno e adicioná-lo à lista de alunos da academia.

Read (lerAluno): Permite ler um aluno com base no ID fornecido.

Update (atualizarAluno): Permite atualizar os detalhes de um aluno existente com base no ID fornecido.

Delete (deletarAluno): Permite deletar um aluno com base no ID fornecido.


## Operações CRUD para Exercício:
Create (criarExercicio): Permite criar um novo exercício e adicioná-lo à lista de exercícios da academia.

Read (lerExercicio): Permite ler um exercício com base no ID fornecido.

Update (atualizarExercicio): Permite atualizar os detalhes de um exercício existente com base no ID fornecido.

Delete (deletarExercicio): Permite deletar um exercício com base no ID fornecido.


