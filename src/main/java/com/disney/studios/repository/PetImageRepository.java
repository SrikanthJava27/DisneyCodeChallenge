package com.disney.studios.repository;

import com.disney.studios.domain.PetImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by maheshkumargaddam on 7/14/17.
 */
@Repository
public interface PetImageRepository  extends JpaRepository<PetImage, UUID> {


    List<PetImage> findAllOrderByFavouritesDesc();

    List<PetImage> findAllByPetBreedNameOrderByFavouritesDesc();

    PetImage save(PetImage petImage);
}