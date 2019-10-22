package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @PrimaryKey
    private int id;
    private String name;

////    public User(int i, String name) {
//        this.id=i;
//        this.name=name;
//    }

//    public User(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
