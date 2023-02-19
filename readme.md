 //principio de desarrollo
    /*estoy trabajando en una aplicacion la cual se basa en principios de seguridad ,
     esta debe contener informacion acerca de tarjetas magneticas de credito: cada
     #TARJETA NORMAL:
     contendra un
         + alias,
         + un tipo(o sea a que banco pertenece si es Bandec, Metropolitan, BPA, Visa , MAsterdCard,  etc),
         + un numero,
         +el nombre del propietario, y
         +la moneda que opera.
      La aplicacion ademas contiene 3 tipos de tarjetas estas son
       TARJETAS PRIVADAS, TARJETAS DE UN COLEGA, y TARJETA DE LA MATRIX ASOSIADA.
       #las PRIVADAS: contendran andemas de toda la informacion que ya contienen las TARJETAS NORMALES  informacion acerca del
           + pin,
           +fecha de expiracion en formato MM/AA,
           +el pin de la tarjeta para operar en cajeros automaticos,
            +el pin para operar con esta en plataformas digitales y
            +una tarjeta matrix asociada.
       #por la parte de TARJETAS DE UN COLEGA contendran solo la informacion basica de las tarjetas normales ademas de un
            +numero telefonico para confirmar pagos,
       #la  TARJETA DE LA MATRIX ASOSIADA solo contendran informacion acerca de
            +una matriz de 10x10 ,
            +el numero de esta tarjeta y
            + el numero de la tarjeta asociada a la que estaran asociada


       Las funciones de la aplicacion serian las siguientes
            -Permitir al usuario almacenar cualquier tarjeta ya sea privada de un colega, o una matrix
            -Permitir al usuario editar la información de cualquier tarjeta almacenada previamente
            -Permitir al usuario eliminar cualquier tarjeta previamente almacenada
            -Permitir al usuario ver la información completa de cualquier tarjeta almacenada
            -Permitir al usuario buscar cualquier tarjeta por alias, nombre del propietario o número de tarjeta
            -Proveer al usuario de información acerca de cualquier tarjeta, incluyendo el banco al que pertenece, la moneda en la que opera, y su tipo (normal, privada, de un colega, o matrix asociada)
            -Validar la información proporcionada por el usuario al momento de agregar o editar cualquier tarjeta, asegurándose de que todos los datos requeridos estén presentes y sean válidos.



   Autenticación de usuario: asegurarse de que solo el propietario de la cuenta tenga acceso a la información de las tarjetas almacenadas.

Cifrado de información sensível: encriptar la información de las tarjetas, como los números de tarjeta y la fecha de vencimiento, para proteger la privacidad y seguridad de los usuarios.

Notificaciones de seguridad: notificar al usuario sobre cualquier actividad sospechosa relacionada con sus tarjetas, como intentos de acceso no autorizado o cambios en la información de la tarjeta.

Integración con bancos y proveedores de tarjetas: permitir al usuario verificar el saldo y el historial de transacciones de sus tarjetas en tiempo real, sin tener que acceder a múltiples sitios web o aplicaciones.

Interfaz fácil de usar: diseñar una interfaz intuitiva y fácil de usar, que permita al usuario realizar acciones como agregar, editar o eliminar tarjetas de manera rápida y sencilla.

Soporte técnico: proporcionar soporte técnico a los usuarios para ayudarlos a resolver cualquier problema o duda que puedan tener con el sistema de gestión de tarjetas.




Regenerate response  */
    //a tener en cuenta
    /*
Para almacenar la información de las tarjetas de crédito en una aplicación segura, es importante tener en cuenta los siguientes puntos:

Cifrado de datos: Todos los datos sensibles, como el número de tarjeta, la fecha de expiración y el PIN, deben ser cifrados antes de ser almacenados en la base de datos.

Autenticación de usuario: La aplicación debe requerir una autenticación segura para acceder a la información de las tarjetas de crédito.

Acceso controlado: La aplicación debe tener un sistema de acceso controlado para garantizar que solo los usuarios autorizados puedan acceder a la información de las tarjetas de crédito.

Almacenamiento seguro: La información de las tarjetas de crédito debe ser almacenada en un servidor seguro y protegido contra posibles ataques.

Verificación de datos: La aplicación debe verificar la integridad de los datos antes de ser almacenados y proporcionar una notificación en caso de detectar cualquier problema.

Soporte de seguridad: La aplicación debe contar con un soporte de seguridad activo para responder a posibles vulnerabilidades o amenazas.

En resumen, para garantizar la seguridad de la información de las tarjetas de crédito en la aplicación, es importante implementar medidas de seguridad efectivas y mantenerlas actualizadas regularmente.

*/
/  *
    *
    *
        * Validación de fecha de vencimiento: se debe verificar que la fecha de vencimiento proporcionada sea válida y no esté vencida.

    OK    *Validación de PIN: se debe verificar que los PIN proporcionados tengan una longitud válida y contengan solo números.

         *Validación de nombre del titular de la tarjeta: se deben verificar que el nombre proporcionado sea válido y no contenga caracteres no permitidos.

         #Validación de tipo de tarjeta: se deben verificar que el tipo de tarjeta proporcionado sea válido y esté dentro del conjunto de tipos permitidos.

          #Validación de moneda: se deben verificar que la moneda proporcionada sea válida y esté dentro del conjunto de monedas permitidas.

    * */