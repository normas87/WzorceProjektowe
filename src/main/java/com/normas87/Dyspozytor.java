package com.normas87;

public interface Dyspozytor {

        void przyjmijWezwanie(String wezwanie);
        void wyslijWezwanie(String wezwanie);
        void updateStatusKierowcy(Kierowca kierowca);
        void addKierowca(Kierowca kierowca);
    }

