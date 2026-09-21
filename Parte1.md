# Exercício: Implementando a classe Treinador

## Objetivo
Nessa primeira parte do Execício tive como objetivo fixar a ideia de implementação da classe Treinador.

## Especificação da Classe `Treinador`
Abaixo esta a estrutura UML que usei pra criar a Classe Treinador.

### Atributos

| Atributo | Tipo | Descrição |
| :--- | :--- | :--- |
| `nome` | `String` | O nome do treinador (**obrigatório**). |
| `x` | `int` | A posição do treinador no eixo X do mapa. |
| `y` | `int` | A posição do treinador no eixo Y do mapa. |
| `pokemons` | `Pokemon[]` | Vetor para armazenar os Pokémon do treinador. |

---

### Métodos

| Método | Retorno | Descrição |
| :--- | :--- | :--- |
| `mover(String direcao)` | `void` | Atualiza as coordenadas do treinador internamente com base na direção passada como parâmetro (ex: `"cima"`, `"baixo"`, `"esquerda"`, `"direita"`). |
| `listar()` | `void` | Imprime os Pokémon que o treinador possui no console. |
| `capturar(Pokemon p)` | `boolean` | Adiciona o Pokémon no vetor de Pokémon caso haja espaço disponível e retorna se a captura foi bem-sucedida. |
