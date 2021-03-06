# Code Review

Code Review realizado a partir do questionário disponibilizado na matéria de arquitetura de software.

## Ferramentas Utilizadas

- Análise de Código: Code Climate [![Maintainability](https://api.codeclimate.com/v1/badges/a99a88d28ad37a79dbf6/maintainability)](https://codeclimate.com/github/codeclimate/codeclimate/maintainability)

## Participante

- Equipe 8: Kássia Catarine

## Questionário

### Manutenibilidade

- O projeto contém alguma descrição arquitetural de atividades para auxiliar no entendimento das regras de negócio?
Somente o texto disponíbilizado para o desenvolvimento pelo professor.

- O projeto contém alguma descrição arquitetural de comunicação/sequência para auxiliar no entendimento do fluxo de comunicação entre as classes?
O projeto disponibiliza um diagrama de classes para o entendimento das ligações contidas
entre as classes do banco, indicando as heranças contidas.

- As classes/métodos são curtos o suficiente para facilitar o entendimento?
Todas as classes é métodos apresentados no projeto estão sufucientemente curtos, não
contendo complexidade ciclomática.

- A decomposição da arquitetura em pacotes/classes beneficia ao máximo a manutenibilidade?
Sim. As informações ficam faceis de serem encontradas de acordo com a distribuíção das
funções distribuídadas de acordo com os pacotes.

### Princípios de desenvolvimento

- O projeto usa inversão de dependência de forma adequada?
Sim. As classe se comunicam de acordo com a estrutura de camadas e a herança é feita por abstração.

- O projeto usa o princípio open-closed quando conveniente?
Não. O projeto só utilizou meios pre disponíveis pelo jpa, a regra de negócios
não possue nenhuma garantia de que o código continuará o mesmo para manter a consistência.

- O projeto usa o princípio de substituição de Liskov quando conveniente?
Sim. Sua abstração da classe pessoa facilita a utilização desse princípio.

- O projeto usa o princípio de segregação de interfaces quanto conveniente?
O projeto não possui interfaces diferentes das interfaces DAOS composta e distribuídas pelo jpa,
assim não contendo nenhuma interface criada e implementada para que haja a segregação.

- O projeto evita repetição frequente de código?
Sim. Eu medi a repetição de acordo com o CodeClimate e nenhuma duplicação foi encontrada no projeto.

- As rotinas implementadas nos métodos são simples de entender e alterar?
Sim. Possuem nomes descritivos e são curtas o suficiente para o entendimento do mesmo.

- O acoplamento entre as classes é o menor possível dentro do contexto do projeto?
Sim. O acoplamento apresentado é curto, contendo somente as ligações entre os componentes necessários.

- As classes estão coesas?
Sim. Todas as classes possuem atributos e nomes fáceis de identificar, sendo simples o
bastante para o entendimento somente visual do mesmo.

### Estruturas arquiteturais

- A estrutura de dados foi implementada corretamente?
Sim. Todas as classes de que realizam a função de persistência de dados contém o mesmo padrão
(JpaRepository) e são implementadas de acordo com ele.

- A estrutura de camadas foi implementada corretamente?
Sim, todas as funções que são exercidas por um conjunto de uma mesmo classe são
implementados em seus respectivos pacotes.

- O Github foi corretamente utilizado para representar/controlar a estrutura de alocação da equipe?
Sim. O github, foi utilizado para versionar o projeto, contendo o commit de todos os membros.

### Padrões de projeto 

- Algum padrão de projeto foi usado quando conveniente?
Sim. O repository pattern foi utilizado no projeto para persistir os dados

- A estrutura do padrão de projeto foi implementada corretamente? 
Sim. A estrutura está de acordo com que a biblioteca jpa oferece para esse padrão de projeto.

### Bibliotecas

- Alguma biblioteca foi usada quando conveniente?
Sim. O JPA, lombok, h2database.

- Algum mecanismo de gerenciamento de bibliotecas foi usado? (ex: Maven)
Sim, pois o ambiente Maven foi implatado, devido a utilização do Spring boot.

### Framework

- Algum framework foi usado quando conveniente?
Sim. O Spring boot.

- O framework adotado gera algum benefício claramente perceptível?
O Spring boot foi utilizado para execução e organização do trabalho, por
oferecer uma maior praticidade ao incorporar estruturas nativa do Java e
disponibilizar de uma maneira intuitiva. O seu benefício é visível atravez da
auto configuração que ele impõe sobre o banco de dados, execução do projeto e testes.