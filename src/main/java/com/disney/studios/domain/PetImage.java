package com.disney.studios.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by maheshkumargaddam on 7/14/17.
 */
public class PetImage extends AbstarctDomainObject {
    @Id
    @Column(name = "IMAGE_ID")
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID imageId;
    @Column(name = "BREED_NAME")
    private String petBreedName;
    @Column(name = "FAVOURITES")
    private Integer favourites;
    @Column(name = "URL")
    private String URL;


    public UUID getImageId() {
        return imageId;
    }

    public void setImageId(UUID imageId) {
        this.imageId = imageId;
    }

    public String getPetBreedName() {
        return petBreedName;
    }

    public void setPetBreedName(String petBreedName) {
        this.petBreedName = petBreedName;
    }

    public Integer getFavourites() {
        return favourites;
    }

    public void setFavourites(Integer favourites) {
        this.favourites = favourites;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
