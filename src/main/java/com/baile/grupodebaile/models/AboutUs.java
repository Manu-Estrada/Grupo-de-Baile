package com.baile.grupodebaile.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aboutus")
public class AboutUs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aboutus")
    private Long id;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false, columnDefinition="TEXT")
    private String description;
    
    @Column(nullable = false)
    private Long position;

    @OneToOne
    private ImageAboutUs imageAboutUs;

    public AboutUs(Long id, Long position, String name, String description, ImageAboutUs imageAboutUs) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.description = description;
    }

    public AboutUs() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageAboutUs getImageAboutUs() {
        return imageAboutUs;
    }

    public void setImageAboutUs(ImageAboutUs imageAboutUs) {
        this.imageAboutUs = imageAboutUs;
    }


}
