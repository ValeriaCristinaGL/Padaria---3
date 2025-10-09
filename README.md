
## 🎓 Padrões de Projeto — Decorator

**Disciplina:** Padrões de Projeto  
**Autores:** Valéria Cristina e Pedro Victor

**Ferramenta de apoio:** Microsoft Copilot  
**IDE utilizada:** IntelliJ IDEA

---

## 🍰 Questão 3 — Padaria (Decorator)

### 🎯 Objetivo da atividade
Aplicar o padrão de projeto **Decorator** para permitir que bolos sejam personalizados com múltiplas camadas, granulados e dizeres, de forma flexível e escalável.

---

### ❓ Problemática
Na versão inicial do sistema, os bolos eram fixos e não permitiam personalizações dinâmicas. Cada variação exigiria uma nova classe, o que tornaria o sistema rígido e difícil de manter.

---

### 🧠 Padrão utilizado: Decorator
O padrão **Decorator** permite adicionar funcionalidades a um objeto de forma dinâmica, sem alterar sua estrutura original. Ele é ideal para cenários onde múltiplas combinações de comportamentos são necessárias.

**Como resolve o problema:**
- Permite compor bolos com diferentes características sem criar subclasses para cada combinação.
- Cada decorador adiciona uma funcionalidade (ex: camada extra, granulado, dizer).
- Os decoradores podem ser encadeados, criando bolos altamente personalizados.

---

### 🧱 Estrutura do projeto

```
padaria/
├── src/
│   ├── Cake.java
│   ├── ChocolateCake.java
│   ├── VanillaCake.java
│   ├── StrawberryCake.java
│   ├── MultiLayeredDecorator.java
│   ├── SprinklesDecorator.java
│   ├── SayingDecorator.java
│   ├── Order.java
│   └── Main.java
├── README.md
└── PROMPTS.md
```

---

### 🧪 Exemplo de saída

```
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```
