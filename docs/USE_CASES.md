# Documento de Casos de Uso

## Caso de uso: Autenticar um usuário

**Ator:** Usuário (iniciador).

**Finalidade:** Permitir que o usuário utilize as funcionalidades do software.

**Tipo:** Secundário, essencial.

**Descrição:** Um usuário deseja utilizar o software, para isso ele inicializa o software, fornece suas informações de autenticação e espera até que os dados sejam autentificados.

**Referências cruzadas:** R.1.2, R.1.3.

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando o usuário inicializa o software| |
|2. O usuário insere o seu CPF e a sua senha|3. O software busca usuário com o mesmo CPF e senha informados.|
| |4. O software libera somente as operações reservadas ao tipo de usuário encontrado (administrador ou usuário não administrador).|
|5. O usuário recebe a autorização para utilizar as funções do software.| |

**Sequência alternativa:**: Linha 3: O CPF informado não foi encontrado. O software deve exibir uma mensagem de erro informando que os usuário não existe e impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado.
**Sequência alternativa:**: Linha 3: A senha informada não corresponde a senha associado ao CPF cadastrado. O software deve exibir uma mensagem de erro informando que a senha inserida está incorretos e impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado.

## Caso de uso: Adicionar um novo usuário não administrador

**Ator:** Usuário não administrador (iniciador).

**Finalidade:** Permitir que o usuário crie uma conta no sistema e insira seus dados.

**Tipo:** Secundário, essencial.

**Descrição:** Um usuário deseja ser cadastrado para utilizar o sistema de refeições, para isso o usuário fornece seu CPF e sua senha e espera até que sistema retorne que o usuário foi criado.

**Referências cruzadas:** R.1.1

**Sequência típica:**:
| Ator | Sistema |
|--------|------|
|1. Iniciado quando o usuário deseja adicionar uma conta no software.| |
|2. O usuário insere o seu CPF e senha para cadastro.|3. O software verifica se um usuário com o mesmo CPF existe.|4. O software cria um novo usuário com CPF e senha informados, com o saldo de créditos zerados.|
| |4. O software libera somente as operações reservadas ao tipo de usuário comum.|
|5. O usuário recebe a autorização para utilizar as funções do software.| |

**Sequência alternativa:**: Linha 3: O CPF informado já está no sistema. O software deve exibir uma mensagem de erro informando que o CPF já foi cadastrado e deve impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado ou cadastrado.

## Caso de uso: Inserir créditos a um usuário

**Ator:**: Administrador (iniciador), usuário.

**Finalidade:**: Permitir que o administrador insira créditos a um usuário específico.

**Tipo:** Primário, essencial.

**Descrição:**: Um usuário deseja inserir créditos em sua conta. Assim, o usuário deverá pagar um administrador a quantia em dinheiro correspondente ao valor em créditos no qual o usuário deseja inserir em sua conta. Em seguida, o administrador deverá inserir a quantia de créditos correspondente na conta do usuário.

**Referências cruzadas:**: R.3.1, R.3.2

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando um administrador precisa adicionar créditos a um usuário.| |
|2. O administrador autenticado insere o CPF do usuário e o valor em reais da quantia de créditos no qual deve ser inserida.|3. O sistema busca o usuário pelo CPF informado e adiciona a quantidade de créditos informado no saldo do usuário.|
| |4. O sistema armazena a data de inserção, quantidade de créditos inserida, usuário beneficiado e o administrador da transação em um arquivo de log.|

**Sequência alternativa:**: Linha 3: O usuário com o CPF informado não está no sistema. O software deve exibir uma mensagem de erro informando que usuário não existe e deve cancelar a inserção de créditos.

## Caso de uso: Inserir nova refeição

**Ator:**: Administrador (iniciador).

**Finalidade:**: Permitir que o administrador insira uma nova refeição para uma data específica.

**Tipo:** Primário, essencial.

**Descrição:**: Um administrador precisa adicionar uma nova refeição para uma data específica, assim, o administrador deverá criar uma nova refeição e informar a data de serventia, a quantidade de tíquetes as informações da refeição.

**Referências cruzadas:**: R.2.1, R.2.2

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando um administrador precisa inserir a refeição de uma determinada data.| |
|2. O administrador autenticado acessa a função de nova refeição e informa os dados da refeição (data de serventia, quantidade de tíquetes totais para compra disponíveis, tipo de refeição, nome da refeição, prato principal, alimentos de base, guarnição, saladas, bebida e sobremesa).|3. O software registra os dados da refeição e torna disponível a venda de tíquetes para a nova refeição.|
| |4. O software informa ao administrador de que a nova refeição foi criada.|

## Caso de uso: Comprar tíquetes da refeição

**Ator:** Usuário (iniciador).

**Finalidade:** Permitir que o usuário adquira uma refeição de uma data específica.

**Tipo:** Primário, essencial.

**Descrição:** Um usuário deseja adquirir uma refeição de um dia específico. Desse modo, o usuário deverá comprar um tíquete da refeição no qual ele deseja, utilizando os créditos de sua conta.

**Referências cruzadas:** R.4.1, R.4.2, R.4.3, R.4.4, R.4.5, R.4.6, R.4.7, R.4.8.

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando um usuário deseja adquirir a refeição de uma determinada data.| |
|2. O usuário autenticado acessa a função de compra de tíquetes e informa o nome e a data da refeição na qual ele deseja adquirir.|3. O software busca a refeição com o dia e nome informados, verifica se o usuário possui créditos suficientes para comprar o tíquete, se ainda há tíquetes disponíveis para aquela refeição e se o usuário não possui um tíquete para a aquela mesma refeição.|
| |4. O software associa o tíquete ao usuário, desconta o valor do tíquete do saldo do usuário e reduz o número de tíquetes disponíveis em 1 unidade.|

**Sequência alternativa:** Linha 3: O usuário não possui créditos suficientes para comprar o tíquete da refeição. O software deve cancelar a compra e exibir uma mensagem de erro informando que o usuário não possui créditos suficientes para realizar a compra.
**Sequência alternativa:** Linha 3: A refeição não possui tíquetes disponíveis. O software deve deve cancelar a compra e exibir uma mensagem de erro informando que todos os tíquetes da refeição foram comprados.
**Sequência alternativa:** Linha 3: O usuário já possui um tíquete para a refeição informada. O software deve cancelar a compra e exibir uma mensagem de erro informando que o usuário não pode comprar mais do que 1 tíquete para a mesma refeição.

## Caso de uso: Entrada de clientes

**Ator:** Usuário (iniciador).

**Finalidade:** Permitir que os usuários entrem no restaurante universitário.

**Tipo:** Primário, essencial.

**Descrição:** Um usuário deseja entrar no restaurante universitário a fim de fazer sua refeição. Desse modo, o usuário que possua um tíquete para a refeição do dia deve utilizar o software e requisitar o destravamento da catraca.

**Referências cruzadas:** R.5.1, R.5.2, R.5.3, R.5.4, R.5.5, R.5.6.

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando um usuário deseja entrar no restaurante.| |
|2. O usuário insere seu CPF na catraca.|3. O software busca o usuário com o mesmo CPF informado e verifica se o usuário possui um tíquete para a refeição do dia.|
| |4. O software destrava a catraca.|
| |5. A catraca é travada após o usuário passar pela mesma.|

## Caso de uso: Exibir refeições da semana

**Ator:** usuário (iniciador).

**Finalidade:** Permitir que o usuário visualize as refeições da semana.

**Tipo:** Primário, essencial.

**Descrição:** Um usuário deseja visualizar as refeições da semana atual ou semana seguinte. Assim, o usuário irá requisitar ao software a exibição das refeições da semana atual e seguinte.

**Referências cruzadas:**: R.2.3, R.2.4

**Sequência típica:**
| Ator | Sistema |
|--------|------|
|1. Iniciado quando um usuário deseja visualizar as próximas refeições.| |
|2. O usuário requisita ao software a exibição das próximas refeições.|3. O software exibe o nome de todas as refeições existentes na semana atual e na semana seguinte e também exibe todos os dados correspondente a cada refeição exibida, i.e., data de serventia, quantidade de tíquetes totais para compra disponíveis, tipo de refeição, nome da refeição, prato principal, alimentos de base, guarnição, saladas, bebida e sobremesa. |
|4. O usuário visualiza as próximas refeições. | |
