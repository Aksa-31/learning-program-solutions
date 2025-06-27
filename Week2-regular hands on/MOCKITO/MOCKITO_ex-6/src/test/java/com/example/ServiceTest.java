package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    public void testMethodCallOrder() {
        Service mockService = mock(Service.class);
        mockService.firstStep();
        mockService.secondStep();
        mockService.thirdStep();
        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).firstStep();
        inOrder.verify(mockService).secondStep();
        inOrder.verify(mockService).thirdStep();
    }
}
