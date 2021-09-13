# Banco 

## 💻 Sobre o projeto

### Descrição
Reunião de todos os conceitos vistos no curso de Java da Let's Code 
(Estruturas de Dados, Desenvolvimento web, Spring MVC, Bancos de Dados (SQL) e Segurança, Programação Reativa, Deploy, Nuvem e Microsserviços.) 
em uma aplicação de grande porte! Um sistema bancário!

Todos os anos, milhões de pessoas devem declarar seu Imposto de Renda. O que poucos sabem é que
é possível direcionar parte de seu valor para algumas entidades beneficientes.
São as chamadas doações incentivadas.

Esse projeto tem a ideia de agregar valor para a sociedade com doações incentivadas,
intermediando contadores voluntários e pessoas com dificuldades para realizar sua declaração,
com a condição de que seja doada parte do imposto devido (até 6%),
e disseminar essa informação para a população em geral.

Esse projeto visa atender ao objetivos da *ONU*, através de doações para entidades especializadas em cada aspecto da sociedade, como:
Pobreza, Fome, Saúde, Educação e Desigualdade.


*(Esse projeto foi inspirado na ideia de outro já existente, sendo adaptado para
nossos requisitos e apenas para fim de educação e estudo. Segue link do projeto:
https://hackdash.org/projects/5894c5682c61d7392535cafa)*

### Funcionalidades
Desenvolvemos uma API REST, ao qual irá armazenar (em Banco de Dados SQL) os dados sobre os clientes (usuários),
contadores, e entidades não governamentais, além de conectar o usuário final com um contador disponível na plataforma.

* Abertura de conta

Através do preenchimento de informações iniciais, a conta deve ser criada.

* Saque

* Deposito

* Transferência

Pix e TED/DOC
* Investimento

A partir do dinheiro que está disponível na conta corrente

* Empréstimo

* Login

Com usuario e senha

* Fechamento de conta

* Envio de email ao realizar cada uma das operações

* Interface gráfica básica(pagina web) com as funcionalidades acima descritas

### Requisitos não funcionais

Observabilidade:

* Spring boot Admin

* Prometheus

* Graphana

* Uso de micro-serviços

* Aplicações em containeres

* Orquestração com kubernets

* Utilizar conceitos para resiliência

* Utilize, caso veja como necessário, um framework front-end de sua preferência.

* Banco de dados a escolha

* Plataforma na cloud a sua escolha

## Entrega
Repositórios associados (Github)
URL em ambiente Cloud, com funcionalidades implementadas

## Avaliação
Notas de 0 a 100
De 0 a 50 pontos para completude(e correto funcionamento das funcionalidades)
De 0 a 50 para analise de requisitos não funcionais e organização de código aplicados.

## 🛠 Tecnologias
- Java 11
- Maven
- Lombok
- Spring Boot
- Banco de dados (SQL)
