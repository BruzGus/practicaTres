package apiClient;

import io.restassured.response.Response;

public interface IRequest {
    Response send(String url);
}
