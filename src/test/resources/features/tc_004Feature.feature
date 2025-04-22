Feature: Validar funcionalidad de 'arrastrar y soltar'

  Scenario: Cargar y subir archivos utilizando arrastrar y soltar
    Given que el usuario está en la página de carga de archivos
    When el usuario arrastra y suelta archivos en el recuadro de carga
    Then los archivos se listan en la vista previa correctamente
    When el usuario confirma la carga de los archivos
    Then el sistema carga los archivos sin errores y continua el proceso