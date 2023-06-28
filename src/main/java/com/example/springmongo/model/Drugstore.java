package com.example.springmongo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "drugstore")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Drugstore {

    @Id
    private String id;
    private String branch;
    private String address;

    @DocumentReference
    private List<Employee> employees;
}
