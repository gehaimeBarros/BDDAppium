#language: pt

@Busca_Na_Home
Funcionalidade: O usuario buscara um produto pelo campo de busca
Contexto: 
Dado que o usuario na tela incial do aplicativo advantage mobile 

@Teste_Positivo
Cenario: Buscara um produto existente
    Dado que o usuario clica e busca o seu produto 
    Entao a pagina do resultado aparecera com o resultado da busca do seu produto
    
@Teste_Negativo
Cenario: Buscara um produto inexistente
    Dado que o usuario clica no campo de busca e procuro por um produto 
    Entao aparecera uma pagina informando que o produto nao foi encontrado
