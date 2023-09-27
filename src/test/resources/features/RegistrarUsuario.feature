# language: es

Característica: Registro de un nuevo usuario en la página Product Store.


  @RegistarUsuarioExitoso
  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario abre la página Product Store
    Cuando el usuario hace clic en el apartado Sign up
    Y el usuario ingresa el nombre de usuario "jose125545" y la contraseña "contra777"
    Y el usuario hace clic en el botón Sign up
    Entonces el usuario confirma el alert de registro exitoso
