package com.almostreliable.unified.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.function.BiFunction;

public interface RecipeTransformations {
    void forEachObject(String property, BiFunction<JsonObject, RecipeContext, JsonObject> consumer);

    void replaceIngredient(String property);

    void replaceResult(String property);

    void put(String property, BiFunction<JsonElement, RecipeContext, JsonElement> consumer);

    <T extends JsonElement> void put(String property, Class<T> type, BiFunction<T, RecipeContext, T> consumer);
}