package DesignPatterns.cretionalpatterns.factory;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entityfactory.CardFactory;
import DesignPatterns.cretionalpatterns.factory.entityfactory.CreditFactory;
import DesignPatterns.cretionalpatterns.factory.entityfactory.DebitFactory;
import DesignPatterns.cretionalpatterns.factory.entityfactory.PrepaidFactory;

import java.math.BigDecimal;
import java.util.List;


public class Main {
    // Amaç birbirleri ile bağlantılı örnek olarak Card -> Debit Card , Credit Card
    // sınıflarını oluşturma aşamasında kodu daha esnetilebilir yani bir zamandan sonra Prepaid Card
    // koda eklendiğinde yani maintain edilebilir olmasını sağlar.
    // Objeyi oluşturmak için Factory classları kullanılır !!!

    public static List<CardFactory> factories = List.of(new CreditFactory(), new DebitFactory(), new PrepaidFactory());


    public static void main(String[] args) {
        //Like dependency injection private final List<CardFactory> factories;
        CardFactory creditFactory = factories.stream().filter(factory -> factory instanceof CreditFactory).findFirst().orElse(() -> null),
                debitFactory = factories.stream().filter(factory -> factory instanceof DebitFactory).findFirst().orElseGet(() -> null),
                prepaidFactory = factories.stream().filter(factory -> factory instanceof PrepaidFactory).findFirst().orElseGet(() -> null);

        Card card;

        card = creditFactory.create();
        card.pay(new BigDecimal("12.12421312"));

        card = debitFactory.create();
        card.pay(new BigDecimal("15.12421312"));

        card = prepaidFactory.create();
        card.pay(new BigDecimal("1231241.12421312"));

        // Burada Card card = new CreditCard() factory classı kullanmadan oluşturabilirdik fakat burada Card -> Credit Card'a doğrudan bağımlı hale gelir ve
        //bu yüzden bir değişiklik yapmak istediğimizde her yerde bu değişikliği yapmamız gerekirdi.
        // Nesne initiate etme businessını factory classına taşıyıp soyutladığımızda bir değişiklik durumunda sadece factory classını değiştirmemiz yeterli olurdu.
    }
}
