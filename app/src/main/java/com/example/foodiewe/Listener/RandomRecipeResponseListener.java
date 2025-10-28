package com.example.foodiewe.Listener;

import com.example.foodiewe.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response , String message);
    void didError(String message);
}
