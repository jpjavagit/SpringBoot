# Spring Boot

O que é o Spring Boot?

Spring Boot é um framework que faz parte da plataforma Spring e provê facilidades no desenvolvimento de aplicações Java, produtividade para a equipe de desenvolvimento, facilidade na execução de deploys e é utilizado principalmente na criação dos famosos **Microservices** que têm se tornado essencial na construção de aplicações baseados em serviços.

### Spring MVC x Spring Boot

Essa dúvida pode surgir, mas estes não são rivais.
O Spring MVC é um framework para construção de aplicações WEB similar ao Struts framework.

O Spring Boot fornece apoio no empacotamento de uma aplicação Spring MVC e na entrega com pouco esforço.

Para o melhor entendimento, a versão 1.1.7 do **Spring Boot** foi construído com base no **Spring Framework**, mais especificamente a versão 4.0.7, possui todas as funcionalidades de forma encapsulada, então não se preocupe, foi mantido todas as bibliotecas da plataforma Spring como o Spring MVC, Spring Data, Spring Security e entre outros.

Para um melhor entendimento, vamos ao que interessa sobre o **Spring Boot**.

### Facilidades

Para quem sempre trabalhou com aplicação Java WEB estranhará bastante com o **Spring Boot**, por um motivo simples, o arquivo WEB.XML, no **Spring Boot** não é necessário a configuração deste arquivo, sendo um dos propósitos, a não utilização de arquivos de configuração. Oframework dá conta do recado.

Ao trabalhar em projetos utilizando Spring, a parte de configuração é sempre muito difícil, integrar bibliotecas, configurar injeção de dependências, controle de inversão e o pior, toda a configuração utilizando inúmeros arquivos XML, por experiência própria, sempre achei confuso, mas por outro lado a configuração utilizando XML separava bem as configurações dos demais arquivos que facilitava a manutenção. Sempre tem o lado bom, mas na minha opinião, não é um facilitador, inclusive para novatos.

O Spring Boot diminui a quase zero, ou melhor, zero as configurações de arquivos XML utilizando anotações nas próprias classes Java.

Outro facilitador é o ganho de produtividade na configuração de um projeto Spring, quem nunca gastou horas configurando projetos do zero? Com o Spring Boot, já vem todo configurado e pronto para usar!

O Spring Boot provê a utilização de RESTful HTTP de maneira fácil pelo fato da facilidade em construir **Microservices** que é também um dos principais objetivos do framework.

### Anotações importantes

As anotações é um facilitador de grande importância, substitue qualquer configuração utilizando arquivos XML.
Alguns exemplos básicos de anotações utilizados em classes Java.

Algumas das anotações a seguir não são exclusivas do mundo **Spring Boot** mas fazem parte de qualquer aplicação que utilize o framework.

#### @RestController

Esta anotação não é novidade, mas é utilizada em classes utilizando **Spring Boot**, facilita na exposição de um serviço **REST**.

#### @Configuration

Essa anotação não é exclusiva do Spring Boot, mas ainda é utilizada nas configurações de uma classe responsável por inicializar uma aplicação.  **@Configuration** indica que a classe declara um ou mais métodos que serão processados pelo container Spring.

#### @ComponentScan

Toda classe anotada com **@ComponentScan** será escaneada pelo container Spring ao ser carregado.

#### @EnableAutoConfiguration

É a anotação utilizada na classe de inicialização da aplicação, possibilita utilizar as configurações definidas no classpath, sem a necessidade de configurar no WEB.XML. Ela carrega carrega a **AutoConfigurationPackages** que configura os pacotes que são escaneados pelo **Spring**.

#### @RequestMapping

Responsável por gerenciar as chamadas **REST** e na configuração das *URL*, esta anotação não é exclusiva do **Spring Boot**, quem já trabalhou com o **Spring MVC** já a viu antes.

#### @SpringBootApplication

Esta anotação é muito preciosa, só pelo nome já se sabe que se refere exclusivamente ao **Spring Boot**, usando ela não é necessário declarar algumas das anotações acimas como **@EnableAutoConfiguration, @Configuration** e ** @ComponentScan**, ela encapsula todas elas em uma úica anotação. É um bom facilitador e ajuda a limpar o código, mas caso você prefira declarar todas as anotações anteriores não deixa de ser uma boa prática.

### A volta do método Main

Para executar uma aplicação baseada em Spring Boot é muito simples, toda a execução é baseada em uma única classe e em um único método estático, o famoso **main()** utilizando em aplicações **Java Swing**.

Exemplo do método main:

public static void main(String[] args) {

      SpringApplication.run(SpringBootApplication.class, args);

}

### Spring Initializr

Para você que está acostumado a gerar projetos utilizando **Maven** ou **Gradle**, não se preocupe nada mudou, no site https://start.spring.io/ criado pela
[Pivotal](https://run.pivotal.io/) existe uma ferramenta que possibilita gerar um projeto **Maven** ou **Gradle** com as configurações do **Spring Boot** e suas depedências como **JPA, Security** e entre outros.

Veja abaixo como é fácil, apenas preencha os campos e gera o arquivo que desejar.

![alt
text](https://raw.githubusercontent.com/joshlong/meh/master/df-123/initializr-df-server.png)

Gerando um projeto **Maven** por exemplo, basta importar o arquivo **Pom** em sua IDE de preferência.

### Servidor Servlet

Veja que ao gerar um projeto **Maven** pelo
[Spring Initializr](https://start.spring.io/) será gerado uma dependência chamada **spring-boot-starter**, esta dependência fornece funcionalidades do Spring Boot, por padrão será gerado a dependência **spring-boot-starter-parent**, caso seu projeto seja direcionado para aplicações desktop, caso contrário você pode modificar para **spring-boot-starter-web** para a implementação de **Micro Services**.
A outra novidade é que não é necessário se preocupar com o **Servlet Container** ele já está embutido no próprio **Spring Boot**, por padrão é utilizado uma versão embarcada do Tomcat (versão 7.0.55).

Abaixo uma lista de Servlet Containers com suporte ao **Spring Boot**:

  | Nome          | Versão        | Versão Java  |
  | ------------- |:-------------:| ------------:|
  | Tomcat 8      | 3.1           |   Java 7+    |
  | Tomcat 7      | 3.0           |   Java 6+    |
  | Jetty 9       | 3.1           |   Java 7+    |
  | Jetty 8       | 3.0           |   Java 6+    |  
  | Undertow 1.1  | 3.1           |   Java 7+    |
  
|Nome   | Nome  | Nome  | Nome  | Nome  |
|---|---|---|---|---|
|   |   |   |   |   |
|   |   |   |   |   |
|   |   |   |   |   |


Caso você queira utilizar Jetty ao invês de Tomcat adicione a dependência **spring-boot-starter-jetty** no Pom. Você pode consultar a lista de dependência de **Spring Boot Starters** no [link](http://docs.spring.io/spring-boot/docs/1.1.7.RELEASE/reference/htmlsingle/#using-boot-starter-poms).

#### Utilizando CLI

É a maneira mais fácil de executar uma aplicação **Spring Boot** via linha de comando, para isso é necessário efetuar o [download](http://repo.springsource.org/milestone/org/springframework/boot/spring-boot-cli/0.5.0.M4/spring-boot-cli-0.5.0.M4-bin.zip) e efetuar a instalação.

Crie a classe que será executada abra o terminal de execução do seu sistema operacional e execute o comando abaixo:

*spring run NomedaClasse.groovy*

Não se preocupe com o Groovy, ele já vem instalado no pacote do CLI. Após executado o comando, abra o browser e digite na URL o endereço *localhost:8080*, pronto, a sua primeira aplicação **Spring Boot** sendo executado via **CLI**.

#### O que são os Microservices?

Quando se fala de **Spring Boot** é obrigatório falar sobre **Microservices**, mas o que são **Microservices**?

**Microservices** é um termo criado a poucos anos atrás para descrever uma forma de desenvolver aplicações baseadas em serviços independentes.

Para entender melhor, podemos comparar **Microservices** com aplicações monolíticas. As aplicações monolíticas se baseia em três partes, o lado cliente **client-side**, que consiste em Html e JavaScript, um banco de dados e o lado servidor, ou melhor, **server-side**. Todas estas funcionalidades são construídas sobre uma única unidade de processamento, diferente dos **Microservices** que para cada funcionalidade é baseado em um serviço diferente e independente, ou melhor, uma unidade independente. Resumindo, projetos diferentes.

Claro que **Microservices** são serviços disponibilizados normalmente atravês do protocolo **REST** que obviamente disponibiliza uma determinada funcionalidade.

#### Descentralização de Governança

É uma característica marcante, centralizar governança obriga padronizar toda tecnologia em uma única plataforma. Diferente da proposta do uso de **Microservices**, que possibilita utilizar diferentes tecnologias como **Spring Boot, Node.JS e .NET** para construir diferentes serviços e comunicarem entre si atravês do protocolo **REST**.

O legal dos **Microservices** é que vários times podem trabalhar de forma independente utilizando diferentes tecnologias.

#### Descentralização de Gerenciamento de dados

Enquanto aplicações monolíticas utiliza de apenas uma base de dados para persistência de dados, **Microservices** utiliza para cada serviço uma base de dados, podendo ser a mesma tecnologia de sistema de banco de dados ou tecnologias diferentes, utilizando [Persistência Poliglota](http://martinfowler.com/bliki/PolyglotPersistence.html) .

Esta uma característica marcante na utilização de **Microservices** que traz grandes benefícios.

#### Microservices x SOA

Não confunda **Microservices** com **SOA**, são termos diferentes, a diferença é que **Microservices** não utiliza de **ESB - Enterprise Service Bus** e existe toda uma governança ao trabalhar **Arquitetura Orientada a Serviços**

Outra característica de **Microservices** é que o código utilizado na construção dos serviços não seja tão grande para uma fácil manutenção.

Construir uma aplicação baseada em **Microservices** é totalmente viável utilizando **Spring Boot**.

#### Caso Real

Algumas empresas já são pioneiras no uso de **Microservices** como a Amazon, NetFlix, The Guardian e Uber. Dentre as empresas acima, o estudo de caso mais famoso é a do Uber. O Uber quando lançado utilizava de uma API Monolítica e em seguida migrou para  **Microservices**, esta migração trouxe muitos benefícios.

1. Escalabilidade
2. Fácil Manutenção
3. Arquitetura Evolutiva

A utilização de **Microservices** traz grandes benefícios para aplicações de grande porte, mas é necessário estudar a viabilidade para cada contexto. Vimos que o **Spring Boot** é um ótimo framework para ser utilizado na construção de **Microservices** ou na utilização de outras abordagens como aplicações Web e desktop. Existem outras tecnologias como Node.Js e Microsoft .NET que possibilita a mesma ideia.

Para conhecer melhor sobre **Spring Boot** e **Microservices** leia as referências abaixo.

Referências:

* [Creating Microservice Deployment Pipelines with Netflix’s Spinnaker: A Perspective from Google](https://www.infoq.com/news/2016/02/microservice-deploys-spinnaker)

* [Criando micro serviços com o Spring Boot - InfoQ](https://www.infoq.com/br/articles/boot-microservices)

* [Domine o Spring](https://domineospring.wordpress.com/2015/06/26/comecando-com-a-magia-do-spring-boot/)

* [Livro - Building Microservices](http://shop.oreilly.com/product/0636920033158.do)

* [Livro - Spring Boot in Action](https://www.amazon.com.br/Spring-Boot-Action-Craig-Walls/dp/1617292540)

* [Microservices - a definition of this new architectural term - Por Martin Fowler and James Lewis](http://martinfowler.com/articles/microservices.html)

* [Quebrando uma API monolítica em microserviços no Uber - InfoQ](https://www.infoq.com/br/news/2016/07/uber-microservices)

* [Spring Boot Complete Guide - JAVABEAT](http://javabeat.net/spring-boot/)

* [SPRING INITIALIZR](https://start.spring.io/)

* [Spring Boot Reference Guide](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-introducing-spring-boot)

* [Spring Boot: simplificando o Spring - DevMedia](http://www.devmedia.com.br/spring-boot-simplificando-o-spring-revista-java-magazine-135/31979)

* [What is the difference between Spring Boot and the Spring framework? - Quora](https://www.quora.com/What-is-the-difference-between-Spring-Boot-and-the-Spring-framework)
