#language: pt
@Cadastrar_Uma_Nova_Conta
Funcionalidade: Cadastro de um novo usuario
  Usuario deve fazer um cadastro

  Contexto: Cadastrar um novo usuario
    Dado que estou no aplicativo advantage shopping mobile

  @Cadastro_Sucesso
  Cenario: Cadastro de sucesso
    E clico em fazer login
    E clico preencher cadastro
    Entao e o usuario estara cadastrado

  @Cadastrar_De_Falha
  Cenario: Cadastro de falha
    Entao o usuario nao sera registrado
