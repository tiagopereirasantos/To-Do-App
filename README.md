# ToDo App v1.0

**Objetivo:**
- Desenvolver uma aplicação de organização de projetos e suas tarefas em formato *Todo List*, utilizando as tecnologias Java e SQL. 

- **Entidades e atributos:**
- **Projeto:** Nome, descição, Data de Criação, Data de Atualização
- **Tarefa:** Nome, Descrição, Notas, Status, Prazo, Data de Criação, Data de atualização.

**Requisitos:**
- Permitir criar o projeto;
- Permitir criar a tarefa;
- Permitir excluir a tarefa.

- **Regras de negócio:**
- Não irá conter um sistema de login;
- Não haverá o conceito de usuário;
- Toda tarefa deve pertencer a um projeto.

**Tecnologias utilizadas:**
- Neste projeto, as tecnologias utilizadas foram Java e SQL.

**Funcionamento previsto:**
- Após execução da MainScreen, a tela principal é exibida. 
À esquerda, no painel de projetos, é possível adicionar um novo clicando no ícone de "+". A janela de adição de projeto é exibida e, após preenchimento dos campos, deverá ser salva clicando no ícone de "check" no canto direito superior. 
Novamente a tela principal é exibida e agora uma nova tarefa poderá ser adicionada. 
Para isso, selecionamos o projeto na lista e, no painel de tarefas, clicamos no ícone de "+". A janela de adição de tarefas abre e, após o preenchimento dos campos, deverá ser salva clicando no ícone de "check". 
Agora a tela deverá mostrar o projeto e a tarefa associada a ele.

**Telas:**

- Tela principal:
![Tela Princiapal](/Prints/TelaPrincipal.png)

- Janela de adição de projeto:
![Janela de adição de projeto](/Prints/TelaProjetos.png)

- Janela de adição de tarefas:
![Janela de adição de tarefa](/Prints/TelaTarefa.png)

- Tela principal após inserção de um projeto e uma tarefa:
![Tela principal após inserção de dados](/Prints/TelaPrincipalFinal.png)

**Minha experiência com o projeto:**  
- O projeto foi feito seguindo um plano de execução ordenado que incluía a criação do banco de dados, a criação das classes seguindo o padrão de projeto MVC, implementação dos eventos de integração entre as classes, validação dos campos de preenchimento obrigatório e, por fim, os testes de aplicação.

- Considerando que foi meu primeiro projeto utilizando Java, me deparei com novidades, como: a própria etapa de definição e levantamento de requisitos, o uso do padrão de projetos MVC, a integração entre a aplicação com o banco de dados, além, claro, de diversos comandos novos para alcançar êxito na implementação do projeto. Portanto, tudo foi muito desafiador e por vários momentos eu precisei recorrer a ajuda externa para prosseguir na execução e revisão de etapas, quando algo não acontecia como previsto.

- Desse modo, considero que tal exposição me levou a aprender muito sobre:
1. Como ocorrem as fases de concepção de um projeto, desde a sua definição a entrega;
2. Ao melhor entendimento e uso do paradigma de programação orientada a objetos;
3. A estrutura do código para estabelecer a comunicação com o banco de dados e execução do comando SQL de modo seguro, utilizando o try catch;
4. Implementação dos eventos através de código nas classes de View.
5. Uso de herança dos métodos de determinadas classes na renderização de telas da view.

**Observações**  
- O projeto fez parte da formação do programa Start da Capgemini e foi proposto dentro de uma trilha de aprendizado. Portanto, seu foco baseia-se em fazer uso do que está sendo ensinado durante a trilha e instigar a busca por conteúdos extras necessários para cumprir novos desafios, como: criar um sistema de tags, tela de login e usuário, e permitir alteração das tarefas ao clicar na tela principal. 
Desse modo, este projeto não deve ser considerado como uma última versão. A partir de novas habilidades aprendidas, ele poderá ser melhorado.  