package com.example.foodiewe.Listener;

import com.example.foodiewe.Models.InstructionsResponse;
import com.example.foodiewe.Models.RandomRecipeApiResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response , String message);
    void didError(String message);
}
