package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotificationCalled() {
        Notifier mockNotifier = mock(Notifier.class);
        NotificationService service = new NotificationService(mockNotifier);

        service.notifyUser();

        verify(mockNotifier).sendNotification("Hello user!");
    }
}
