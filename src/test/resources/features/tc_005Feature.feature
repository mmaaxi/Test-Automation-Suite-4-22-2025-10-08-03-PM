Feature: Validar la vista previa de archivos y opción de eliminar

  Scenario: Vista previa del archivo
    Given El usuario ha cargado un documento
    When La vista previa del archivo es visible
    Then El nombre, tamaño y tipo se muestra correctamente

  Scenario: Eliminar archivo de la vista previa
    Given Un archivo está en la vista previa
    When El usuario elimina el archivo
    Then El archivo ya no aparece en la lista de carga