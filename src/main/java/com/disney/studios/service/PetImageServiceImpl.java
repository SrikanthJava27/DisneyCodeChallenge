package com.disney.studios.service;

import com.disney.studios.domain.PetImage;
import com.disney.studios.dto.PetImageDto;
import com.disney.studios.repository.PetImageRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by maheshkumargaddam on 7/14/17.
 */
public class PetImageServiceImpl implements PetImageService {

    @Autowired
    PetImageRepository petImageRepository;

    @Override
    public List<PetImageDto> findAll() {

        List<PetImage> petImages = petImageRepository.findAllOrderByFavouritesDesc();
        return toDtoList(petImages);
    }

    private List<PetImageDto> toDtoList(List<PetImage> petImages) {
        List<PetImageDto> petImageDtos = Lists.newArrayList();
        for (PetImage petImage : petImages) {
            PetImageDto petImageDto = toDto(petImage);
            petImageDtos.add(petImageDto);
        }

        return petImageDtos;
    }

    private PetImageDto toDto(PetImage petImage) {
        PetImageDto petImageDto = new PetImageDto();
        BeanUtils.copyProperties(petImage, petImageDto);

        return petImageDto;
    }

    @Override
    public List<PetImageDto> findAllByPetBreedName() {
        List<PetImage> petImages = petImageRepository.findAllByPetBreedNameOrderByFavouritesDesc();

        return toDtoList(petImages);
    }

    @Override
    public PetImageDto voteUp(PetImageDto petImageDto) {
        PetImage petImage = petImageRepository.save(toDomain(petImageDto));

        return  toDto(petImage);
    }

    private PetImage toDomain(PetImageDto petImageDto) {
        PetImage petImage = new PetImage();
        BeanUtils.copyProperties( petImageDto,petImage);
        return petImage;
    }

    @Override
    public PetImageDto voteDown(PetImageDto petImageDto) {
        PetImage petImage = petImageRepository.save(toDomain(petImageDto));

        return  toDto(petImage);
    }
}
