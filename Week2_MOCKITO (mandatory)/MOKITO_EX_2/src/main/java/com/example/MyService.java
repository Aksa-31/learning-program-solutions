package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchProcessedData(String input) {
        String data = api.getData(input);
        return "Processed: " + data;
    }
}
