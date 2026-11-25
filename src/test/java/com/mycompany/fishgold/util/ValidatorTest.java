package com.mycompany.fishgold.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Pruebas unitarias para las validaciones puras de texto en Validator.
 */
class ValidatorTest {

    @Test
    @DisplayName("Texto válido no está en blanco")
    void isNotBlankConTextoValido() {
        assertTrue(Validator.isNotBlank("Capitán Pérez"));
    }

    @Test
    @DisplayName("Cadena vacía o solo espacios devuelve false")
    void isNotBlankConVacioOEspacios() {
        assertFalse(Validator.isNotBlank(""));
        assertFalse(Validator.isNotBlank("   "));
    }

    @Test
    @DisplayName("Cadena null devuelve false sin lanzar excepción")
    void isNotBlankConNull() {
        assertFalse(Validator.isNotBlank((String) null));
    }
}
