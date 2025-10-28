package com.example.foodiewe.Listener;

import com.example.foodiewe.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response , String message);
    void didError(String message);
}
