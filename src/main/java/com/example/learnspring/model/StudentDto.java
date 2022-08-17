package com.example.learnspring.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class StudentDto {
    @NotNull
    String name;
    @NotNull
    Integer age;
}
