package com.normas87;

import java.util.ArrayList;
import java.util.List;

public class DyspozytorKaretki implements Dyspozytor{

    private List<Kierowca> kierowcy;

    public DyspozytorKaretki() {
        this.kierowcy = new ArrayList<>();
    }

    @Override
    public void przyjmijWezwanie(String wezwanie, PriorytetWezwania priorytetWezwania) {
        System.out.println("Podejmuję akcje: " + wezwanie +"," + "Priorytet wezwania: " + priorytetWezwania);
        wyslijWezwanie(wezwanie);
    }

    @Override
    public void wyslijWezwanie(String wezwanie) {
        for (Kierowca kierowca : kierowcy) {
            if (kierowca.statusKierowcy == StatusKierowcy.W_GOTOWOSCI_DO_PODJECIA_AKCJI) && (Wezwanie.priorytetWezwania == PriorytetWezwania.WYSOKI){
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

    @Override
    public void priorytetWezwania() {
        System.out.println(PriorytetWezwania.NISKI);
    }
}