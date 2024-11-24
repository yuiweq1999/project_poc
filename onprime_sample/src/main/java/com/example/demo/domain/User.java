package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * User Data Object not using DB
 */
@Getter
@Setter
public class User {

    private String name;
    private String jobTitle;
    private Info communicateInformation;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", communicateInformation=" + communicateInformation +
                '}';
    }
}
