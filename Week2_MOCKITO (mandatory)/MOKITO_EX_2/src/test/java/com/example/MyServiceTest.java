package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

public class MyServiceTest {
    @Test
    public void testArgumentMatcher() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData(any(String.class))).thenReturn("Mocked Response");

        MyService service = new MyService(mockApi);
        String result = service.fetchProcessedData("anything");

        assertEquals("Processed: Mocked Response", result);

        verify(mockApi).getData(any(String.class));
    }
}
