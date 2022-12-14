package com.gtm.controllers.user;

import com.gtm.service.ThesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value = "UserThesisController")
public class ThesisController {
    @Autowired
    private ThesisService thesisService;

}
