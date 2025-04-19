package com.pravakar.springbootfundamental.controllerlayer;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Reflection is a powerful feature in Java that allows code to inspect and manipulate itself at runtime.
 * With reflection, you can:
 * Inspect classes, methods, fields, and annotations
 * Instantiate objects
 * Invoke methods
 * Modify private fields — even if you don’t know them at compile time
 * It's all part of the java.lang.reflect package.
 */

@Controller
public class SampleController {

    @RequestMapping(value = "/fetchUser", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String getUserDetails(


    ) {
        return "fetching and returning";
    }
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    @ResponseBody
    public String saveUserDetails() {
        return "successfully saved the user details";
    }
}
