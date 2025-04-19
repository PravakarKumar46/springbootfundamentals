package com.pravakar.springbootfundamental.controllerlayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/")
public class SampleRestController {

    @GetMapping(value = "/fetchUser", consumes = "application/json", produces = "application/json")
    public String getUserDetails(/* RequestParam is used to get the request parameter */
            @RequestParam(name = "pravakar", required = true) String firstName,
            @RequestParam(name = "kumar", required = false) String lastName,
            @RequestParam(name = "age", required = false) Integer age) {
        return "fetching and returning the user details based on firstName: " + firstName + ", lastName: " + lastName + "and age: " + age;
    }

    /**
     * url:/api/fetchUser?firstName=pravakar&lastName=kumar&age=25
     * baseUrl: http://localhost:8080
     * fullUrl: http://localhost:8080/api/fetchUser?firstName=pravakar&lastName=kumar&age=25
     */

    @GetMapping(value = "/fetchUser/{firstName}")
    public String getUserDetailsPathVariable(
            @PathVariable(value = "firstName") String firstName,
            @RequestBody User user) {
        return "fetching and returning the user details based on firstName: " + firstName;
    }

    /**
     * url: /api/fetchUser/{firstName}
     */

    @GetMapping(value = "/fetchUser")
    public ResponseEntity<String> getUserDetailsResponseBody(
            @RequestParam(name = "pravakar", required = true) String firstName) {
        String output = "fetching and returning the user details based on firstName: " + firstName;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }


    @PostMapping(value = "/saveUser")
    public String saveUserDetails() {
        return "successfully saved the user details";
    }

}
