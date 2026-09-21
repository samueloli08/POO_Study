# Exercício: Encapsulamento com as classes Mapa e Jogo

## 🎯 Objetivo
Fiz a fixação dos tópicos de encapsulamento nas classes `Mapa`, `Treinador` e `Jogo` para controlar o acesso aos atributos e métodos.

## 📝 Descrição
Neste exercício usei a estrutura UML abaixo como guia na criação do código;

## 🏗️ Especificação das Classes

### 🗺️ Classe `Mapa`

**Atributos:**
- `layout` (`char[][]`): Matriz bidimensional privada que armazena o mapa.
- `largura` (`final int`): Largura do mapa.
- `altura` (`final int`): Altura do mapa.

**Métodos:**
| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `Mapa(int largura, int altura)` | — | Construtor responsável por determinar as dimensões do mapa. |
| `inicializarMapa()` | `void` | Método privado para inicializar a matriz do mapa. |
| `exibirMapa(int x, int y)` | `void` | Exibe o mapa no console destacando a posição do treinador. Recebe como parâmetro a posição do treinador. Utilizado pela classe `Jogo`. |
| `posicaoValida(int x, int y)` | `boolean` | Determina se uma dada posição `(x, y)` é válida dentro dos limites do mapa. |

---

### 🧢 Classe `Treinador`

**Atributos:**
- `nome` (`String`): Nome do treinador (privado).
- `x` (`int`): Coordenada X no mapa (privada).
- `y` (`int`): Coordenada Y no mapa (privada).
- `pokemons` (`Pokemon[]`): Vetor para armazenar os Pokémon (privado).

**Métodos:**
| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `Treinador(String nome)` | — | Construtor da classe. |
| `getNome()` | `String` | Retorna o nome do treinador. |
| `getX()` | `int` | Retorna a posição X do treinador. |
| `getY()` | `int` | Retorna a posição Y do treinador. |
| `setPosicao(int x, int y)` | `void` | Atualiza a posição `(x, y)` do treinador no mapa. |
| `mover(String direcao)` | `void` | Atualiza a posição internamente com base na direção fornecida. |
| `listar()` | `void` | Imprime os Pokémon que o treinador possui. |
| `capturar(Pokemon p)` | `boolean` | Adiciona o Pokémon no vetor caso haja espaço. |

---

### 🎮 Classe `Jogo`

A classe `Jogo` é responsável por controlar a interação entre `Mapa` e `Treinador`, além de realizar a leitura dos dados enviados via entrada (console).

**Atributos:**
- `mapa` (`Mapa`): Instância do mapa do jogo.
- `treinador` (`Treinador`): Instância do treinador principal.

**Métodos:**
| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `Jogo(String nomeTreinador)` | — | Construtor que inicializa o jogo com o nome do treinador. |
| `iniciar()` | `void` | Executa o loop principal do jogo, processando as entradas do usuário, atualizando a posição do treinador e exibindo o mapa. |

---

### 👾 Classe `Pokemon`

**Atributos:**
- `nome` (`String`)
- `nivel` (`int`)

**Métodos:**
| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `Pokemon(String nome)` | — | Construtor da classe. |
| `getNome()` | `String` | Retorna o nome do Pokémon. |
| `getNivel()` | `int` | Retorna o nível do Pokémon. |
