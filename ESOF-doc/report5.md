![FEUP logo](http://conference.mercatura.pt/gequaltec2015/site/images/feup.png)

### MIEIC - Mestrado Integrado em Engenharia Informática e Computação
### ESOF - Engenharia de Software

# Implementação e melhoramento de uma _feature_

## Índice
1. [Introdução](#intro)
2. [_Feature_: Captura de ecrâ](#feature)
   * [Antes da feature](#before)
   * [Objetivo](#objective)
   * [Código](#code)
   * [_Pull Request_](#pull)
4. [Conclusão](#conclusion)


## <a name="intro"> 1. Introdução

Este _deliverable_ tem como objetivo mostrar os vários elementos que fizeram parte da integração de uma nova _feature_ no projeto da _framework_ LibGDX.

Abordar-se-á os componentes que rodeiam a nova _feature_ assim como o seu objetivo, partes fundamentais do seu código e consequentemente o _pull request_ da mesma submetido através do Github.

## <a name="intro"> 2. _Feature_: Captura de Ecrâ

A LibGDX por já ter sido usada anteriormente para outros projetos por todos os elementos do grupo, surgiram certas necessidades práticas que a _framework_ não conseguia fornecer no seu estado atual. Uma dessas necessidades era tirar uma imagem a partir da tela da aplicação. Decidiu-se por isso escolher esta funcionalidade para implementar e melhorar.

### <a name="before"> 2.1 Antes da _feature_

Esta funcionalidade já poderia ser implementada a partir de outros recursos que a LibGDX fornecia. Aliás, existe na própria _wiki_ desta uma implementação que ajuda o utilizador a fazer uma captura de ecrâ:

![implementação](Resources/rep5screen1.png)
Retirada de: https://github.com/libgdx/libgdx/wiki/Take-a-Screenshot

Porém a LibGDX não contém uma classe capaz de gerir esta funcionalidade, isto é, esconder a parte do código desnecessária e substitui-la por funções intuitivas e fáceis de usar.

### <a name="objective"> 2.2 Objetivo

O objetivo desta funcionalidade é a capacidade do utilizador, a um dado momento do ciclo de vida da aplicação, poder capturar o ecrâ ou até uma parte dele através de abstração fornecida por uma classe. Assim o utilizador não precisará de perceber o código subjacente à funcionalidade. Só terá de usar os métodos fornecidos pela nova classe chamada __ScreenCapturer__.

Para além disso, o utilizador poderá também escolher se quer aplicar o efeito de tom de cinza a aplicar à imagem, podendo a qualquer momento voltar ao modo normal e vice-versa.

Um objetivo que não chegou a ser concretizado foi o aumento ou diminuição do brilho e da saturação devido a complicações da parte técnica e por ser algo secundário comparado com o resto.

### <a name="code"> 2.3 Código


### <a name="pull"> 2.4 _Pull Request_



## 3. <a name="conclusion"> Conclusão
