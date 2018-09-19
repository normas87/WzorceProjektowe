package com.normas87;

public interface Dyspozytor {

        void przyjmijWezwanie(String wezwanie, PriorytetWezwania priorytetWezwania);
        void wyslijWezwanie(String wezwanie);
        void updateStatusKierowcy(Kierowca kierowca);
        void addKierowca(Kierowca kierowca);
        void priorytetWezwania ();
    }

