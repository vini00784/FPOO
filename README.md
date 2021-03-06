# FPOO (Fundamentos da Programação Orientada a Objeto)

## Tipos de Linguagem
* Compilada: 
    * Um programa compilado não pode ser executado enquanto ele não estiver sem erros de sintaxe;
    * O arquivo executável gerado pelo compilador só funciona no sistema operacional que ele é gerado, ou seja, se o arquivo é gerado em Linux, só funciona em Linux;
    * As linguagens compiladas são mais eficientes e mais rápidas, além de preservarem a propriedade intelectual, ou seja, não é possível visualizar o código-fonte que gerou o arquivo executável;
    * Um programa em linguagem compilada roda em qualquer PC com o mesmo SOP em que ele foi gerado, mesmo sem um compilador instalado.
---
* Interpretada:
    * Num programa interpretado é possível executá-lo em partes mesmo estando no processo da interpretação;
    * Aqui não é gerado um arquivo executável, simplesmente o código-fonte é executado, então, para executar o programa é necessário ter o código em mãos, o que nãoo preserva a propriedade intelectual;
    * Para que o programa seja executado em outro PC, é necessário que ele tenha instalado um interpretador daquela linguagem, além do próprio código.
---
* Tanto o compilador quanto o interpretador são softwares que fazem a conversão/tradução da linguagem de programação para a lignaugem de máquina (sistema de numeração binário), que é a linguagem do processador.

---

## Características JAVA 
* É uma linguagem compilada e interpretada, já que um código em JAVA não é compilado e executado pelo dispositivo diretamente, então é necessária a JVM, que uma espécie de interpretador que interpreta e executa o código.
* O arquivo executável gerado não pode ser executado pelo SOP, apenas pela JVM, o que abre possibilidade do programa em rodar em todo e qualquer Sistema Operacional
---
* Código-fonte --> Compilador JAVA --> gera um arquivo executável (bytecode) .class --> não pode ser executado pelo Sistema Operacional de forma direta --> JVM (Interpretador)
---
* JDK (Java Development Kit) - Pacote de software necessário para desenvolver aplicativos java.
* JRE (Java Runtime Environment) - Plug-in necessário para a execução de programas java.

*Estrutura obrigatória JAVA:
class Teste {
    public static void main(String args[]) {
    }
}

* A class começa sempre com maiúscula, deve ser apenas uma palavra e sem acentos.

---

## Variável
Espaço reservado (alocado) na memória RAM (principal) do computador para guardar uma informação de um tipo preestabelecido. A memória RAM é volátil, ou seja, é uma unidade de armazenamento temporária, ao desligar o computador essas informações são perdidas.

---
* NÃO podem começar com caracteres especiais e nem números.
---

### Escopo
Escopo de variável = visibilidade

    int n = 0;

    while (n < 10) {
        x = 100; ----> variável local (só existe ali)
        n++;
    }

    System.out.print(x);

Nesse caso, o System.print daria errado, porque a variável x é uma `` variável local ``, que foi criada em um bloco específico, então ela só existe lá. Então, para que tudo dê certo, ela deve ser declarada fora do bloco while.

## Tipos primitivos (criados juntamente com a linguagem)
* `` boolean ``
* `` 
* ``
* ``
* ``
* ``
* ``
* ``

### Númericas inteiras
* Para números inteiros: byte; short; int; long (int idade = 10;)
    * `` byte `` ---- Byte (classe wrapper (associada) do tipo primitivo byte) --> `` 8 bits ``
    * `` short `` ---- Short (classe wrapper (associada) do tipo primitivo short) --> `` 16 bits ``
    * `` int `` ---- Integer (classe wrapper (associada) do tipo primitivo int) --> `` 32 bits ``
    * `` long `` ---- Long (classe wrapper (associada) do tipo primitivo long) --> `` 64 bits ``

A diferença entre essas variáveis é o tamanho do espaço que será reservado. O tamanho da variável influencia no desempenho do seu programa, cada tipo ocupa um espaço diferente. O espaço é dividido entre negativos e positivos. Quando o tamanho da variável alcançar o máximo, ele volta para o começo, ou seja, é "formado" como um ciclo.

---
### Numéricas decimais
* Para números decimais: float; double (double altura = 1.56;)
    * `` float `` ---- Float (classe wrapper (associada) do tipo primitivo float) --> `` 32 bits ``
    * `` double `` ---- Double (classe wrapper (associada) do tipo primitivo double) --> `` 64 bits ``
* OBS.: Todas citadas acima são tipos de variáveis primitivos do Java, ou seja, foram criados junto com a linguagem.

Os programadores padronizaram tipos de variáveis numéricas. Int para inteiros e double para decimais, mas quando se trata de sistemas abarcados (possuem pouco espaço) a escolha deve ser feita com cuidado entre os tipos.

---
### Textuais (String)
String (classe não primitiva)

Tudo aquilo que está entre aspas

* String literal (letras): "Bom dia"
* String numérica (caracteres numéricos): "100" (Os únicos caracteres especiais que entram na string numérica são o ponto (.) e o sinal de menos (-)).
* String alfanumérica (letras, números e até caracteres especiais como #$%&*): "abc#$%/123"

#### Tipo char (método da classe String)
char --> caractere

`` charAt(n) `` --> retorna o caracter da posição especificada

    String nome = "maria";
    char letra = nome.charAt(n);
    n=0 --> primeiro caractere
    n=1 --> segundo caractere 

Tudo que for string é escrito entre aspas dupla (`` " " ``), e tudo que for char (caractere) é escrito entre apóstrofo, ou aspas simples (`` ' ' ``).

    char nome_da_variável = ' ';

---
`` equals() `` --> faz a comparação de igualdade entre Strings

    char letra = nome.charAt(2);

    if (nome.equals("maria")) {
        
    }

Não existe um método específico para uma comparação de diferença, mas usando o operador lógico `` ! `` (not), isso se torna possível

## Códigos especiais para String
* APENAS para strings, ou seja, dentro das aspas
* \n ==> pular uma linha
* \t ==> tabulação (efeito da tecla TAB)
* Exemplo:
    * System.out.println("\n\n\tOi\n")
    * Aqui ele vai pular 2 linhas, dar um parágrafo, escrever "Oi" e depois pular outra linha. Sem contar a outra linha pulada do println


## Conversão de string numérica em número 
* Métodos parse
    * Classes associadas (wrapper)
    * Dentro da classe Byte, por exemplo, tem um método parseByte(), que converte uma string numérica em um número inteiro
    * Dentro da classe Integer, tem um método parseInt(), que converte uma string numérica em um número inteiro
    * Exemplo na prática:
        * String nStr = "10"; 
        * int nInt = Integer.parseInt(n); 
        * A primeira linha era uma string numérica, não se tratando ainda de um número própriamente dito, já na segunda, o conteúdo da variável "nStr" deixa de ser uma string numérica e passa a ser um número.


## Tipos primitivos e suas classes wrapper
* byte ==> Byte ==> parseByte() (método parse da classe)
* short ==> Short ==> parseShort() (método parse da classe)
* int ==> Integer ==> parseInt() (método parse da classe)
* long ==> Long ==> parseLong() (método parse da classe)
---
* float ==> Float ==> parseFloat() (método parse da classe)
* double ==> Double ==> parseDouble() (método parse da classe)

## Entrada de dados gráfica (Classe JOptionPane)

---

## Entrada de dados texto (Classe Scanner)
* Não está disponível por padrão, portanto também precisa ser importada
---
* next() ==> lê e retorna somente uma palavra, ou seja, não funciona com frases com espaços, ele para de ler a partir do momento que ele encontrar um espaço
* nextLine() ==> lê e retorna uma linha/frase, ele para de ler a partir do momento que o botão enter for apertado
* Os métodos acima fazem apenas uma coisa, a leitura
---
* nextInt() ==> lê e converte uma string numérica para inteiro Ex.: "10" ==> 10
* nextByte() ==> lê e converte para byte
* nextShort() ==> lê e converte para short
* nextLong() ==> lê e converte para long
* nextFloat() ==> lê e converte para float
* nextDouble() ==> lê e converte para double
* Os métodos acima fazem 2 coisas, leitura e conversão, no caso de uma string numérica para um número em si
    * Exemplo com nextInt:
    * System.out.println("Informe sua idade: ");
    * int idade = ler.nextInt();

## Operadores
* Aritméticos (matemáticos):
    * `` "+" `` --> soma
    * `` "-" `` --> substração
    * `` "*" `` --> multiplicação
    * `` "/" `` --> divisão
    * `` "%" `` --> módulo
---
* Aritméticos de atribuição
    * `` += `` --> fat = fat + i --> fat += i
    * `` -= `` --> fat = fat - i --> fat -= i
    * `` *= `` --> fat = fat * i --> fat *= i
    * `` /= `` --> fat = fat / i --> fat /= i
    * `` %= `` --> fat = fat % i --> fat %= i
---
* Relacionais ou comparação (comparação apenas entre tipos primitivos):
    * `` ">" `` --> maior que
    * `` "<" `` --> menor que
    * `` ">=" ``  --> maior ou igual
    * `` "<=" `` --> menor ou igual

    * `` "==" `` --> igualdade
    * `` "!=" `` --> desigualdade (diferença)
---
* Lógicos:
    * Utilizados para unir dois testes lógicos, ou seja, para formar expressões lógicas.
    * `` "&&" `` --> E (and) --> Só entende quando todas as variáveis são verdadeiras.
    * `` "||" `` --> Ou (or) --> Basta que uma entrada seja verdadeira para que a saída seja verdadeira.             
    * `` "!" `` --> Não (not)
---
* Incremento:
    * `` ++ `` --> vasco

* Decremento:
    * `` -- `` -->

## Estrutura de Decisão (ou desvio condicional)
* Sempre que houver uma tomada de decisão é preciso acontecer um teste lógico. Ex.: Na hora de passar o bilhete único no trem, o sistema precisa tomar uma decisão, ou ele libera a catraca ou ele não libera (teste lógico), no caso, a catraca só vai ser liberada se o crédito do bilhete foi igual ou maior do que o valor da passagem.
---
* Três tipos:
    * Simples: Só há apenas uma resposta e verdadeira, no caso de ser falsa, não acontece absolutamente nada. 
        * Tem apenas o bloco If
        * Ex.: Alistamento no exército: tem 18 anos, se alista, tem menos que 18 anos, não se alista // Beber água, está com sede, bebe, não está, não bebe.
    * Composta: Se para o teste lógico a resposta for verdadeira, acontece algo, se for falsa, também acontece algo.
        * Tem o bloco else e o If
        * Ex.: 
    * Aninhada(encadeada): Quando uma estrutura de decisão está localizada dentro do lado falso da outra, ou seja, se usa diversas estruturas de decisão.
        * Dentro de um else podemos outro If, e vice-versa
        * Ex.: Um banco vai fazer uma campanha de marketing apenas com pessoas que possuem crédito acima de R$ 10.000,00, já quem deve mais de R$ 1.000,00, será cobrado. Nesse caso existem três possibilidades, uma conta pode estar postiva, negativa ou ZERADA. O primeiro teste lógico é se o dinheiro dentro da conta é igual a zero ou não, caso seja, o processo acabou, caso não seja, surgem mais duas possibilidades (negativa ou postiva), e aí entra mais uma estrutura de decisão, se o saldo é maior que 10.000,00 (para ver quem faria parte da campanha de marketing), e assim por diante, até estar tudo pronto.
---
* `` If `` {} (se)
    * Todas as instruções que devem ser executadas caso o teste lógico seja verdadeiro.
* `` Else `` {} (senão)
    * Todas as instruções que devem ser executadas caso o teste lógico seja falso.

* Nunca haverá um else sem um if.
---
* Numa estrutura de decisão simples tem apenas o If.

## Estrutura de Repetição (laços/loop)
Utilizadas quando precisam repetir algo, geralmente um padrão, como uma tabuada.

---
* `` for `` (para) --> se usa quando se sabe antecipadamente a quantidade de repetições que será feita
    
Sintaxe:

    for( ; ; ) {

    }

Dentro dos parênteses, vêm expressões: `` for (inicialização; teste; atualização) ``
* Inicialização: onde se inicia a contagem
* Teste: determina o final da contagem
* Atualização: determina o passo (razão) da contagem (de quanto em quanto)

Exemplo: 

    contagem com os números 1,4,7,10 e 13:
    for (int i=1; i <= 13 ; i=i+3 ) {
        System.out.print(i);
    }

---

* `` while `` (enquanto) --> se usa quando NÃO SE SABE antecipadamente a quantidade de repetições que será feita

Sintaxe:

    while() {

    }

Dentro dos parênteses vêm apenas uma expressão, que é a de teste: `` while (expressão de teste) ``

Exemplo: 

    contagem de 1 a 10:
    int i = 1;
    while (i <= 10) {
        System.out.print(i)
    }

* `` do while ``

---

## Métodos
Servem para executar apenas UMA ação específica

* `` main() `` --> principal, inicia a execução do código, tudo começa a partir dele
* `` println() ``
* `` pow() ``
* `` sqrt() ``
* `` next() ``

Todos eles iniciam com letra minúscula e terminam com parênteses

Criando nossos próprios métodos:

    public static void main(String args[])

O <strong>primeiro</strong> item a ser especificado é o modificador de acesso ou visibilidade, que nesse caso é `` public ``

* public --> público
* private --> privado, disponível apenas para alguns
* default --> padrão
* protecter --> protegido

* static --> estático, visibilidade especial, pode ou não ser utilizado

O <strong>segundo</strong> item é o tipo de retorno, no caso `` void ``

* void --> vazio, usado em métodos que não retornam nada
* int
* double

E <strong>por último</strong>, o nome do método precedido de parênteses (que podem ou não conter argumento), no caso, `` main() ``

Criação de um método para fazer uma calculadora simples de números decimais:

    class Calculadora {
        public static void main(String args[]) {
            double n1 = 10.0;
            double n2 = 5.5;
            double resultado = somar(n1,n2) --> isso irá fazer o método main chamar o método somar
        }
        
        public static double(double n1, double n2) {
            return (n1 + n2);
        } 
    }

## Static
Métodos que são static só conseguem se comunicar com outros métodos static.

Uma variável também pode ser static, mas somente quando o método em que ela está inserida também for static. Variáveis static existirão independentemente do seu método, ou seja, basta o programa estar rodando.

## Vetores e Varáveis
De uma forma resumida, os vetores servem para guardar um conjunto de variáveis. Ex.: No caso de guardar várias notas, teríamos que criar uma variável para cada nota, mas usando vetores podemos evitar essa repetição, pois eles são capazes de guardar diversps valores.

Para criar um vetor, basta colocar `` [] `` após o nome ou após o tipo da "variável": 

    int n[];
    int[] n;
    double n3[];

É preciso também especificar a quantidade de valores que o vetor irá receber:

    int n[] = {5, 3, 7};

O primeiro elemento do vetor é sempre o da ponta esquerda, e o último é o da ponta direita. Numa contagem, não começa pelo 1, e sim com o zero, sendo 0,1,2,3 até o fim. Então, para dizer que você quer o terceiro elemento de um vetor, ficaria assim:

    int n[] = {5, 3, 7};
    int num = n[2];

No exemplo acima, a variável `` num `` receberia o terceiro valor dentro do vetor `` n ``, que é igual a 7.

## Matrizes
Um vetor possui apenas um linha, sendo a quantidades de colunas correspondente à quantidade de valores dentro do vetor. Já uma `` matriz `` se comporta literalmente como uma tabela, sendo o primeiro elemento (0,0), como no plano cartesiano que o primeiro a ser especificado é o eixo horizontal.

![](./imgs-readme/img01.PNG)

Para se criar uma matriz, basta usar:

    int m[][] = new int[3][3];
    m[1][2] = -5;
    m[2][1] = 4;

O <strong>primeiro</strong> colchete se refere ao eixo horizontal (linha), e o <strong>segundo</strong> se refere ao eixo vertical (colunas).

### Particularidades sobre Vetores e Matrizes
Matrizes e Vetores só podem receber informações do mesmo tipo, então, numa matriz do tipo int não é possível guardar variáveis do tipo String.

Não existe vetor ou matriz com tamanho indeterminado ou infinito, sempre tem um tamanho especificado.

## Array List
Array --> Matriz

Pode ser criado sem a especificação do número de elementos, eles podem ser adicionados conforme as necessidades.

Pode armazenar elementos de tipos diferentes, como string, int, double e etc., é totalmente flexível.

Para criar uma Array List, é preciso importar uma classe, já que foi uma funcionalidade implementada posterior à criação do Java e não está no pacote java lang:

    import java.util.ArrayList;

Para criar uma de fato:

    ArrayList<Integer> idade = new ArrayList<Integer>();
    Dentro dos "<>", se coloca a classe referente ao tipo do ArrayList.

Criando uma lista de cidades:

    ArrayList<String> cidades = new ArrayList<String>();
    cidades.add("Santa Catarina");
    cidades.add("São Paulo");

## Erros

`` De sintaxe `` --> quando a sintaxe tá errada, ou seja, não se respeita a regra da linguagem de programação

`` De semântica `` --> quando o programa retorna algo que não deveria, não há coerência. Ex.:

`` Exceções `` --> erros causados pela entrada de dados do usuário

## Tratamento de Exceção
Usados justamente para tratarem erros ocorridos por conta de alguma exceção. Se usa:

    try {

    }

    catch () {

    }

OBS.: <strong>NÃO PODE</strong> conter algo entre o try e o catch, o catch sempre virá após o try.

Exceções são geradas nas entradas de dados, caso o usuário digite algo que não se adeque às especificações do programa.

O `` try `` serve para colocarmos as linhas do código que podem gerar alguma exceção

O `` catch `` serve para, caso uma exceção seja encontrada no try, aconteça um desvio do fluxo de processamento de dados para o catch. Ex.: há um `` int num = sc.nextInt()`` dentro do try e é encontrada uma exceção, o catch desvia essa linha de código para que ela não seja executada, e então pode ser exibida uma mensagem ao invés de um código.

Dentro dos `` () `` do catch, é especificado o tipo da exceção.

## Programação Orientada a Objeto (POO)
Todo objeto possui: características e funcionalidade

Características:
* Propriedades 
* Atributos
* Campo

Funcionalidade
* O que ele faz
* Para que o objeto serve
* No caso, os métodos

---
### Três pilares
* Encapsulamento
* Herança
* Polimorfismo

### Encapsulamento
É deixar protegido, encapsulado.

É obrigatório encapsular os atributos, ou seja, ao invés de deixar `` public ``, se deixa `` private ``. O que nos leva a necessidade de um mecanismo que nos possibilite ter acesso aos métodos encapsulados, no caso os `` getters `` e `` setters ``

---
## Classe
É uma abstração de um objeto

Abstração --> Observar, extrair todas as informações, se aprofundar no objeto e verificar suas funcionalidades

## Objeto 
Instância em uma classe, pois é criado a partir dela.

## Atributo
Criado dentro da <strong>CLASSE</strong>, fora de qualquer método.