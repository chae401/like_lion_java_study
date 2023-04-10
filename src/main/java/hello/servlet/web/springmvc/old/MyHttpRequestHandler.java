package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/springmvc/request-handler")
public class MyHttpRequestHandler implements HttpRequestHandler {
    // 1. HandlerMapping
    // => BeanNameUrlHandlerMapping으로 스프링 빈("/springmvc/request-handler")의 이름으로 핸들러를 찾는다.
    // 2. HandlerAdapter
    //  => HttpRequestHandlerAdapter에 의해 HttpRequestHandler가 처리된다.
    // 3. HandlerAdapter 실행
    //  => 디스패처 서블릿이 조회한 HttpRequestHandlerAdapter를 실행하면서 핸들러 정보도 함께 넘겨준다
    //  => HttpRequestHandlerAdapter는 핸들러인 MyHttpRequestHandler를 내부에서 실행하고, 그 결과를 반환한다.
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MyHttpRequestHandler.handleRequest");
    }
}
