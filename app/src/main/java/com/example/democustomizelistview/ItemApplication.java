package com.example.democustomizelistview;

public class ItemApplication {
    private long id;
    private String name;
    private float rating;
    private String imageURL;

    public ItemApplication() {
    }

    public ItemApplication(String name,float rating, String imageURL) {
        this.name = name;
        this.rating = rating;
        this.imageURL = imageURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "ItemApplication{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
