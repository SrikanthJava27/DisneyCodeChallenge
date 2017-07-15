package com.disney.studios.repository;

import com.disney.studios.domain.PetImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PetImageRepository extends JpaRepository<PetImage, UUID> {

    List<PetImage> findAll();

    List<PetImage> findAllByPetBreedName(String name);

    PetImage save(PetImage petImage);
}