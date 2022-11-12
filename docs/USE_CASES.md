# Caso de uso: 
Autenticar um usuário.

## Ator: 
Usuário (iniciador).

## Finalidade: 
Permitir que o usuário utilize as funcionalidades do software.

## Tipo: 
Secundário, essencial.

## Descrição: 
Um usuário deseja utilizar o software, para isso ele inicializa o software, fornece suas informações de autenticação e espera até que os dados sejam autentificados.

## Referências cruzadas: 
R.1.2, R.1.3.

## Sequência típica:
1. Iniciado quando o usuário inicializa o software
2. O usuário insere o seu CPF e a sua senha
3. O software busca usuário com o mesmo CPF e senha informados.
4. O software libera somente as operações reservadas ao tipo de usuário encontrado (administrador ou usuário não adminitrador).
5. O usuário continua a utilizar o software.

## Sequência alternativa:
Linha 3: O login e senha informados não foram encontrados. O software deve exibir uma mensagem de erro informando que os dados inseridos estão incorretos e impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado.


# Caso de uso: 
Adicionar um novo usuário não administrador.

## Ator: 
Usuário não administrador (iniciador).

## Finalidade: 
Permitir que o usuário possa ser autenticado e utilizar o software.

## Tipo: 
Secundário, essencial.

## Descrição: 
Um usuário deseja ser cadastrado para utilizar o sistema de refeições, para isso o usuário fornece seu CPF e sua senha e espera até que sistema retorne que o usuário foi criado.

## Referências cruzadas: 
R.1.1

## Sequência típica:
1. Iniciado quando o usuário deseja adicionar uma conta no software.
2. O usuário insere o seu CPF e senha para cadastro.
3. O software verifica se um usuário com o mesmo CPF existe.
4. O software cria um novo usuário com CPF e senha informados, com o saldo de créditos zerados.
5. O software libera somente as operações reservadas ao tipo de usuário comum.
6. O usuário continua a utilizar o software.

## Sequência alternativa:
Linha 3: O CPF informado já está no sistema. O software deve exibir uma mensagem de erro informando que o CPF já foi cadastrado e deve impedir o acesso as outras funcionalidades do software, até que o usuário seja autenticado ou cadastrado.


# Caso de uso:
Inserir nova refeição.

## Ator:
Administrador (iniciador).

## Finalidade:
Permitir que o administrador insira uma nova refeição para uma data específica.

## Tipo: 
Primário, essencial.

## Descrição:
Um administrador precisa adicionar uma nova refeição para uma data específica, assim, o administrador deverá criar uma nova refeição e informar a data de serventia, a quantidade de tíquetes as informações da refeição.

## Referências cruzadas:
R.2.1, R.2.2

#Sequência típica:
1. Iniciado quando um administrador precisa inserir a refeição de uma determinada data.
2. O administrador autenticado acessa a função de nova refeição e informa os dados da refeição (data de serviço, tipo, número de tíquetes disponíveis, ).
3. O software registra os dados da refeição e torna disponível a venda de tíquetes para a nova refeição.
4. O software informa que a nova refeição foi criada.
5. O administrador continua a utilizar o sofware.


