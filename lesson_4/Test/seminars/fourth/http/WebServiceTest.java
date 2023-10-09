package seminars.fourth.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class WebServiceTest {
    @Test
    void testGetWeb(){
        HttpClient httpClient = mock(HttpClient.class);
        WebService webService = new WebService(httpClient);
        when(httpClient.get("http//localhost:8080")).thenReturn("Home webpage");

        assertEquals("Home webpage", webService.getResult("http//localhost:8080"));
        verify(httpClient, times(1)).get("http//localhost:8080");

    }
}
