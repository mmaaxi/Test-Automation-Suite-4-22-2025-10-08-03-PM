Feature: Validar carga de documentos con formato permitido

  Scenario: Subir un documento en formato PDF
    Given que estoy en el portal de Intake
    When selecciono la opción de 'Carga de documentos'
    Then la opción de carga se muestra correctamente
    When selecciono un archivo de documento en formato PDF
    Then el sistema acepta el archivo y muestra la vista previa
    When confirmo la carga del documento
    Then el sistema procesa el archivo y notifica carga exitosa