package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("/springmvc/old-controller")
public class OldController implements Controller {
    // 1. HandlerMapping
    //  => BeanNameUrlHandlerMapping에 의해 스프링 빈("/springmvc/old-controller")의 이름으로 핸들러를 찾음
    // 2. HandlerAdapter
    //  => SimpleControllerHandlerAdapter에 의해 Controller 인터페이스(애노테이션x, 과거에 사용) 처리
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handlerRequest");
        return new ModelAndView("new-form");
    }
}
