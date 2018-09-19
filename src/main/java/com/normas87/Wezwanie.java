package com.normas87;

public abstract class Wezwanie {

    protected String opisWezwania;
    protected String adresWezwania;
    protected PriorytetWezwania priorytetWezwania;

    public Wezwanie(String opisWezwania, String adresWezwania) {
        this.opisWezwania = opisWezwania;
        this.adresWezwania = adresWezwania;
        priorytetWezwania =PriorytetWezwania.WYSOKI;
    }
}
