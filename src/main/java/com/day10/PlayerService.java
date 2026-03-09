package com.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerService {

    private List<Player> list;

    public PlayerService(){
        list = new ArrayList<>();
        String data = "virat kohli, batsman, 150000000,india,rcb";
        String[ ] arr = data.split(",");
        Player player = new Player();
        UUID id = UUID.randomUUID();
        String name = arr[0];
        String role = arr[1];
        double amount = Double.parseDouble(arr[2]);
        String country = arr[3];
        String team = arr[4];
        player.setId(id);
        player.setAmount(amount);
        player.setCountry(country);
        player.setName(name);
        player.setRole(role);
        player.setTeam(team);

    }

}
