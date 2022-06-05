package com.example.demo_diplom.rest.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "publicationDate")
    private Date publicationDate;

    @Column(name = "beginDate")
    private Date beginDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "imageId")
    private int imageId;

    public Project() {
    }

    public Project(final String name, final String description, final Date publicationDate, final Date beginDate, final Date endDate, final int imageId) {
        this.name = name;
        this.description = description;
        this.publicationDate = publicationDate;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(final Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(final Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(final int imageId) {
        this.imageId = imageId;
    }
}
