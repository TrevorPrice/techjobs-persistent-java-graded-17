package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 500, message = "Description can be up to 500 characters.")
    public String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(String description) {
        super();
        this.description = description;
    }

    public @Size(max = 500, message = "Description can be up to 500 characters.") String getDescription() {
        return description;
    }

    public void setDescription(@Size(max = 500, message = "Description can be up to 500 characters.") String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}