package com.normas87;

public class KierowcaKaretki extends Kierowca {


    public KierowcaKaretki(Dyspozytor dyspozytor) {
        super(dyspozytor);
        statusKierowcy = StatusKierowcy.W_GOTOWOSCI_DO_PODJECIA_AKCJI;
    }

    public KierowcaKaretki(Dyspozytor dyspozytor, StatusKierowcy statusKierowcy) {
        super(dyspozytor);
        this.statusKierowcy = statusKierowcy;
    }


    @Override
    public void startWezwanie(String wezwanie) {
        statusKierowcy = StatusKierowcy.W_TRAKCIE_AKCJI_RATOWNICZEJ;
        System.out.println("Rozpoczynam akcje " + wezwanie);
    }

    @Override
    public void stopWezwanie() {
        statusKierowcy = StatusKierowcy.W_GOTOWOSCI_DO_PODJECIA_AKCJI;
        dyspozytor.updateStatusKierowcy(this);
    }
}