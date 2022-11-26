# Caso de uso: Autenticar um usuário.

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
| |3. O software libera somente as operações reservadas ao tipo de usuário encontrado (administrador ou usuário não administrador).|
|4. O usuário recebe a autorização para utilizar as funções do software.| |

**Sequência alternativa:**: Linha 3: O CPF informado não foi encontrado. O software deve exibir uma mensagem de erro informando que os usuário não existe e impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado.
**Sequência alternativa:**: Linha 3: A senha informada não corresponde a senha associado ao CPF cadastrado. O software deve exibir uma mensagem de erro informando que a senha inserida está incorretos e impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado.


# Caso de uso: Adicionar um novo usuário não administrador.

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
| |3. O software libera somente as operações reservadas ao tipo de usuário comum.|
|4. O usuário recebe a autorização para utilizar as funções do software.| |

**Sequência alternativa:**: Linha 3: O CPF informado já está no sistema. O software deve exibir uma mensagem de erro informando que o CPF já foi cadastrado e deve impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado ou cadastrado.


# Caso de uso: Inserir nova refeição.

**Ator:**: Administrador (iniciador).

**Finalidade:**: Permitir que o administrador insira uma nova refeição para uma data específica.

**Tipo:** Primário, essencial.

**Descrição:**: Um administrador precisa adicionar uma nova refeição para uma data específica, assim, o administrador deverá criar uma nova refeição e informar a data de serventia, a quantidade de tíquetes as informações da refeição.

**Referências cruzadas:**: R.2.1, R.2.2

**Sequência típica:**
| Ator | Sistema | 
|--------|------|
|1. Iniciado quando um administrador precisa inserir a refeição de uma determinada data.| |
|2. O administrador autenticado acessa a função de nova refeição e informa os dados da refeição (data de serventia, quantidade de tíquetes totais para compra disponíveis, tipo de refeição, nome da refeição, prato principal, alimentos de base, guarnição, saladas, bebida e sobremesa).| |
| |3. O software registra os dados da refeição e torna disponível a venda de tíquetes para a nova refeição.|
| |4. O software informa ao administrador de que a nova refeição foi criada.|
