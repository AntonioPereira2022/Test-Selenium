# language: pt
@cenario
Funcionalidade: fazer login com sucesso
  Entrar na pagina inicial do automationpractice
  fazer cadastro do usuario e login com sucesso

    # O fundo serve para rodar antes de todos os testes as steps nele contida
  Fundo:
    Dado que eu esteja na tela inicial
    Quando clico em sing-in digito email no campo Email address
    E  clico em create an account

  Cenario: Validar se o login foi realizado com sucesso
    Então serei direcionado para a pagina CREATE AN ACCOUNT

    @teste
  Cenario: Realizar cadastro
    E  preencho o relatorio de cadastro