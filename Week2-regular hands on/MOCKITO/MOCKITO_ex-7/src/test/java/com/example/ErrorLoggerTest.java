package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ErrorLoggerTest {

    @Test
    public void testVoidMethodThrowsException() {
        ErrorLogger mockLogger = mock(ErrorLogger.class);

        doThrow(new RuntimeException("Logging failed"))
                .when(mockLogger).logError("CRITICAL ERROR");

        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> mockLogger.logError("CRITICAL ERROR")
        );

        assertEquals("Logging failed", thrown.getMessage());

        verify(mockLogger).logError("CRITICAL ERROR");
    }
}
