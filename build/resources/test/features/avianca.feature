Feature: Probar el sistema de reservas de avianca

  Scenario Outline: Busco reservas de vuelos entre dos ciudades con fechas de ida y vuelta
    Given Ingreso a la pagina web de avianca
    When Selecciono la ciudad de <origen> y la ciudad <destino> ademas de la fecha de <ida> y la fecha de <regreso>
    Then Obtengo el listado de vuelos para reservar junto con sus precios

    Examples:
    | origen | destino | ida | regreso |
    | "Cali" | "Madrid" | "Vie, 20 ago" | "Lun, 27 sep" |

  Scenario Outline: Busco el listado de horarios de vuelos ordenados de una manera especifica
    Given Ingreso a la pagina web de avianca y accedo al menu
    When Ingreso la ciudad de <origen> y la ciudad <destino> ademas de la fecha de <ida> y la fecha de <regreso> para ver los horarios de vuelo disponibles
    Then Obtengo el listado de horarios de vuelos y los organizo dependiendo de la fecha de salida

    Examples:
    | origen | destino | ida | regreso |
    | "Cali" | "Madrid" | "Vie, 20 ago" | "Lun, 27 sep" |