package com.friday;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AboutController {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(AboutController.class);
//    private static Logger logger2 = Logger.getLogger("AboutController");


    @Autowired
    private AboutService aboutService;

    @GetMapping(value = "/model")
    public Model getModle() {

//        logger2.info("This is logger 222222");
        logger.info("This is the test log error");
        return new Model("friday", "female");
    }

    @GetMapping(value = "/about")
    public String getAbout() {

//        logger2.info("This is logger 222222");
        logger.info("This is the test log error");
        return "friday is female";
    }
}
