# Análise

## Documento de Requisitos

- R1.1 --> Armazerna-se dados dos usuários, não sobre eles. Dos tipos de usuário, não faz sentido ser um atributo, o ideial seria existir dois tipos classe usuário diferentes, um apenas executa mais funç~eos que oturo.
- R1.3 --> Aqui deveria estar escrito como "o CPF do usuário" e não "um", dá a entender que é um qualquer. Além disso, somente um usuário pode ter tal CPF?


## Casos de Uso

#### 1 - Autenticar Usuário

Alguns erros simples de digitação, já foram corrigidos.

|Defeito | Tipo | Descrição|
|--------|------|----------|
|01      |IE    |Evento 5: está um pouco estra a palavra "continuar" no contexto, apesar de fazer sentido. Seria melhor colocar: "O usuário é autorizado a acessar as funções do software."|
|02      |O     |Evento 3: e se apenas a senha estiver incorreta? O que acontece?

### 2 - Adicionar um novo usuário não administrador

|Defeito | Tipo | Descrição|
|--------|------|----------|
|01      |IE    |A descrição da Finalidade está um pouco estranha. Dá a entender que será feita uma autenticação do usuário que já existe e não o cadastro de um novo.|

### 3 - Inserir nova Refeição

|Defeito | Tipo | Descrição|
|--------|------|----------|
|01      |O     |Evento 2: Falta informações dos atributos da refeição.|
|02      |FI    |Evento 5: não faz sentido ser um evento o administrado continuar utiliziando o software.|
|03      |IE    |Evento 4: o sistema informar sobre a nova refeição, seria uma notificação a todos os usuários do sistema?|
