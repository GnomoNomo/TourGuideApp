package com.project.angelgnomo.tourguide;

/**
 * Created by Gnomo on 5/21/2018.
 */

public class TourLocation {

    private String locationName;
    private String description;
    private int locationImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public TourLocation(String locationName, String description) {
        this.locationName = locationName;
        this.description = description;
    }

    public TourLocation(String locationName, String description, int locationImage) {
        this(locationName, description);
        this.locationImage = locationImage;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLocationImage() {
        return locationImage;
    }

    public void setLocationImage(int locationImage) {
        this.locationImage = locationImage;
    }

    public boolean hasImage(){
        return locationImage != NO_IMAGE_PROVIDED;
    }
}
