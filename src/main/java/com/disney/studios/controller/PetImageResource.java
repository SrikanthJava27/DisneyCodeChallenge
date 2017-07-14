package com.disney.studios.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maheshkumargaddam on 7/14/17.
 */

@RestController

@RequestMapping("/pet")
public class PetImageResource {

    @RequestMapping("/allImages")
    public ResponseEntity<Object> findAllImages()
    {
        return new ResponseEntity<Object>("Hello", HttpStatus.OK);
    }

    @RequestMapping("/allImagesByBreed")
    public ResponseEntity<Object> findAllBreed() {
        return new ResponseEntity<Object>("Hello", HttpStatus.OK);
    }
    @RequestMapping("/voteUp")
    public ResponseEntity<Object>  voteUpImage()
    {
        return new ResponseEntity<Object>("Hello", HttpStatus.OK);
    }

    @RequestMapping("/votedown")
    public ResponseEntity<Object>  voteDownImage()
    {
        return new ResponseEntity<Object>("Hello", HttpStatus.OK);
    }


}
