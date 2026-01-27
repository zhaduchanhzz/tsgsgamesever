package com.gzbz.nineContinent.heroGodTrial;

import allMgr.PartAnnotation;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroGodTrialPart extends PlayerPart {
}
