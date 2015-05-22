package org.trashacker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author <a href="mailto:gn00023040@gmail.com">Jimmy Lu</a>
 * @since 15/5/23
 */
@Controller
public class WebController {

    @RequestMapping(method = RequestMethod.GET, value = "")
    String index() {
        return "forward:/index.html";
    }
}
