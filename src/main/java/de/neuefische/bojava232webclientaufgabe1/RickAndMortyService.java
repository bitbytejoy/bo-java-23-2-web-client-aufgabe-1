package de.neuefische.bojava232webclientaufgabe1;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyService {
    public List<RickAndMortyCharacter> getAllCharacters() {
        WebClient rickAndMortyWebClient = WebClient.create("https://rickandmortyapi.com/api");

        RickAndMortyResponse response = rickAndMortyWebClient
                .get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyResponse.class)
                .block()
                .getBody();

        return response.getResults();
    }

    public List<RickAndMortyCharacter> getAllAliveCharacters() {
        WebClient rickAndMortyWebClient = WebClient.create("https://rickandmortyapi.com/api");

        RickAndMortyResponse response = rickAndMortyWebClient
                .get()
                .uri("/character/?status=alive")
                .retrieve()
                .toEntity(RickAndMortyResponse.class)
                .block()
                .getBody();

        return response.getResults();
    }
}
