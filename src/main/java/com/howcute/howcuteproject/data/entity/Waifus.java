package com.howcute.howcuteproject.data.entity;

import javax.persistence.*;

@Entity
public class Waifus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;
    @Column
    private String description;
    @Column
    private String photo;
    @Column
    private String url;
    @Column
    private String personality;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUrl() {return url;}

    public void setUrl(String url) {this.url = url;}

    public String getPersonality() {return personality;}

    public void setPersonality(String personality) {this.personality = personality;}
}
