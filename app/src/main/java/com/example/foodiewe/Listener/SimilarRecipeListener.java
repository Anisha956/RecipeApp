package com.example.foodiewe.Listener;

import com.example.foodiewe.Models.RandomRecipeApiResponse;
import com.example.foodiewe.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipeListener {

    void didFetch(List<SimilarRecipeResponse> response , String message);
    void didError(String message);

}
