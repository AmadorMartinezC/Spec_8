package com.example.duolingo8;

import android.widget.Button;

public class Category {
    private long category_id;

    private String category_name;
    private Button boton_Category;

    //private List<Level> levels;

    // Constructors
    public Category() {
        // Empty Constructor
    }

    public Category(String category_name) {
        super();
        this.category_name = category_name;
    }

    public Category(long category_id, String category_name) {
        super();
        this.category_id = category_id;
        this.category_name = category_name;
    }

    public Category(String category_name, Button boton_Category) {
        this.category_name = category_name;
        this.boton_Category = boton_Category;
    }

    // Getters && Setters:
    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
