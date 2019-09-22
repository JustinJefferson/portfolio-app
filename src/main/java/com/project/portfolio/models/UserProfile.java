package com.project.portfolio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.portfolio.models.profiles.BasicProfile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String zipcode;
    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private User user;
    @Email
    private String email;
    private String firstName;
    private String lastName;
    private List<BasicProfile> profiles;
}
