package com.normas87;

import java.util.ArrayList;
import java.util.List;

public class DyspozytorKaretki implements Dyspozytor {

    private List<Kierowca> kierowcy;

    public DyspozytorKaretki() {
        this.kierowcy = new ArrayList<>();
    }

    @Override
    public void przyjmijWezwanie(String wezwanie) {
        System.out.println("Podejmuję akcje: " + wezwanie + "-> accept");
        wyslijWezwanie(wezwanie);
    }

    @Override
    public void wyslijWezwanie(String wezwanie) {
        for (Kierowca kierowca : kierowcy) {
            if (kierowca.statusKierowcy == StatusKierowcy.W_GOTOWOSCI_DO_PODJECIA_AKCJI) {
                kierowca.startWezwanie(wezwanie);
                return;
            }
        }

    }

    @Override
    public void updateStatusKierowcy(Kierowca kierowca) {
        System.out.println("Update driver status: " + kierowca);
    }

    @Override
    public void addKierowca(Kierowca kierowca) {
        kierowcy.add(kierowca);
    }
}