package com.learnspringbootsmongodb.demoAppMongodb.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Accessors(chain = true)
@Document
public class Users {
    private String name;
    private  String surname;
}
