#Author: Diana Camacho
# language:es


@Regresion
Característica: Ingresar a la pagina de tutorial ninja
  Seleccionar el producto a ser agregado
  Para validar que fue agregado correctamente al carrito de compras

  @Caso1
     Escenario: Ingresar a la pagina de tutorial ninja, crear un usuario para compras y verificar que el nombre de usuario corresponde al usuario que ingresa
     Dado que Diana ingresa a la pagina de tutorial ninja
     Cuando  requiero crear un usuario para realizar una compra
        |Nombre|Apellido|Email|Telefono|Password|ConfPassword|
        |Diana|Camacho|hola8@gmail.com|12345|diana|diana|
     Entonces verificar que el nombre del usuario corresponde al usuario con el que ingresa


    @Caso2
     Escenario: Loguearse en la pagina tutorial ninja y agregar un articulo y verificar que el articulo fue cargado al carrito de compras
     Dado que Diana se loguea en la pagina de tutorial nina
     Cuando requiero agregar un articulo al carrito de compra
        |Email|Password|Producto|
        |hola8@gmail.com|diana|iPhone|
      Entonces verificar que el articulo fue cargado en el carrito de compra




