# Glossário

- **Tipo de refeição:** café da manhã, almoço, café da tarde e janta.

- **Refeição:** conjunto de informações, incluindo o prato a ser servido, a data de serventia, quantidade de tíquetes a serem vendidos e outras informações referentes a uma “serventia” de um prato do restaurante.

- **Tíquete:** espécie de ingresso/passe virtual para uma refeição, isto é, uma autorização que fica armazenada no servidor utilizada para a entrada no restaurante universitário para uma refeição a ser servida.

# Requisitos funcionais

### Manutenção de usuários

- R1.1 — O sistema deve ser capaz de distinguir usuários em duas categorias: cliente e administrador.
- R1.2 — O sistema deve permitir a autenticação de um usuário por um CPF e senha.

### Informar refeições

- R2.1 — O software deve ser capaz de permitir o usuário administrador inserir uma refeição que será oferecida pelo restaurante.
- R2.2 — A refeição deverá conter os seguintes atributos: data de serventia, quantidade de tíquetes totais para compra disponíveis, tipo de refeição, nome da refeição, prato principal, alimentos de base, guarnição, saladas, bebida e sobremesa.
- R2.3 — O software deve ser capaz de permitir que os clientes visualizem o calendário de refeições da semana atual e da seguinte, exibindo o nome das refeições servidas.
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
