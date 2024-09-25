package DesignPatterns.behavioraldesignpatterns.strategy;

import DesignPatterns.behavioraldesignpatterns.strategy.impl.CreditCardPayment;
import DesignPatterns.behavioraldesignpatterns.strategy.impl.DebitCardPayment;
import DesignPatterns.behavioraldesignpatterns.strategy.impl.PayStrategy;
import DesignPatterns.behavioraldesignpatterns.strategy.impl.PrepaidCardPayment;

public class Main {
    public static void main(String[] args) {
        //Strategy design pattern bir grup algoritmayı tek bir arayüz altında toplayarak ve her birini ayrı classlarda tanımlayarak
        //birbiri arasında değiştirilebilir bir yapı sağlar.

        //Örnek olarak bir site üzerinden debit, kredi kartı veya prepaid kart ile ödeme yöntemlerini bulunabilir ve bunların domain businessı farklıdır.
        //O yüzden gelen kart tipine göre farklı algoritma çalışması gerekebilir.
        String input = "Debit";
        PayStrategy strategy = null;
        switch (input) {
            case "Credit" : strategy = new CreditCardPayment(); break;
            case "Debit" : strategy = new DebitCardPayment(); break;
            case "Prepaid" : strategy = new PrepaidCardPayment(); break;
        }


        strategy.pay(12);

    }
}
