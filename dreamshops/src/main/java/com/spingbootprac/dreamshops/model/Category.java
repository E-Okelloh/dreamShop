package com.spingbootprac.dreamshops.model;

import jakarta.persistence.OneToMany;

import java.nio.MappedByteBuffer;
import java.util.List;

public class Category {
    private int Id;
    private String name;




    @OneToMany(MappedBy)
    private List<Product> products;


}
