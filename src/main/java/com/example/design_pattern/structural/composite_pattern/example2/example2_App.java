package com.example.design_pattern.structural.composite_pattern.example2;

import com.example.design_pattern.structural.composite_pattern.example2.before.BrushProgram2;
import com.example.design_pattern.structural.composite_pattern.example2.before.CaptureProgram2;
import com.example.design_pattern.structural.composite_pattern.example2.before.LeagueOfLegends2;
import com.example.design_pattern.structural.composite_pattern.example2.before.Starcraft2;

public class example2_App {
    public static void main(String[] args) {
        BrushProgram2 brushProgram2 = new BrushProgram2();
        CaptureProgram2 captureProgram2 = new CaptureProgram2();
        LeagueOfLegends2 leagueOfLegends2 = new LeagueOfLegends2();
        Starcraft2 starcraft2 = new Starcraft2();

        brushProgram2.execute();
        captureProgram2.execute();
        leagueOfLegends2.execute();
        starcraft2.execute();


        File lol = new LeagueOfLegends();
        File star = new Starcraft();
        File brush = new BrushProgram("좋은 브러쉬 프로그램");
        File brush2 = new BrushProgram("구린 브러쉬 프로그램");
        lol.execute();
        star.execute();
        brush.execute();
        brush2.execute();

    }
}
