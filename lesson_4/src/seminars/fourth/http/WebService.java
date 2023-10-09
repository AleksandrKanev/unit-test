package seminars.fourth.http;

public class WebService {
    HttpClient httpClient;


    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }


    public String getResult(String s) {
        return httpClient.get(s);
    }
}
