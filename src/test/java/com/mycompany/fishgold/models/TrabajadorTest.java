package com.mycompany.fishgold.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.sql.Timestamp;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas unitarias para el modelo Trabajador.
 */
class TrabajadorTest {

    @Test
    @DisplayName("toString devuelve nombre completo y rol entre paréntesis")
    void toStringDevuelveFormatoEsperado() {
        Trabajador t = new Trabajador(
                1,
                "0912345678",
                "Juan Mendoza",
                "Capitán",
                "0991234567",
                "Manta",
                "Activo",
                new Timestamp(System.currentTimeMillis()));

        assertEquals("Juan Mendoza (Capitán)", t.toString());
        assertEquals("0912345678", t.getCedulaDni());
        assertEquals("Activo", t.getEstado());
    }
}
