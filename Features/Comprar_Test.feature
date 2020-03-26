#language: pt
@Abrir_Um_Produto
Funcionalidade: clicar em um produto na tela de inicio e
  Deve Abrir um produto pela tela principal

  Contexto: Dado que estou na tela incial do aplicativo advantage mobile

  @Teste_Positivo
  Cenario: Compra um produto pela tela inicial positivo
    Dado que toco na categoria escolhida
    E deve abrir a tela do produto escolhido
    Entao aparecera a tela do produto escolhido

  @Teste_Negativo
  Cenario: Nao devera aceitar uma quantidade maior que 10 produtos no carrinho de compra
    Dado que estou logado e o carrinho esta vazio
    E o usuario na categoria escolhida e selecionar o produto desejado e a quantidade
    Entao nao ira conseguir adiciona mais de dez itens no carrinho
