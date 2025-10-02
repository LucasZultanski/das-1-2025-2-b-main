# DESIGN-E-ARQUITETURA-DE-SOFTWARE
Repositório da disciplina de Design e Arquitetura de Software (Univille/2025). Contém resumos, estudos e exercícios sobre princípios, padrões arquiteturais (camadas, MVC, microserviços), atributos de qualidade e boas práticas no desenvolvimento de software.

# Aula 00- 28/07/2025
## Anotações da Aula

- Disciplina voltada para **conceitos de design e arquitetura de software**.  
- Diferença em relação à Fábrica de Software: foco **teórico e conceitual**, não em projetos práticos.  
- Importância no mercado: escalabilidade, desempenho, manutenção e qualidade de sistemas.  
- Papel do arquiteto de software:  
  - Definir arquitetura.  
  - Orientar desenvolvedores.  
  - Evitar **débito técnico**.  

---

## Conceitos Iniciais
- **Débito Técnico** = consequências de decisões ruins → dificulta evolução e manutenção.  
- **Arquitetura em Camadas**: Entidades → Repositórios → Serviços → Controllers.  
- **MVC** (Model-View-Controller): separação entre dados, lógica e interface.  
- **Monólito x Microsserviços**: diferenças de estrutura e aplicação.  

---

## Materiais
- Livro gratuito: *Engenharia de Software Moderna* (Prof. Túlio – UFMG).  
- Livro da Biblioteca Virtual Univille: *Fundamentos de Arquitetura de Software* (2023/24).  

---

## Tarefas
1. Criar repositório no GitHub → `design-arquitetura-software`.  
2. Adicionar professor como colaborador.  
3. Registrar resumos e exercícios a cada aula.  

---

# Aula 01- 31/07/2025

Nesta aula, foram abordados conceitos fundamentais de arquitetura e desenvolvimento de software, focando em boas práticas para gerenciar a complexidade e criar sistemas robustos e flexíveis.


## Tópicos Principais

### Abstração: A Essência do Software
* O principal trabalho no desenvolvimento de software é a **abstração**: entender um problema do mundo real e representá-lo em código.
* Exemplos práticos do projeto anterior (Fábrica de Software) foram citados, como a criação de `Entidades` para representar dados, `Repositórios` para abstrair o acesso ao banco de dados, `Serviços` para a lógica de negócio e `Controladores` para expor a API.

---

### Complexidade: O Grande Inimigo
* O software tende a se tornar complexo porque os problemas que ele resolve são complexos.
* A complexidade aumenta a chance de erros, dificulta a manutenção e a colaboração.
* A **Orientação a Objetos (OO)** é a principal estratégia para gerenciar essa complexidade, permitindo decompor um problema grande em partes menores e mais gerenciáveis.

---

### Orientação a Objetos e Frameworks
* **Orientação a Objetos (OO):** É um paradigma essencial. O objetivo é aprender a modelar qualquer parte de um sistema (dados, lógica, interfaces) como objetos, que possuem atributos (informações) e métodos (ações).
* **Padrões de Código:** Adotar padrões de nomenclatura e estilo de código (ex: Camel Case em Java) é crucial para a legibilidade e manutenção do projeto.
* **Frameworks (`Spring Boot`, `ASP.NET`, etc.):** O uso de frameworks é uma boa prática para não "reinventar a roda". Eles fornecem uma estrutura testada e soluções para problemas comuns, permitindo que o desenvolvedor foque na lógica de negócio.

---

### Princípios de uma Boa Arquitetura

* **Ocultamento de Informação (Encapsulamento):**
    * Assim como não precisamos entender de eletrônica para usar um videogame, os componentes de um software devem esconder sua complexidade interna.
    * Isso é alcançado com o uso de **classes**, que expõem interfaces simples (`public`) e escondem os detalhes da implementação (`private`).

* **Baixo Acoplamento e Flexibilidade para Mudanças:**
    * Um dos objetivos mais importantes é criar um código **desacoplado**, onde as partes do sistema não dependem diretamente umas das outras.
    * Isso foi exemplificado pela arquitetura usada em Fábrica de Software: o `Controller` não conhece a implementação do `Service`, mas sim a sua **interface**.
    * Essa abordagem permite que a implementação (`ServiceImpl`) seja alterada ou substituída sem quebrar o código que a utiliza, tornando o sistema mais flexível e fácil de manter.

---

### Decisões Arquiteturais
* A escolha da tecnologia (linguagem, framework) é uma das decisões mais críticas e difíceis.
* Foi apresentado o conceito de **"Estradas Pavimentadas"** (usado por empresas como Netflix e Conta Azul): a empresa oferece um conjunto de tecnologias recomendadas e com suporte. As equipes têm autonomia para usar outras tecnologias, mas assumem a responsabilidade total por elas.

---



## Próximos Estudos
- Arquitetura de software e atributos de qualidade.  
- Capítulo 1 do livro *Engenharia de Software Moderna*. 

 
- Relacionar teoria com prática em **Java + Angular**.  

# Aula 02- 04/08/2025

A aula iniciou com uma revisão dos conceitos anteriores, como **ocultamento de informação**, a importância do desenvolvimento paralelo e a busca por flexibilidade e compreensibilidade no código através da **Orientação a Objetos (OO)**.

## Tópicos Principais

### Encapsulamento e Getters/Setters
* O encapsulamento é a técnica usada para implementar o ocultamento de informação na prática.
* `Getters` e `setters` são a manifestação desse princípio, protegendo os dados (`private`) de uma classe e controlando o acesso a eles.

---

### Coesão (Alta Coesão)
* **Definição:** É o princípio de que uma classe ou método deve ter uma **única responsabilidade** bem definida. O objetivo é criar componentes que fazem uma coisa só, e a fazem bem.
* **Benefícios:** Um código com alta coesão é mais fácil de entender, testar e manter. Evita a criação de classes "faz-tudo" que se tornam difíceis de gerenciar com o tempo.

---

### Acoplamento (Baixo Acoplamento)
* **Definição:** Refere-se ao nível de dependência entre diferentes partes de um sistema. O ideal é ter um **baixo acoplamento**, onde a alteração em um componente não quebra outros.
* **Exemplos Práticos:**
    * **Forte Acoplamento:** Uma classe que instancia e chama métodos de outra classe diretamente.
    * **Baixo Acoplamento:** Utilizar **interfaces** para a comunicação. O código depende do "contrato" (a interface), e não da implementação concreta. Isso foi exemplificado com o uso de `@Autowired` no Spring e a abstração do banco de dados com o Spring Data JPA, que permite trocar a implementação sem quebrar o sistema.

---

### Introdução aos Princípios SOLID
* SOLID é um acrônimo para cinco princípios de design de software que ajudam a criar sistemas mais compreensíveis, flexíveis e manuteníveis.
* O primeiro princípio, **"S" - Single Responsibility Principle (Princípio da Responsabilidade Única)**, é a aplicação direta do conceito de **alta coesão**.

# Aula 03 - 07/08/2025
[Livro Código Limpo](https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0) 
[Padrões de Projeto](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0) 

```java
package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janelinha extends JFrame {

    private JButton botaozinho;
    private Controlador controlador;
    public Janelinha() {
        setTitle("Janelinha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        controlador = new Controlador();

        botaozinho = new JButton(" Me Clica ");
        botaozinho.addActionListener(controlador);
        botaozinho.addMouseMotionListener(controlador);
        add(botaozinho);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Janelinha();
    }
    
}
```

```java
package br.univille;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

public class Controlador 
    implements ActionListener, 
        MouseMotionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "EU NAO ACREDITO");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moveu" + " x:" + e.getX() + " y:" + e.getY());
    }
    
}
```
A aula iniciou com a revisão dos conceitos de **alta coesão** e **baixo acoplamento** como objetivos centrais na construção de software. O foco principal foi a introdução e o aprofundamento nos dois primeiros princípios do **SOLID**.

## Tópicos Principais

### Introdução ao SOLID
* SOLID é um acrônimo para cinco princípios de design para software orientado a objetos, popularizados por **Robert Martin (Uncle Bob)**.
* Seguir estes princípios ajuda a criar um código mais limpo, manutenível e flexível. Em resumo, é "programar orientado a objetos do jeito certo".

---

### S - Princípio da Responsabilidade Única (SRP)
* Este princípio é a aplicação direta do conceito de **alta coesão**.
* Afirma que uma classe deve ter apenas **um, e somente um, motivo para mudar**.
* A arquitetura em camadas utilizada anteriormente (`entity`, `service`, `controller`) é um exemplo prático, onde cada camada possui uma responsabilidade clara e única.

---

### I - Princípio da Segregação de Interfaces (ISP)
* O princípio defende que é melhor ter **várias interfaces pequenas e específicas** do que uma única interface grande e genérica.
* O objetivo é evitar que uma classe seja obrigada a implementar métodos que ela não utiliza.
* **Exemplo prático:** Em vez de uma única interface para todos os eventos de UI, foram usadas interfaces segregadas:
    * `ActionListener`: Exclusiva para tratar eventos de clique.
    * `MouseMotionListener`: Exclusiva para tratar eventos de movimento do mouse.

---

### Aplicando os Princípios em Conjunto
* Foi demonstrado que, embora o uso de interfaces separadas atendesse ao **ISP**, a classe da Janela (`JFrame`) passou a ter múltiplas responsabilidades (desenhar a tela e tratar a lógica dos eventos), violando o **SRP**.
* A solução foi refatorar o código, criando uma classe `Controlador` separada para conter a lógica e implementar as interfaces.
* **Resultado Final:**
    * A classe `Janelinha` ficou apenas com a responsabilidade de montar e exibir a interface.
    * A classe `Controlador` ficou com a responsabilidade de gerenciar a lógica dos eventos, respeitando ambos os princípios.

# Aula 4- 11/08/2025

Esta aula concluiu o estudo dos **Princípios SOLID**, focando nos três pilares restantes: Inversão de Dependência, Substituição de Liskov e o Princípio do Aberto/Fechado.

## Tópicos Principais

### D - Princípio da Inversão de Dependência (DIP)
* **Definição:** Componentes devem depender de **abstrações (interfaces)**, e não de implementações concretas.
* **Na prática:** Isso desacopla o código. Em vez de um `Controller` conhecer o `ServiceImpl`, ele conhece apenas a interface `Service`. A implementação real é "injetada" em tempo de execução (ex: via `@Autowired` no Spring), permitindo que ela seja trocada sem quebrar o `Controller`.

---

### L - Princípio da Substituição de Liskov (LSP)
* O tópico foi abordado sob a ótica de **"Prefira Composição à Herança"**.
* **Herança:** Deve ser usada com cautela. Ela cria um forte acoplamento e pode ser difícil de modelar em bancos de dados. Use-a apenas quando as subclasses são totalmente distintas (a analogia "gato e cachorro").
* **Composição/Associação:** É uma alternativa mais flexível, permitindo que objetos colaborem sem criar uma hierarquia rígida, resultando em um design mais robusto.

---

### O - Princípio do Aberto/Fechado (OCP)
* **Definição:** O software deve ser **aberto para extensão, mas fechado para modificação**.
* **Na prática:** É possível adicionar novas funcionalidades a uma classe sem alterar seu código-fonte.
* **Exemplo:** A customização de um `JTable` foi usada para ilustrar o conceito. Não modificamos a classe `JTable`. Em vez disso, **estendemos** seu comportamento ao fornecer uma implementação de `AbstractTableModel`, adicionando a lógica de exibição de dados de forma segura e desacoplada.

# Aula 5- 14/08/2025
[Livro Padrões de Projeto](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0)

[Livro Engenharia de Software - Padrões de Projeto](https://engsoftmoderna.info/cap6.html)

[Padrões de Projeto Guru](https://refactoring.guru/design-patterns)

Esta aula concluiu o estudo dos **Princípios SOLID**, com foco no último princípio: a Substituição de Liskov.

## Tópicos Principais

### Revisão dos Princípios Anteriores
* A aula começou com uma rápida recapitulação dos princípios já vistos:
    * **Inversão de Dependência (DIP):** Depender de abstrações (interfaces).
    * **Composição sobre Herança:** Dar preferência a associações em vez de herança.
    * **Lei de Demeter (LoD):** Limitar o conhecimento que um objeto tem sobre outros.
    * **Aberto/Fechado (OCP):** Ser aberto para extensão, mas fechado para modificação.

---

### L - Princípio da Substituição de Liskov (LSP)
* **Definição:** Este é o último princípio do acrônimo SOLID. Ele estabelece que objetos de uma superclasse devem ser substituíveis por objetos de suas subclasses sem afetar a integridade do programa.
* **Na prática:** As classes filhas devem honrar o contrato estabelecido pela classe pai, mantendo a assinatura e o comportamento esperado dos métodos herdados. Isso garante que diferentes implementações de uma mesma abstração sejam intercambiáveis.
* **Exemplo Prático (Java Swing):**
    * Um `JPanel` foi criado para receber uma borda.
    * Primeiro, foi aplicada uma `LineBorder`. O programa funcionou.
    * Em seguida, a `LineBorder` foi substituída por uma `TitledBorder`. O programa continuou funcionando sem nenhuma alteração.
    * **Conclusão:** Isso foi possível porque tanto `LineBorder` quanto `TitledBorder` herdam da mesma classe base (`AbstractBorder`) e respeitam seu contrato. Elas são, portanto, substituíveis entre si, demonstrando o LSP na prática.

---

### Conclusão sobre SOLID
* Com a exploração do LSP, finalizamos o estudo dos cinco princípios SOLID. Uma arquitetura de software robusta e manutenível deve se esforçar para aplicar esses conceitos.

# Aula 6- 18/08/2025

Após uma breve revisão do Princípio da Substituição de Liskov (LSP), a aula introduziu o conceito de **Padrões de Projeto (Design Patterns)** e implementou o primeiro deles: o Singleton.

## Tópicos Principais

### Introdução aos Padrões de Projeto
* **Definição:** São soluções padronizadas para problemas recorrentes no design de software orientado a objetos.
* **Objetivo:** Reutilizar soluções comprovadas para aumentar a flexibilidade e a manutenibilidade do código.
* **Categorias:** Criacionais, Estruturais e Comportamentais.

---

### Padrão Criacional: Singleton
* **Intenção:** Garantir que uma classe tenha **uma, e somente uma, instância**, e fornecer um ponto de acesso global para ela.

* **Implementação Chave:**
    * **Construtor Privado:** `private Singleton()`
        * Impede a instanciação da classe através do operador `new` por qualquer código externo.
    * **Instância Estática Privada:** `private static Singleton instance;`
        * Cria uma única variável que pertence à classe em si, não a um objeto individual. É o "recipiente" para a instância única.
    * **Método de Acesso Estático Público:** `public static Singleton getInstance()`
        * É a única forma de obter a instância da classe.
        * Na primeira chamada, ele cria o objeto (`new Singleton()`) e o armazena na variável estática.
        * Nas chamadas seguintes, ele simplesmente retorna a instância já criada, garantindo que ela seja sempre a mesma.

* **Uso e Advertência:**
    * O Singleton é útil para gerenciar recursos compartilhados (ex: configurações, pools de conexão).
    * No entanto, é frequentemente considerado um **anti-padrão**, pois cria um estado global que pode levar a um alto acoplamento no sistema e dificultar a realização de testes unitários. Deve ser usado com moderação.

# Aula 7- 21/08/2025
[Observer](https://refactoring.guru/design-patterns/observer)

Esta aula consistiu em uma revisão prática e aprofundada do padrão **Singleton**, incluindo uma sessão de debugging para visualizar seu funcionamento, e a introdução de um novo desafio de implementação.

## Tópicos Principais

### Revisão e Analogia do Padrão Singleton
* **Objetivo Principal:** Garantir que uma classe possua apenas **uma instância** em toda a aplicação.
* **Analogia "Ender Chest":** O Singleton foi comparado a um "Ender Chest" do Minecraft. 
<img width="360" height="360" alt="image" src="https://github.com/user-attachments/assets/c826b50e-e339-4c51-a353-ae5bf41e5b89" />

Não importa onde você o acesse no sistema, você sempre estará interagindo com o mesmo objeto e os mesmos dados.
* **Pilares da Implementação:**
    * `private constructor()`: Bloqueia a criação de instâncias externas.
    * `private static Singleton instance`: Uma variável estática para guardar a única instância.
    * `public static getInstance()`: Método de acesso que cria a instância apenas na primeira vez e a retorna em todas as chamadas subsequentes.

---

### Demonstração Prática e Debugging
* Para dar um propósito ao Singleton, uma variável `segredo` foi adicionada para guardar uma informação.
* Uma classe `Cliente` demonstrou o fluxo de uso:
    1.  Obter a instância com `Singleton.getInstance()`.
    2.  Salvar uma informação: `singleton.setSegredo(...)`.
    3.  Em outro ponto do sistema, obter a instância novamente e recuperar a informação: `Singleton.getInstance().getSegredo()`.
* Foi realizada uma sessão de **debugging** para executar o código passo a passo, mostrando como as variáveis são preenchidas na memória e provando que a instância do Singleton e a informação guardada nela permanecem as mesmas durante a execução.

---

### Novo Desafio: O Padrão Observer
* A próxima tarefa para a turma é implementar o padrão de projeto **Observer** de forma autônoma.
* O objetivo é praticar a habilidade de analisar um diagrama UML de um padrão e traduzir sua estrutura e lógica para código funcional.

# Aula 8- 25/08/2025
[Padrões de Projeto Guru - Implementação Observer](https://refactoring.guru/design-patterns/observer)

A aula foi focada na implementação do padrão **Observer** a partir de seu diagrama UML, seguida por uma introdução ao padrão **Adapter**.

## Tópicos Principais

### Padrão Comportamental: Observer (Publisher-Subscriber)
* **Intenção:** Definir uma relação de dependência um-para-muitos, onde múltiplos objetos `Subscribers` são notificados sobre qualquer mudança de estado que ocorra em um objeto `Publisher`.
* **Analogia:** Um grupo de WhatsApp, onde o grupo é o `Publisher` e os participantes são os `Subscribers`.

* **Estrutura da Implementação:**
    * **`Subscriber` (Interface):** Define o contrato com um método `update()`, que será chamado para notificar o assinante.
    * **`ConcreteSubscriber` (Classe Concreta):** Implementa a interface `Subscriber` e define a ação a ser executada ao receber a notificação.
    * **`Publisher` (Classe Concreta):**
        * Mantém uma `List<Subscriber>` para registrar todos os assinantes. O uso da interface na lista promove baixo acoplamento.
        * Método `subscribe()`: Adiciona um novo assinante à lista.
        * Método `notifySubscribers()`: Percorre a lista de assinantes e invoca o método `update()` de cada um.
    * **`Cliente`:** Orquestra o cenário, criando o publicador, os assinantes, registrando-os e disparando a notificação.

---

### Introdução ao Padrão Estrutural: Adapter
* **Intenção:** Atua como um "tradutor" que permite a colaboração entre objetos com interfaces incompatíveis.
* **Exemplo Moderno:** Um **API Gateway** pode funcionar como um Adapter, convertendo requisições de um formato (ex: XML) para outro (ex: JSON) para integrar sistemas legados com APIs modernas. **Kong** foi mencionado como um exemplo de tecnologia que implementa este padrão.

# Aula 9- 28/08/2025
[Fundamentos da Arquitetura de Software - Introdução](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/18[%3Bvnd.vst.idref%3Dcap1.xhtml]!/4)

Esta aula iniciou uma nova fase da disciplina, movendo o foco do nível do código para uma visão mais ampla sobre como definir uma arquitetura de software. Foram apresentados os três pilares que guiam este processo.

## Tópicos Principais

### Pilar 1: Características da Arquitetura (Requisitos Não Funcionais)
* **Definição:** São os atributos de qualidade que um sistema deve ter, como desempenho, segurança e escalabilidade. São equivalentes aos **requisitos não funcionais**.
* **Trade-offs:** Um sistema não pode ser perfeito em todas as características. É papel do arquiteto priorizar as mais importantes para o projeto, fazendo concessões (*trade-offs*).
* **Exemplo - Segurança:** Foi discutido o desafio da **segurança na cadeia de suprimentos de software (supply chain)**, que é a dependência de bibliotecas de código aberto que podem conter vulnerabilidades.

---

### Pilar 2: Decisões de Arquitetura
* **Definição:** É o processo de escolher a estrutura fundamental do sistema (ex: arquitetura em camadas, microsserviços) e as tecnologias a serem usadas.
* **Influência:** Essas decisões são fortemente influenciadas pela experiência e conhecimento da equipe, que tende a optar por tecnologias que já domina para ser mais produtiva.

---

### Pilar 3: Princípios de Design
* **Definição:** São as diretrizes que governam a implementação da arquitetura, garantindo que as decisões e características sejam respeitadas.
* **Exemplo com Microsserviços:**
    * **Decisão:** Usar microsserviços.
    * **Característica:** Baixo acoplamento.
    * **Princípio de Design:** Para manter o baixo acoplamento, os microsserviços não devem compartilhar o mesmo banco de dados. Em vez disso, devem usar **comunicação assíncrona** (um sistema de mensagens, aplicando o padrão Observer em nível de arquitetura), onde um serviço publica um evento e outros o consomem de forma independente.

# Aula 10- 01/09/2025
[Fundamentos da Arquitetura de Software - Introdução](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/18[%3Bvnd.vst.idref%3Dcap1.xhtml]!/4)

A aula abordou as expectativas sobre o papel do arquiteto de software e introduziu o conceito fundamental de DevOps, após uma breve revisão dos três pilares da arquitetura.

## Tópicos Principais

### Revisão dos Pilares da Arquitetura
* **Características:** São os requisitos não funcionais (segurança, desempenho, etc.). Exigem *trade-offs*, pois é impossível otimizar todos ao mesmo tempo.
* **Decisões:** A escolha do estilo arquitetural (monólito, microsserviços) e das tecnologias.
* **Princípios:** As regras que garantem a integridade da arquitetura escolhida ao longo do tempo.

---

### O Papel do Arquiteto de Software
* **Responsabilidades:** O arquiteto é responsável por tomar as decisões tecnológicas difíceis, analisar continuamente a arquitetura para mantê-la relevante, e orientar a equipe de desenvolvimento.
* **Habilidades:** Além do conhecimento técnico, precisa ter uma boa visão de negócio para traduzir requisitos em soluções, e habilidades interpessoais para liderar, negociar e trabalhar em equipe.

---

### Introdução ao DevOps
* **Objetivo:** Uma filosofia e prática para **entregar valor ao cliente** de forma mais rápida e eficiente, unindo desenvolvimento (Dev) e operações (Ops).
* **Cultura vs. Cargo:** Pode ser uma **cultura**, onde toda a equipe é responsável pelo ciclo completo, ou um **cargo/equipe** especializada que gerencia a automação e a infraestrutura.
* **O Ciclo Infinito:** DevOps opera em um ciclo contínuo:
    * **Plan:** Planejar o trabalho.
    * **Code:** Desenvolver.
    * **Integrate (CI):** Integrar o código em um repositório central e testar automaticamente.
    * **Deploy (CD):** Implantar a aplicação de forma automatizada.
    * **Operate:** Monitorar a aplicação em produção.
    * **Feedback:** Coletar informações para o próximo ciclo de planejamento.

    [Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)
<img width="464" height="240" alt="image" src="https://github.com/user-attachments/assets/433193dc-3cb0-4298-97cc-4548e849a65e" />


# Aula 11 - 04/09/2025
[Fundamentos da Arquitetura de Software - Pensamento Arquitetônico](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4)

Nesta aula, foi feita uma revisão dos **três pilares da arquitetura de software** já discutidos:  
1. **Características (requisitos não funcionais).**  
2. **Decisões arquiteturais.**  
3. **Princípios de design (regras básicas para manter a arquitetura íntegra).**

## Tópicos Principais

- As **características da arquitetura** estão diretamente ligadas aos requisitos não funcionais (ex.: segurança, desempenho, escalabilidade).  
- O arquiteto, ao tomar decisões, deve escolher um estilo arquitetural adequado, como **microsserviços**, e definir as regras de design que guiarão a equipe.  
- Foi reforçada a importância de compreender a diferença entre **arquitetura** (decisões estruturais de alto nível) e **design** (detalhamento da implementação).  
- Foi introduzido o conceito de **modelo em T** para o conhecimento do arquiteto:  
  - **Parte horizontal do T:** conhecimento amplo em várias áreas.  
  - **Parte vertical do T:** conhecimento profundo em uma área específica.  
---
# Aula 12 - 08/09/2025  
[Fundamentos da Arquitetura de Software - Análise de Trade-offs](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4/2/58%5Bsigil_toc_id_24%5D/1:22%5B-of%2Cfs%5D)

Nesta aula foi concluído o módulo sobre **pensamento arquitetural**, com foco em **trade-offs (compensações)** e no uso de diferentes mecanismos de comunicação em arquiteturas de software.  

## Tópicos Principais  

### Conceito de Trade-off  
- Em arquitetura não existem soluções perfeitas; toda decisão envolve **ganhos e perdas**.  
- O papel do arquiteto é avaliar **benefícios x custos** de cada abordagem.  
- Exemplo: sistemas de leilão online (eBay/Mercado Livre) exigem escolhas que impactam **simplicidade, escalabilidade e performance**.  

---

### Modelos de Comunicação  

1. **Banco de Dados Centralizado**  
   - Simples de implementar (INSERT/SELECT).  
   - Não escala bem para sistemas globais de alta demanda.  
   - Possíveis soluções: réplicas de leitura, mas com problemas de **delay e sincronização**.  

2. **Tópicos (Publish/Subscribe)**  
   - Comunicação **um-para-muitos**.  
   - Exemplo prático: grupos de WhatsApp, notificações push (Amazon/Magalu).  
   - Implementações famosas: **Apache Kafka, RabbitMQ, AWS SNS, Azure Service Bus**.  
   - Vantagens: alta performance (em memória), desacoplamento, fácil extensibilidade.  
   - Desvantagens: mesma mensagem replicada para todos, risco de mensagens mais pesadas/caras.  

3. **Filas (Queue)**  
   - Comunicação **um-para-um** (sender → receiver).  
   - Mensagens são **armazenadas** e mantêm ordem (FIFO).  
   - Permite mensagens diferentes para cada serviço (mais acoplamento, mas maior especialização).  
   - Usado em **processos de e-commerce** (pedido → pagamento → nota fiscal → logística).  

4. **Modelo Híbrido (Fan-out: Tópico + Fila)**  
   - O tópico distribui mensagens, mas cada fila garante **armazenamento e monitoramento**.  
   - Vantagens: buffer, resiliência (consumidores podem cair e recuperar mensagens), observabilidade.  
   - Desvantagem: maior custo e complexidade.  

---

### Exemplos e Protocolos  
- Protocolos comuns: **MQTT, AMQP, WebSocket, HTTP**.  
- Arquiteturas modernas utilizam filas e tópicos para lidar com **grandes volumes de eventos** e **alta disponibilidade**.  
- Aplicações: sistemas de compra online, notificações, rastreamento e análise em tempo real.  

---

### Conclusão  
- **Trade-offs são inevitáveis**: simplicidade vs. escalabilidade, custo vs. performance.  
- O arquiteto deve escolher a abordagem que melhor equilibra os requisitos do sistema.  
- Arquiteturas baseadas em **tópicos e filas** são fundamentais para sistemas distribuídos de grande porte.  

# Aula 13 - 11/09/2025  

[Fundamentos da Arquitetura de Software - Análise de Trade-offs](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/22%5B%3Bvnd.vst.idref%3Dcap2.xhtml%5D!/4/2/58%5Bsigil_toc_id_24%5D/1:22%5B-of%2Cfs%5D)

Nesta aula foi discutido o papel do **arquiteto de software** frente aos desafios de **escalabilidade e requisitos não funcionais**, destacando a importância dos **trade-offs** e das decisões arquiteturais no ciclo de vida do sistema.  

## Tópicos Principais  

### Requisitos Não Funcionais e Escalabilidade  
- **Requisitos funcionais:** definem o que o sistema deve fazer.  
- **Requisitos não funcionais:** definem características de qualidade (desempenho, segurança, disponibilidade, escalabilidade).  
- Arquitetura deve ser planejada para suportar **crescimento de usuários e dados**.  

---

### Papel do Arquiteto  
- Avaliar continuamente se a arquitetura atende às necessidades atuais e futuras.  
- Decidir **quando migrar** de um modelo simples (ex.: monólito com banco central) para modelos mais complexos (ex.: microsserviços, mensageria).  
- Entender **limites de escalabilidade** e **impactos no custo e manutenção**.  

---

### Trade-offs em Decisões Arquiteturais  
- **Exemplo prático:** um sistema pode ser rápido e simples em pequena escala, mas não funcionar bem com milhões de usuários.  
- O arquiteto precisa balancear **custo x desempenho x complexidade**.  
- Decisões não são definitivas: devem ser **reavaliadas ao longo do tempo**.  

---

### Conclusão  
- A arquitetura de software é um processo **evolutivo**, ajustado conforme o sistema cresce.  
- O arquiteto deve **prever cenários de escalabilidade**, mas também evitar complexidade prematura.  
- A chave está em **entender requisitos não funcionais e aplicar trade-offs conscientes**.  

---

## Aula 15/09 e 18/09

- Implementação do publisher e subscriber (tópico)

---
