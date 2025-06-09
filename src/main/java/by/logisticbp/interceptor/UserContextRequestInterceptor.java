package by.logisticbp.interceptor;

import by.logisticbp.utils.UserContext;
import by.logisticbp.utils.UserContextHolder;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserContextRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(UserContext.CORRELATION_ID, UserContextHolder.getContext().getCorrelationId());
    }
}
