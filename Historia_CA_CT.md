Como usuario do sistema
Quero poder acessar os indicadores da api do World Bank
Para analizar e conferir dados coletaddos de outras apis

## Critereios de Aceite e Casos de testes
Critério #1: Acessar a ulr do projeto carregar grafico vazio e uma lista dos paises.
Critério #2: Ser possivel selecionar o pais que estiver na lista de paises
Critério #3: Aplicativo nao deve estar usando a api da world bank e sim o servico desenvolvido para isso
Criterio #4: Servico de paises devera retornar as informações consultadas na api do world bank

## Cenário 1:
Acessar tela do sistema
Dado que eu sou um usuario do sistema  
Quando acesso a tela inicia    
Então eu vejo o grafico vazio, e uma lista de selecao de pais com os paises disponiveis

## Cenário 2:
Selecionar um pais
Dado que eu sou um usuario do sistema  
Quando quero selecionar um pais da lista   
Então eu vejo o pais que selecionei na lista

## Cenário 3:
Acionar botao de busca
Dado que eu sou um usuario do sistema  
Quando quero clico no botao de buscar
E estou com o pais selecionado   
Então eu vejo o grafico preenchido com as informacoes que vierao da api desenvolvida
