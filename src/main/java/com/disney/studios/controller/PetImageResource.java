package com.disney.studios.controller;

import com.disney.studios.Application;
import com.disney.studios.dto.PetImageDto;
import com.disney.studios.service.PetImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pet")
public class PetImageResource {

    @Autowired
    PetImageService petImageService;

    @RequestMapping(value = "/allImages", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> findAllImages() {
        List<PetImageDto> allByPetBreedName = petImageService.findAll();
        return new ResponseEntity<Object>(allByPetBreedName, HttpStatus.OK);
    }

    @RequestMapping(value = "/allImagesByBreed", method = RequestMethod.GET, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> findAllBreed(@RequestParam(value = "breedName") String name) {
        List<PetImageDto> allByPetBreedName = petImageService.findAllByPetBreedName(name);

        return new ResponseEntity<Object>(allByPetBreedName, HttpStatus.OK);
    }

    @RequestMapping(value = "/voteUp", method = RequestMethod.PUT, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> voteUpImage(@RequestBody PetImageDto petImageDto) {
        PetImageDto petImageDto1 = petImageService.voteUp(petImageDto);
        return new ResponseEntity<Object>(petImageDto1, HttpStatus.OK);
    }

    @RequestMapping(value = "/voteDown", method = RequestMethod.PUT, headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Object> voteDownImage(@RequestBody PetImageDto petImageDto) {
        PetImageDto petImageDto1 = petImageService.voteDown(petImageDto);

        return new ResponseEntity<Object>(petImageDto1, HttpStatus.OK);
    }


}
