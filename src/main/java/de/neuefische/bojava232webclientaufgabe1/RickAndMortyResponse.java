package de.neuefische.bojava232webclientaufgabe1;

import lombok.Data;

import java.util.List;

@Data
public class RickAndMortyResponse {
    private List<RickAndMortyCharacter> results;
}
