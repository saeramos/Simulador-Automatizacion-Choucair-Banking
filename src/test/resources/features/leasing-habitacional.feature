# Autor: Sergio Andres Escobar Ramos


@stories
  Feature: Simulador Canon Bancolombia
  As enter the Bancolombia page and try the simulador canon of housing.

  @scenari1
  Scenario Outline: Realizar registro en Simulador Bancolombia
     Given Sergio ingresa a la pagina de Bancolombia en la seccion
     When Cargar datos para simulacion ingresamos el "<valor_vivienda>" , monto necesario "<valor_necesario>" y los años "<años>"
     #Then Validar costos fijos

    Examples:
    | valor_vivienda   | valor_necesario   | años | año  | mes | dia |
    | 160000000        | 60000000          |   8  | 1980 |  6  |  1  |
    | 260000000        | 50000000          |   5  | 1980 |  4  |  5   |


  Scenario: Realizar registro en Simulador Bancolombia 2
  Given Sergio ingresa a la pagina de Bancolombia en la seccion de leasing
  When Cargar datos para simulacion
      | valor_vivienda   | valor_necesario   | años | año  | mes | dia |
      | 165000000        | 45000000          |   5  | 1980 |  6  |  1  |
  #Then Validar los costos fijos

