package org.mayii.junit5app.ejemplos.models;

import org.junit.jupiter.api.Test;
import org.mayii.junit5app.ejemplos.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {
    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("1000.12345"));
        String esperado = "Mayii";
        String real = cuenta.getPersona();
        assertEquals("Mayii", real);
    }

    @Test
    void testSaldoCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testReferenciaDeCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("8.900"));
        Cuenta cuenta2 = new Cuenta("Mayii", new BigDecimal("8.900"));

        // assertNotEquals(cuenta2, cuenta);
        assertEquals(cuenta2, cuenta);

    }

    @Test
    void testDebitoCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));

        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testCreditoCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));

        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testDineroInsuficienteExceptionCuenta() {
        Cuenta cuenta = new Cuenta("Mayii", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero insuficiente";
        assertEquals(esperado,actual);
    }
}