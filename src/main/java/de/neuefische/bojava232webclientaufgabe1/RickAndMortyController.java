package de.neuefische.bojava232webclientaufgabe1;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class RickAndMortyController {
    private final RickAndMortyService rickAndMortyService;

    @GetMapping
    public List<RickAndMortyCharacter> getAll() {
        return rickAndMortyService.getAllCharacters();
    }
}
