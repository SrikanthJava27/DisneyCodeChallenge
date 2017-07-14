package com.disney.studios.service;

import com.disney.studios.dto.PetImageDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maheshkumargaddam on 7/14/17.
 */
@Service
public interface PetImageService {

    List<PetImageDto> findAll();

    List<PetImageDto> findAllByPetBreedName();

    PetImageDto voteUp(PetImageDto petImage);

    PetImageDto voteDown(PetImageDto petImage);
}
