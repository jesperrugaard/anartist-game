package dk.pterodaktyl.game.anartist.api;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private UUID id = UUID.randomUUID();
    private String name;
    private Map<String, String> players = new HashMap<>();

}
