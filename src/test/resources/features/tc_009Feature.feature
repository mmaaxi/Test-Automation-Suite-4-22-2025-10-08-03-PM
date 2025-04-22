Feature: Validar notificación y mensajes de error en caso de formato no válido

  Scenario: Rechazar archivo con formato no soportado
    Given el usuario está en la página de carga de archivos
    When intenta cargar un archivo con extensión ".exe"
    Then el sistema debe rechazar el archivo
    And se debe mostrar un mensaje de error claro y descriptivo
    And el mensaje debe indicar la causa del error y recomendaciones