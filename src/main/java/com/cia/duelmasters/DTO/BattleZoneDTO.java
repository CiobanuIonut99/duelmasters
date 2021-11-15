package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.Player;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Builder
public class BattleZoneDTO {

    private Long id;
    private List<Player> playerId;




}
