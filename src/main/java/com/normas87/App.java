package com.normas87;

public class App {
    public static void main(String[] args) {
        Dyspozytor dyspozytor = new DyspozytorKaretki();
        Kierowca wiesiek = new KierowcaKaretki(dyspozytor);
        Kierowca janusz = new KierowcaKaretki(dyspozytor);
        Kierowca roman = new KierowcaKaretki(dyspozytor);

        dyspozytor.addKierowca(wiesiek);
        dyspozytor.addKierowca(janusz);
        dyspozytor.addKierowca(roman);

        dyspozytor.przyjmijWezwanie("Katar, ul.Roweckiego 2/10, Police", PriorytetWezwania.NISKI);

    }
}