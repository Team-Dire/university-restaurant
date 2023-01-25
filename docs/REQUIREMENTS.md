
# Introdução

## Propósito

Este documento traz os requisitos funcionais e descrições para o desenvolvimento de um software para um  Restaurante Universitário. Além disso, ele possui um glossário para facilitar a compreensão dos termos utilizados.

## Público-alvo

Este documento é destinado aos desenvolvedores do software, que devem utilizá-lo como referência para o desenvolvimento do software.

## Escopo do produto

O software a ser desenvolvido é um gerenciador de refeições para um Restaurante Universitário, com a capacidade de controlar as refeições disponíveis, os clientes e seus créditos, além de interagir com a catraca de entrada do estabelecimento. O sistema contará com administradores e usuários, sendo os administradores responsáveis por inserir as refeições e créditos, enquanto os usuários poderão comprar tíquetes e visualizar o calendário de refeições. É importante destacar que este software não será responsável por gerenciar o estoque de alimentos ou o pagamento dos clientes, e será utilizado apenas como protótipo de um sistema para um restaurante universitário.

# Descrição geral

## Perspectiva do produto

O software visa facilitar a vida dos clientes e administradores do restaurante universitário, permitindo que os clientes comprem tíquetes para refeições a serem servidas, e que os administradores possam inserir refeições e créditos para os clientes. O software também permite que os clientes visualizem o calendário de refeições da semana atual e da seguinte, exibindo as refeições que serão servidas.

## Funcionalidades do prduto

- Manutenção de usuários: armazenar dados sobre os clientes, como CPF, senha, saldo, tipo de usuário, e permitir a autenticação de um usuário por um CPF e senha.

- Informar refeições: permitir o usuário administrador inserir uma refeição que será oferecida pelo restaurante, exibir o calendário de refeições da semana atual e da seguinte, exibindo as refeições que serão servidas, e exibir todos os atributos de uma refeição.

- Disponibilizar crédito para o usuário: permitir que o administrador insira créditos para consumo para um cliente após receber a quantia em dinheiro corrente (moeda física: real).

- Comprar tíquete: permitir que o usuário compre um tíquete para uma refeição a ser servida.

- Entrar no restaurante: permitir que o usuário entre no restaurante universitário utilizando um tíquete.

## Características do usuário

- Administrador: usuário responsável por inserir refeições e créditos para os clientes, geralmente um funcionário do restaurante universitário ou da universidade.

- Usuário: cliente do restaurante universitário, que pode comprar tíquetes para refeições a serem servidas. Pode ser um estudante ou outros funcionários da universidade.

É necessário que o usuário possua acesso ao computador que irá utilizar para acessar o software, e que tenha familiaridade com o uso de um computador.

## Restrições

O software deve ser projetado para executar em um computador com sistema operacional Windows, e deve ser desenvolvido utilizando a linguagem de programação Java.
Em relação ao hardware, o software deve ser capaz de rodar em um computador com processador Intel Core i3 ou superior, com 4 GB de memória RAM ou superior, e com 1 GB de espaço livre em disco.

## Suposições e dependências

O Java Runtime Enviroment (JRE), na versão 8 ou superior, deve estar instalado no computador que irá executar o software.

# Glossário

- **Tipo de refeição:** café da manhã, almoço, café da tarde e janta.

- **Refeição:** conjunto de informações, incluindo o prato a ser servido, a data de serventia, quantidade de tíquetes a serem vendidos e outras informações referentes a uma “serventia” de um prato do restaurante.

- **Tíquete:** espécie de ingresso/passe virtual para uma refeição, isto é, uma autorização que fica armazenada no servidor utilizada para a entrada no restaurante universitário para uma refeição a ser servida.

# Requisitos funcionais

## Manutenção de usuários

- R1.1 — O sistema dever ser capaz de armazenar dados sobre os clientes: CPF, senha, saldo, tipo de usuário.
- R1.2 — O sistema deve ser capaz de distinguir usuários (clientes) em duas categorias (tipos de usuário): administrador e não-administrador.
- R1.3 — O sistema deve permitir a autenticação de um usuário por um CPF e senha.

### Informar refeições

- R2.1 — O software deve ser capaz de permitir o usuário administrador inserir uma refeição que será oferecida pelo restaurante.
- R2.2 — A refeição deverá conter os seguintes atributos: data de serventia, quantidade de tíquetes totais para compra disponíveis, tipo de refeição, nome da refeição, prato principal, alimento de base, guarnição, saladas, bebida e sobremesa.
- R2.3 — O software deve ser capaz de permitir que os clientes visualizem o calendário de refeições da semana atual e da seguinte, exibindo as refeições que serão servidas.
- R2.4 — O software deve ser capaz de exibir os todos os atributos de uma refeição.

### Disponibilizar crédito para o usuário

- R3.1 — O software deve ser capaz de permitir que o administrador insira créditos para consumo para um cliente após receber a quantia em dinheiro corrente (moeda física: real).
- R3.2 — O software deve manter registro desta transação, armazenando data, valor, o usuário administrador e o cliente beneficiado.

### Vender tíquetes

- R4.1 — O software deve ser capaz de permitir que o cliente compre um tíquete por refeição a ser servida.
- R4.2 — O software deve decrementar o valor em créditos do cliente referente ao tíquete.
- R4.3 — O software deve garantir que o cliente apenas compre um tíquete caso possua créditos suficientes no momento da aquisição, isto é, no mínimo, o valor do tíquete em crédito.
- R4.4 — O software deve garantir que o cliente apenas compre uma unidade de tíquete por refeição a ser servida.
- R4.5 — O software deve garantir que o cliente apenas possa comprar um tíquete para uma refeição caso não possua um tíquete para esta refeição.
- R4.6 — O software deve garantir que o cliente apenas compre um tíquete caso a quantidade disponível de tíquetes for maior que zero.
- R4.7 — O software deve garantir que o cliente apenas compre tíquetes até um dia antes da data de serventia.
- R4.8 — O software deve decrementar a quantidade de tíquetes disponíveis para uma refeição após a compra de um tíquete dela.

### Permitir a entrada dos clientes no estabelecimento

- R5.1 — O software deve ser capaz de interagir com a catraca da entrada do estabelecimento do RU, concedendo a passagem para a entrada de um cliente.
- R5.2 — O software deve ser capaz de conceder a entrada de um cliente após esta pessoa inserir seu CPF na catraca e possuir (no sistema) um tíquete adquirido para a refeição a ser servida.
- R5.3 — O software deve apenas conceder a entrada no restaurante para clientes com tíquete.
- R5.4 — O software não deve conceder a entrada no restaurante para clientes sem tíquete.
- R5.5 — O software deve ser capaz de conceder a entrada de clientes no restaurante apenas na data e período (derivado do tipo de refeição) de serventia.
- R5.6 — O software deve permitir a entrada de um cliente apenas uma vez para uma refeição servida.
