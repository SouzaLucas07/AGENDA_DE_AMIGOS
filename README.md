#  Agenda de Amigos

Projeto acadêmico em Java que implementa uma agenda de contatos com interface gráfica. Permite cadastrar, buscar e listar amigos com dados completos, além de calcular quantos dias faltam ou já se passaram do aniversário de cada um.

## 📌 Objetivo

Criar uma aplicação orientada a objetos que simula uma agenda de amigos. O sistema permite armazenar e gerenciar informações como:

- Nome
- Celular
- E-mail
- Endereço completo (rua, número, complemento, cidade, estado, CEP)
- Data de nascimento

---

## 🧱 Estrutura do Projeto

O projeto é dividido em quatro classes principais:

| Classe           | Responsabilidade                                                                 |
|------------------|----------------------------------------------------------------------------------|
| `Agenda`         | Contém o método `main()` e o menu de interação com o usuário via `JOptionPane`   |
| `Amigo`          | Representa um amigo e seus dados pessoais                                        |
| `Endereco`       | Representa o endereço de um amigo                                                |
| `GerenciarAmigo` | Gerencia a lista de amigos e implementa as funcionalidades da agenda             |

---

## 🖥️ Funcionalidades

- ✅ Cadastrar novo amigo
- ✅ Buscar amigo pelo nome
- ✅ Listar aniversariantes de um mês específico
- ✅ Listar todos os amigos cadastrados
- ✅ Calcular dias para o próximo aniversário
- ✅ Interface gráfica com `JOptionPane`
- ✅ Validação de data de nascimento

---

## 📅 Validações implementadas

- **Dia:** entre 1 e 31  
- **Mês:** entre 1 e 12  
- **Ano:** menor que o ano atual  

Essas validações garantem que a data de nascimento inserida seja válida antes de criar o objeto `Amigo`.

---

## 🧪 Exemplo de uso

Ao executar o programa, o usuário verá o seguinte menu:
