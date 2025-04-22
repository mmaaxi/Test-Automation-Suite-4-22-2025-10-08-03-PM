Feature: Validar separación de carga para documentos de cotización y Art. 492

  Scenario: Cargar documentos separados para cotización y Art. 492
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona la opción de cargar documentos separados para cotización y Art. 492
    Then el sistema muestra dos recuadros distintos para cada tipo de documento
    When el usuario carga un archivo en cada recuadro y revisa la vista previa
    Then ambos archivos se muestran correctamente en sus respectivas secciones