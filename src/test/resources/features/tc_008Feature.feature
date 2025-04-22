Feature: Validate performance of OCR and MET-IQ process

  Scenario: Validate OCR and MET-IQ processing time
    Given a scanned document that requires OCR and MET-IQ processing is loaded
    When the system submits the file to the OCR-METIQ process
    Then the extracted data should be displayed in less than 30 seconds
      And the results should be shown without excessive delays