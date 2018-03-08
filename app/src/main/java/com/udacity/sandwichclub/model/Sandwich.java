package com.udacity.sandwichclub.model;

import java.util.List;

public class Sandwich {

    private String mainName;
    private List<String> alsoKnownAs = null;
    private String placeOfOrigin;
    private String description;
    private String image;
    private List<String> ingredients = null;

    /**
     * No args constructor for use in serialization
     */
    public Sandwich() {
    }

    public Sandwich(String mainName, List<String> alsoKnownAs, String placeOfOrigin, String description, String image, List<String> ingredients) {
        this.mainName = mainName;
        this.alsoKnownAs = alsoKnownAs;
        this.placeOfOrigin = placeOfOrigin;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
    }

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public List<String> getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(List<String> alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String  toString() {
        final StringBuilder sb = new StringBuilder("Sandwich{");
        sb.append("mainName='").append(mainName).append('\'');
        sb.append(", alsoKnownAs=").append(alsoKnownAs);
        sb.append(", placeOfOrigin='").append(placeOfOrigin).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", ingredients=").append(ingredients);
        sb.append('}');
        return sb.toString();
    }

    public String  toTextView() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Also Known As: ").append(alsoKnownAs).append("\n\n\n");
        sb.append("Place Of Origin: ").append(placeOfOrigin).append("\n\n\n");
        sb.append("Description: ").append(description).append("\n\n\n");
        sb.append("Ingredients: ").append(ingredients).append("\n\n\n");
        return sb.toString();
    }
}
