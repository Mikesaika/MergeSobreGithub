package com.mycompany.fishgold.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas unitarias para la lógica de cálculo de liquidación de captura.
 */
class LiquidacionCalculoTest {

    @Test
    @DisplayName("Peso menor a la meta se paga al precio base por kilo")
    void calcularMontoPorDebajoDeMeta() {
        double monto = LiquidacionCalculo.calcularMonto(80.0, 100.0, 2.5);
        assertEquals(200.0, monto, 0.001);
    }

    @Test
    @DisplayName("Peso igual a la meta se paga al precio base por kilo")
    void calcularMontoIgualAMeta() {
        double monto = LiquidacionCalculo.calcularMonto(100.0, 100.0, 2.5);
        assertEquals(250.0, monto, 0.001);
    }

    @Test
    @DisplayName("Exceso sobre la meta se paga al doble del precio base")
    void calcularMontoConExcesoSobreMeta() {
        // 100 kg * 2.5 = 250.0 + 20 kg * 5.0 = 100.0 -> Total: 350.0
        double monto = LiquidacionCalculo.calcularMonto(120.0, 100.0, 2.5);
        assertEquals(350.0, monto, 0.001);
    }

    @Test
    @DisplayName("Peso cero devuelve monto cero")
    void calcularMontoPesoCero() {
        double monto = LiquidacionCalculo.calcularMonto(0.0, 100.0, 3.0);
        assertEquals(0.0, monto, 0.001);
    }
}
