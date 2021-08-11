Feature: Reservar un vuelo en la paguina web de avianca ingresando los datos de la ciudad de origeny destino, las fechas de ida y vuelta y el numero de pasajeros para obtener el listado de vuelos disbonibles bajo los parametros ingresados

Scenario Outline: Busco reservas de vuelos entre dos ciudades con fechas de ida y vuelta
  Given Ingreso a la pagina web de avianca
  When Selecciono la ciudad de <origen> y la ciudad <destino> ademas de la fecha de <ida> y la fecha de <regreso> con <pasajeros>
  Then Obtengo el listado de vuelos para reservar junto con sus precios

  Examples:
  | origen | destino | ida | regreso | pasajeros |
  | Cali | Bogota | "Vie, 20 ago" | "Lun, 27 sep" | 2 |