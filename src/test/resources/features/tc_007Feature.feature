Feature: Validar proceso de eliminación de archivo antes de confirmar carga

  Scenario: Cargar y eliminar un archivo antes de confirmar la carga
    Given el usuario ha seleccionado un archivo para cargar
    When el sistema da un error en la carga inicial
    Then el archivo es mostrado en la lista de carga
    When el usuario hace clic en la opción eliminar sobre el archivo cargado
    Then el archivo es removido de la lista de carga