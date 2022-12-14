package com.example.design_pattern.structural.adapter_pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdapterInSpring {
    /*
    * Spring Security - UserDetailService, UserDetails
    * HandlerAdapter(요청에 따라 다양) RequestMappingHandler.. HandlerAdapter..
    * -> DispatcherServlet (Request) -> Handler -> ModelAndView
    * -> HttpServletRequest와 HttpServletResponse, Object(hanlder)
    * */

    @GetMapping("/test")
    public String getTest() {
        return "tt";
    }

    @ResponseBody
    @GetMapping("/api/test")
    public String getTest2() { return "tt";}
}
