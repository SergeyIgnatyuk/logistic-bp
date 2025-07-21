package by.logisticbp.interceptor;

import by.logisticbp.client.KeycloakTokenClient;
import by.logisticbp.utils.UserContext;
import by.logisticbp.utils.UserContextHolder;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserContextRequestInterceptor implements RequestInterceptor {

    private final KeycloakTokenClient tokenClient;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String token = tokenClient.getAccessToken();
        requestTemplate.header(HttpHeaders.AUTHORIZATION, "Bearer " + token);
        requestTemplate.header(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
    }
}
