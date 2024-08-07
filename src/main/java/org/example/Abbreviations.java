package org.example;

import java.util.HashMap;
// Ex 2
public class Abbreviations {
    private HashMap<String,String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);

    }




}
