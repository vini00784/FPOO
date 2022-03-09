# FPOO (Fundamentos da Programação Orientada a Objeto)

## Tipos de Linguagem
* Compilada: 
    * Um programa compilado não pode ser executado enquanto ele não estiver sem erros de sintaxe;
    * O arquivo executável gerado pelo compilador só funciona no sistema operacional que ele é gerado, ou seja, se o arquivo é gerado em Linux, só funciona em Linux;
    * As linguagens compiladas são mais eficientes e mais rápidas, além de preservarem a propriedade intelectual, ou seja, não é possível visualizar o código-fonte que gerou o arquivo executável;
    * Um programa em linguagem compilada roda em qualquer PC com o mesmo SOP em que ele foi gerado, mesmo sem um compilador instalado.
----------------------------------------------------------------
* Interpretada:
    * Num programa interpretado é possível executá-lo em partes mesmo estando no processo da interpretação;
    * Aqui não é gerado um arquivo executável, simplesmente o código-fonte é executado, então, para executar o programa é necessário ter o código em mãos, o que nãoo preserva a propriedade intelectual;
    * Para que o programa seja executado em outro PC, é necessário que ele tenha instalado um interpretador daquela linguagem, além do próprio código.
----------------------------------------------------------------
* Tanto o compilador quanto o interpretador são softwares que fazem a conversão/tradução da linguagem de programação para a lignaugem de máquina (sistema de numeração binário), que é a linguagem do processador.

----------------------------------------------------------------

## Características JAVA 
* É uma linguagem compilada e interpretada, já que um código em JAVA não é compilado e executado pelo dispositivo diretamente, então é necessária a JVM, que uma espécie de interpretador que interpreta e executa o código.
* O arquivo executável gerado não pode ser executado pelo SOP, apenas pela JVM, o que abre possibilidade do programa em rodar em todo e qualquer Sistema Operacional
----------------------------------------------------------------
* Código-fonte --> Compilador JAVA --> gera um arquivo executável (bytecode) .class --> não pode ser executado pelo Sistema Operacional de forma direta --> JVM (Interpretador)
----------------------------------------------------------------
* JDK (Java Development Kit) - Pacote de software necessário para desenvolver aplicativos java.
* JRE (Java Runtime Environment) - Plug-in necessário para a execução de programas java.

*Estrutura obrigatória JAVA:
class Teste {
    public static void main(String args[]) {
    }
}

* A class começa sempre com maiúscula, deve ser apenas uma palavra e sem acentos.
----------------------------------------------------------------

## Variáveis
* NÃO podem começar com caracteres especiais e nem números.
----------------------------------------------------------------
* Númericas:
    * Para números inteiros: byte; short; int; long (int idade = 10;)
        * byte ---- Byte (classe wrapper (associada) do tipo primitivo byte)
        * short ---- Short (classe wrapper (associada) do tipo primitivo short)
        * int ---- Integer (classe wrapper (associada) do tipo primitivo int)
        * long ---- Long (classe wrapper (associada) do tipo primitivo long)
    * Para números decimais: float; double (double altura = 1.56;)
        * float ---- Float (classe wrapper (associada) do tipo primitivo float)
        * double ---- Double (classe wrapper (associada) do tipo primitivo double)
    * OBS.: Todas citadas acima são tipos de variáveis primitivos do Java, ou seja, foram criados junto com a linguagem.
----------------------------------------------------------------
* Textuais:
    * String (classe não primitiva)

----------------------------------------------------------------

## String (texto)
* Tudo aquilo que está entre aspas *
    * String literal (letras): "Bom dia"
    * String numérica (caracteres numéricos): "100" (Os únicos caracteres especiais que entram na string numérica são o ponto (.) e o sinal de menos (-)).
    * String alfanumérica (letras, números e até caracteres especiais como #$%&*): "abc#$%/123"

----------------------------------------------------------------

## Códigos especiais para String
* APENAS para strings, ou seja, dentro das aspas
* \n ==> pular uma linha
* \t ==> tabulação (efeito da tecla TAB)
* Exemplo:
    * System.out.println("\n\n\tOi\n")
    * Aqui ele vai pular 2 linhas, dar um parágrafo, escrever "Oi" e depois pular outra linha. Sem contar a outra linha pulada do println

----------------------------------------------------------------

## Conversão de string numérica em número 
* Métodos parse
    * Classes associadas (wrapper)
    * Dentro da classe Byte, por exemplo, tem um método parseByte(), que converte uma string numérica em um número inteiro
    * Dentro da classe Integer, tem um método parseInt(), que converte uma string numérica em um número inteiro
    * Exemplo na prática:
        * String nStr = "10"; 
        * int nInt = Integer.parseInt(n); 
        * A primeira linha era uma string numérica, não se tratando ainda de um número própriamente dito, já na segunda, o conteúdo da variável "nStr" deixa de ser uma string numérica e passa a ser um número.

----------------------------------------------------------------

## Tipos primitivos e suas classes wrapper
* byte ==> Byte ==> parseByte() (método parse da classe)
* short ==> Short ==> parseShort() (método parse da classe)
* int ==> Integer ==> parseInt() (método parse da classe)
* long ==> Long ==> parseLong() (método parse da classe)
----------------------------------------------------------------
* float ==> Float ==> parseFloat() (método parse da classe)
* double ==> Double ==> parseDouble() (método parse da classe)

----------------------------------------------------------------

## Entrada de dados gráfica (Classe JOptionPane)

----------------------------------------------------------------

## Entrada de dados texto (Classe Scanner)
* Não está disponível por padrão, portanto também precisa ser importada
----------------------------------------------------------------
* next() ==> lê e retorna somente uma palavra, ou seja, não funciona com frases com espaços, ele para de ler a partir do momento que ele encontrar um espaço
* nextLine() ==> lê e retorna uma linha/frase, ele para de ler a partir do momento que o botão enter for apertado
* Os métodos acima fazem apenas uma coisa, a leitura
----------------------------------------------------------------
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
    * "+"
    * "-"
    * "*"
    * "/"
    * "%"
----------------------------------------------------------------
* Relacionais (comparação):
    * ">" --> maior que
    * "<" --> menor que
    * ">="  --> maior ou igual
    * "<=" --> menor ou igual

    * "==" --> igualdade
    * "!=" --> desigualdade (diferença)

## Estrutura de Decisão (ou desvio condicional)
* Sempre que houver uma tomada de decisão é preciso acontecer um teste lógico. Ex.: Na hora de passar o bilhete único no trem, o sistema precisa tomar uma decisão, ou ele libera a catraca ou ele não libera (teste lógico), no caso, a catraca só vai ser liberada se o crédito do bilhete foi igual ou maior do que o valor da passagem.
----------------------------------------------------------------
* Três tipos:
    * Simples: Só há apenas uma resposta e verdadeira, no caso de ser falsa, não acontece absolutamente nada. 
        * Ex.: Alistamento no exército: tem 18 anos, se alista, tem menos que 18 anos, não se alista // Beber água, está com sede, bebe, não está, não bebe.
    * Composta: Se para o teste lógico a resposta for verdadeira, acontece algo, se for falsa, também acontece algo.
        * Ex.: 
    * Aninhada(encadeada): Quando uma estrutura de decisão está localizada dentro do lado falso da outra, ou seja, se usa diversas estruturas de decisão.
        * Ex.: Um banco vai fazer uma campanha de marketing apenas com pessoas que possuem crédito acima de R$ 10.000,00, já quem deve mais de R$ 1.000,00, será cobrado. Nesse caso existem três possibilidades, uma conta pode estar postiva, negativa ou ZERADA. O primeiro teste lógico é se o dinheiro dentro da conta é igual a zero ou não, caso seja, o processo acabou, caso não seja, surgem mais duas possibilidades (negativa ou postiva), e aí entra mais uma estrutura de decisão, se o saldo é maior que 10.000,00 (para ver quem faria parte da campanha de marketing), e assim por diante, até estar tudo pronto.
----------------------------------------------------------------
* If
    * Todas as instruções que devem ser executadas caso o teste lógico seja verdadeiro
* Else
    * Todas as instruções que devem ser executadas caso o teste lógico seja falso