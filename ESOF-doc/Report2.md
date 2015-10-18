![FEUP logo](http://conference.mercatura.pt/gequaltec2015/site/images/feup.png)
### MIEIC - Mestrado Integrado em Engenharia Informática e Computação
### ESOF - Engenharia de Software



## Index
1. [Introdução](#intro)
2. [Requerimentos](#requirements)
  * [Elicitação](#elicitation)
  * [Análise e Negociação](#analisis)
  * [Especificação](#specification)
  * [Validação](#validation)
  * [Conclusão](#conclusion)
3. [Use Cases](#use)

---------
__Nota:__<font color="black"> Tudo o que está dentro bloco de citações é retirado das respostas de um email que nos foi entregue por , [Mario Zechner](http://www.badlogicgames.com/wordpress/?p=3758), criador e proprietário do software que estamos a tratar, que consiste na reposta de algumas perguntas feitas pelo nosso grupo.

# <a name="intro"></a>Introdução

Tendo em conta a metodologia de desenvolvimento do projecto _LibGdx_, metodologia _Agile_, em que várias equipas com diferentes organizações, têm a finalidade de objetivos diferentes, os membros oficiais do projeto foram escolhidos para o cargo por contribuírem para o desenvolvimento do projeto mais frequentemente, apesar de não haver divisões muito estritas.

> <font color="gray"> "There's no strict division, everybody is free to choose what to work on. However, some people specialize, e.g. i'm responsible for the build system mostly, nex covers HTML5 and Android, Nate mostly works on scene2d, Xoppa does all things 3D, Tomski covers iOS and so on."

Embora só haja dois membros que são considerados os proprietários do projeto, qualquer pessoa pode ser um colaborador para o desenvolvimento sem que seja necessário o conhecimento desses membros.

# <a name="requirements"> Requerimentos da [LibGDX](https://libgdx.badlogicgames.com/)

## <a name="elicitation">Elicitação

Novas características para o projeto são criadas a partir de certas necessidades de vários membros da organização através da utilização de [_issues_](https://github.com/libgdx/libgdx/issues) ou até por [_pull requests_](https://github.com/libgdx/libgdx/pulls) feitos por pessoas que querem ver essa característica incorporada no _software_.

As adições ao projeto não são planeadas pelos responsáveis pelo mesmo e certas mudanças podem até surgir de pura curiosidade. O que nos leva a creer que não existe propriamente um cliente final que exige que certas características estejam no projeto.

> <font color="gray"> "New features are added by libGDX org members or pull requests ... New features are not necessarily planned, they are created on a need basis or out of curiosity."

## <a name="analisis">Análise e Negociação

No que toca à negociação de novas características no projeto chegamos à conclusão que existe para cada _pull request_ uma troca de mensagems públicas entre os membros da organização do projeto e o responsável pelo pedido. Durante este processo ambas as partes intervenientes trocam impressões e discutem sobre as modificações feitas(qualquer pessoa poderá dar a sua opinião também). Se não existirem conflitos o pedido é então aceite por um membro da organização e as modificações são adicionadas ao ramo principal do projeto.

> <font color="gray"> "Anyone that is part of theGithub libGDX organization is responsible for reviewing and merging changes."

Podemos observar aqui um exemplo dessa troca de impressões e sucessiva aceitação do pedido: https://github.com/libgdx/libgdx/pull/3458

Existe portanto uma fase de revisão dos pedidos que é realizada por membros da organização _LibGdx_ seguido de uma integração do código ou não no projeto principal.

## <a name="specification">Especificação

Não existe um documento SRS(System Requirement Specification) da _LibGDX_ no entanto podemos ir buscar informações de várias especificações a outras fontes. Uma delas é a página da [_wiki_](https://github.com/libgdx/libgdx/wiki) do projeto, a [página de características](https://libgdx.badlogicgames.com/features.html) da página oficial, ou até a [documentação](https://libgdx.badlogicgames.com/nightlies/docs/api/) da API.

Podemos assim retirar várias especificações do projeto:

  * Uma _framework_ que serve para a criação de aplicações e jogos para diversas plataformas;
  * Desenvolvimento _Cross-Platform_ : Só é necessário uma API para muitas outras plataformas;
  * Suporta audio;
  * Inclui abstrações de _input_ como por exemplo _touch screen_, teclado, acelerómetro;
  * Motor físico e abstrações matemáticas;
  * Abstração de sistema de ficheiros;
  * Processamento gráfico baseado em _OpenGL_;
  * Suporta software de terceiros;
  * Entre outros...

## <a name="validation">Validação

Tirando partido da informação que foi recolhida podemos afirmar que a validação pode ser feita por qualquer membro da organização _LibGDX_ que pode aceitar um _pull request_ ou não de fontes exteriores, normalmente depois de uma troca de opiniões e análise do mesmo pedido.

## Use cases

## <a name="conclusion">Conclusão

Analisando a situação que o projeto LibGdx é um projeto open-source, sem qualquer fim lucrativo, e foi criado para o uso público de estudantes como nós, elementos do grupo.

Não é necessário, portanto, o controlo sobre os recursos como o de um projeto de uma empresa de software mais profissional.

---

####  __Outubro de 2015__

### Authors:

* José Pedro Pereira, up201304891@fe.up.pt

* Pedro Romano Barbosa, up201306037@fe.up.pt

* André Pinto, up201303663@fe.up.pt
