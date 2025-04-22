Feature: Validar almacenamiento en el historial de la solicitud de cotización

  Scenario: Completar y revisar historial de la solicitud de cotización
    Given el usuario ha iniciado sesión y está en la página de carga de documentos
    When completa el proceso de carga de documentos exitosamente
    Then el sistema guarda una copia de los archivos originales y los datos extraídos
    When revisa el historial de la solicitud de cotización
    Then se visualizan correctamente las copias de los documentos y los resultados extraídos