## 📘 Registro de Uso da IA — Projeto Padaria

**Ferramenta utilizada:** Microsoft Copilot  
**Datas:** 07/10/2025 – 09/10/2025

---

### 🧠 Prompt 1

**Pergunta enviada:**

> "Estou fazendo um exercício para treinar o padrão de projeto decorator (em Java).  
> Eu tenho a classe abstrata Bolo, as classes concretas BoloDeChocolate, BoloDeBaunilha, e a classe Pedido que é responsável por registrar os bolos nos pedidos e exibir os bolos que estão contidos naquele pedido.  
> Altere o código para que um pedido possa conter esses bolos mais complexos usando o padrão Decorator:  
> ● Crie as seguintes classes de decorador necessárias:  
> ○ Para bolos de várias camadas, adicione $5 e imprima 'Multi-layered' na frente do nome.  
> ○ Para granulado, adicione $2 e imprima 'with sprinkles' no final do nome.  
> ○ Para um bolo com o dizer X, não adicione nada ao custo e imprima 'with saying "X"' no final do nome."

---

### ✅ Resumo da resposta da IA

- Criou uma estrutura com a classe abstrata `Cake` e bolos concretos como `VanillaCake`, `ChocolateCake`.
- Implementou decoradores: `MultiLayeredDecorator`, `SprinklesDecorator`, `SayingDecorator`.
- Cada decorador sobrescreve `getDescription()` e `getCost()` para aplicar modificações.
- Gerou uma simulação na classe `Main` com exemplos de bolos decorados.

---

### 🔧 Ajustes realizados por mim
## 🛠️ Ajustes realizados sobre a solução da IA — Projeto Padaria

| Nº | Ajuste | O que a IA fez | Por que não serviu totalmente | Por que meu ajuste melhora a solução |
|----|--------|----------------|-------------------------------|--------------------------------------|
| 1 | ❌ Criação da classe abstrata `CakeDecorator` | Criou uma classe abstrata intermediária chamada `CakeDecorator`, que estendia `Cake` e servia como base para os decoradores. | O projeto é simples e não exige uma hierarquia adicional. A criação dessa classe não traz benefícios práticos e adiciona complexidade desnecessária. | Remover essa abstração torna o código mais direto e fácil de entender. Os decoradores podem estender `Cake` diretamente, mantendo o padrão Decorator funcional e enxuto. |
| 2 | ❌ Uso de `double` em `getCost()` | Definiu o método `getCost()` com tipo de retorno `double`. | O código base do professor utiliza `int` como tipo de retorno. Isso gerou erros de compilação e inconsistência entre as classes. | Alterar para `int` mantém compatibilidade com o código original, evita erros e simplifica o tratamento dos valores monetários, já que não há necessidade de casas decimais. |
| 3 | ❌ Ausência do atributo `baseCake` nos decoradores | Nos decoradores (`SprinklesDecorator`, `SayingDecorator`, etc.), não incluiu o atributo que referencia o bolo base. | Sem esse atributo, os decoradores não conseguem acessar o bolo original para aplicar modificações encadeadas, quebrando o padrão Decorator. | Adicionei `private final Cake baseCake` em cada decorador, permitindo que eles envolvam o bolo original corretamente. Isso viabiliza a composição dinâmica de múltiplos decoradores. |
| 4 | ❌ Nomes de classes e métodos em português | Gerou nomes como `Bolo`, `getPreco`, `getDescricao`. | O código base do professor está em inglês. Misturar idiomas prejudica a legibilidade e a padronização do projeto. | Renomeei para `Cake`, `getCost`, `getDescription`, mantendo consistência com o código original e com boas práticas de nomenclatura em Java. |
| 5 | ❌ Custo incorreto do `StrawberryCake` | Definiu o custo do `StrawberryCake` como 10, igual aos outros bolos. | A saída esperada da atividade exige que o bolo decorado tenha custo total de 29. Com custo base de 10, o resultado não bate. | Ajustei o custo do `StrawberryCake` para 20, garantindo que a composição com os decoradores resulte exatamente no valor esperado pelo professor. |


---

### 🧪 Resultado final

A simulação na classe `Main` gera a saída esperada:

```
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```

---

### 📜 Histórico de Commits

| Commit                                                               | Descrição                                                             |
|----------------------------------------------------------------------|-----------------------------------------------------------------------|
| `adiciona código base fornecido pelo professor`                      | Ponto de partida do projeto com estrutura original                    |
| `feat: Adiciona classe para tratar bolos multi-camadas`              | Implementa `MultiLayeredDecorator` conforme especificação             |
| `feat: Adiciona classe para tratar montagem personalizada do bolo`   | Cria decoradores para dizeres e granulados                            |
| `feat: Adiciona classe para montar bolo conforme escolha do usuário` | Permite compor bolos decorados dinamicamente                          |
| `chore: padroniza nomes das classes conforme escopo do exercício`    | Renomeia classes e métodos para manter consistência com o código base |
| `feat: Adiciona decorator baseCake para aplicar padrão Decorator`    | Adiciona atributo `baseCake` nos decoradores                          |
| `fix: Ajusta construtores dos decorators para inicializar baseCake`  | Corrige erro de compilação por falta de inicialização                 |
| `fix: Corrige incompatibilidade no getCost entre classes`            | Altera tipo de retorno para `int` conforme estrutura original         |
| `feat: Adiciona classe para representar bolo de morango`             | Cria `StrawberryCake` com custo ajustado para gerar saída esperada    |
| `refactor: Ajusta Main para montar bolo conforme saída esperada`     | Modifica simulação para refletir o bolo decorado exigido              |
| `docs: Adiciona README.md`                                           | Documentação com explicações sobre o padrão e estrutura do projeto    |
| `docs: Adiciona documentação sobre uso da IA`                        | Documentação explicando ajustes, prompts e justificativas.            |

---
