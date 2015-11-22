![FEUP logo](http://conference.mercatura.pt/gequaltec2015/site/images/feup.png)

### MIEIC - Mestrado Integrado em Engenharia Informática e Computação
### ESOF - Engenharia de Software

## Índice
1. [Introdução](#intro)
2. [Grau de Testabilidade](#grau)
   * [Controlabilidade](#control)
   * [Observabilidade](#observ)
   * [_Isolateability_](#isol)
   * [Separação de preocupações](#sep)
   * [Compreensibilidade](#comp)
   * [Heterogeneidade](#hetero)
3. [Estatísticas de Teste](#statistics)
4. [Conclusão](#conclusion)

__Nota:__<font color="black"> Tudo o que está dentro bloco de citações é retirado das respostas de um email que nos foi entregue por , [Mario Zechner](http://www.badlogicgames.com/wordpress/?p=3758), criador e proprietário do software que estamos a tratar, que consiste na reposta de algumas perguntas feitas pelo nosso grupo.


## <a name="intro"> 1. Introdução

  A libGDX, por ser um projeto mais livre que outros, isto é, qualquer pessoa pode participar no seu desenvolvimento e ajudar na sua inovação, sofre de uma organização em termos de testabilidade que fica a desejar. Para este relatório fomos à procura de um módulo de testes nos diretórios do projeto LibGDX. Verificou-se que existe um módulo com vários testes, ainda que poucos.Porém o projeto não segue a técnica TDD( Test driven Development) como podemos constatar pela seguinte declaração feita pelo criador do projeto retirada de um _email_ que nos foi enviado:

  > <font color="gray"> "... TDD is totally unsuitable for what we do. we do develop APIs by creating sample code to get a feel how the new API should work. but that's where the similarities to tdd end."

  Assim, foi enviado mais outro _email_ ao mesmo contendo várias perguntas sobre os tópicos abaixo referidos, pelo que uma das respostas foi:

  > <font color="gray"> "The rest of the questions i can not answer, as they are mostly specific to unit tests, which we do not have many off due to the restrictions imposed by not being able to test OpenGL/audio related components."

  Portanto, como o projeto estudado não contém propriamente estruturas de testes e não segue a técnica TDD, decidimos extrapolar o que achariamos adequado para este projeto conter no que toca a desenvolvimento baseado em testes.


## <a name="grau"> 2. Grau de Testabilidade

  Como já foi referido, o grau de testabilidade do projeto é bastante pequeno. A maior razão para isto é o projeto ser baseado em OpenGL e ter componentes de audio e por isso os seus componentes não são propícios para testes. Contudo existe dentro do projeto um diretório reservado para testes de API que são executados e avaliados manualmente.

  > <font color="gray"> "It contains functional tests as well as a few unit tests for non-graphical functionality. The functional tests are to be executed and evaluated manually. Automated testing is not possible with OpenGL based rendering."

  ![LibGDX tests](resources/report4image1.png?raw=true)

  A imagem acima mostra parcialmente como está organizado o diretório 'tests' do projeto. Contém os pacotes necessários para a aplicação de teste correr(os diretórios de cima), o diretório 'utils' que alberga a classe 'GdxTest.java'(o diretório que está selecionado) usada em classes de teste que são as que estão representadas em baixo na imagem.

  Sendo assim, os próximos tópicos serão referentes a essa parte do projeto assim como a um possível melhoramento sugerido pelos elementos do grupo.

### <a name="control"> Controlabilidade

### <a name="observ"> Observabilidade

### <a name="isol"> _Isolateability_

### <a name="sep"> Separação de Preocupações

Podemos verificar que o projeto tem um grau muito grande de separação de preocupações pois cada teste é testado numa classe à parte que estende a classe 'GdxTest.java'(classe abstrata que implementa a classe 'ApplicationLister', repsonsável pela execução da aplicação) que serve como classe mãe para todas as outras classes de teste. Cada classe é independente da outra pois o conceito de teste para este projeto é testar as classes da API individualmente e avaliá-las manualmente. O uso de classes é muito importante neste aspeto pois cada componente tem a sua devida responsabilidade.

![LibGDX testClassExample](resources/report4image2.png?raw=true)
imagem de parte da classe teste 'SpriteBatchTest' referente à classe 'SpriteBatch' do projeto normal

### <a name="comp"> Compreensibilidade

Em termos de compreensão do código das classes de teste podemos afirmar que cada classe de teste não é suficientemente compreensível, exceto quando existe documentação que é o caso da classe 'SortedSpriteTest' como podemos constatar a seguir:

![LibGDX testClassExample](resources/report4image3.png?raw=true)

Apesar do projeto conter várias classes com documentação, existem muitas classes de teste que não têm comentários sequer. A API da LibGDX embora seja de fácil compreensão proviniente da boa prática de nomeação de classes, membros e funções não é suficiente para a total compreensão das classes de teste pelo que concluimos que o grau de compreensibilidade é baixo.

### <a name="hetero"> Heterogeneidade

## <a name="statistics"> Estatísticas de Teste


## 3. <a name="conclusion"> Conclusão
