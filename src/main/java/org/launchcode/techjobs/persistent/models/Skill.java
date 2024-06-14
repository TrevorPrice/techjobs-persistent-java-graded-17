package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description can be up to 500 characters.")
    public String description;

    public Skill() {}

    public @Size(max = 500, message = "Description can be up to 500 characters.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description can be up to 500 characters.") String description) {
        this.description = description;
    }
}
