# language: es

Característica: Realizar una compra

  @RealizarCompra
  Escenario: Comprar múltiples productos y confirmar compra exitosa
    Dado que el usuario abre la página Product Store
    Cuando el usuario agrega los siguientes productos al carrito:
      | Categoria | Producto |
      | Phones    | Samsung galaxy s6 |
      | Monitors  | ASUS Full HD |
      | Laptops   | 2017 Dell 15.6 Inch |
    Y el usuario selecciona la opción Cart
    Y el usuario hace clic en el botón Place Order
    Y el usuario realiza la compra llenando el formulario con los siguientes datos:
      | Nombre | Departamento | Ciudad | TarjetaCredito | Mes | Anio |
      | Juan Perez | Valle Del Cauca | Cali | 1555 11 552 44 | Septiembre | 2023 |
    Entonces el usuario confirma el mensaje "Thank you for your purchase!" de compra exitosa