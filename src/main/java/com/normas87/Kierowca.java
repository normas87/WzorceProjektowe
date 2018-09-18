package com.normas87;

public abstract class Kierowca {
    protected StatusKierowcy statusKierowcy;
    protected Dyspozytor dyspozytor;

    public Kierowca(Dyspozytor dyspozytor) {
        this.dyspozytor = dyspozytor;
    }

    public abstract void startWezwanie(String wezwanie);
    public abstract void stopWezwanie();

}