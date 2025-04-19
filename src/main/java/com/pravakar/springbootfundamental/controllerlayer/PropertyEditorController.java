package com.pravakar.springbootfundamental.controllerlayer;

import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;

@RestController
@RequestMapping(path = "/api/")
public class PropertyEditorController {

//    @InitBinder
//    private void initBinder(DataBinder dataBinder) {
//        dataBinder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
//    }
//
//    @GetMapping(value = "/fetchUser")
//    public String getUserDetails(
//            @RequestParam(name = "pravakar", required = true) String firstName,
//            @RequestParam(name = "kumar", required = false) String lastName,
//            @RequestParam(name = "age", required = false) Integer age) {
//        return "fetching and returning the user details based on firstName: " + firstName + ", lastName: " + lastName + "and age: " + age;
//    }
}

