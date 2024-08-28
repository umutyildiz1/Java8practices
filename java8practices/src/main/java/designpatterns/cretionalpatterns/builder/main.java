package DesignPatterns.cretionalpatterns.builder;

public class Main {
    public static void main(String[] args) {
        //Builder pattern iç içe karmaşık constructor oluşturulması gereken objelerde ve aynı nesne impl kullanılarak
        //parametreler ile farklılaşan nesnelerde kullanışlıdır.
        //Kodun genel olarak karmaşıklığı arttırır fakat reusability ve kodu daha esnek yapar.
        //Single Responsibility prensibine uyar
        //Karmaşık nesnenin adım adım oluşturulmasını sağlar.
        //Lombok kütüphanesinde @Builder ve @SuperBuilder anotasyonları vardır.
        //Sorun aslında çok fazla parametreye sahip olan classlarda birden fazla oluşturulma yöntemi var ise
        //Her bir kombinasyon için karışık constructor yazmamız gerekecektir.

//        Builder Pattern’in Temel Bileşenleri
//        Product (Ürün): Oluşturulacak olan karmaşık nesnedir.
//        Builder (İnşacı): Nesneyi oluşturmak için gereken adımları tanımlar. Genellikle fluent bir arayüz sağlar (yani metot zincirleme  yoluyla kullanılabilir).
//        ConcreteBuilder (Somut İnşacı): Builder arayüzünü uygulayarak, ürünü adım adım inşa eder. Her adımda, nesnenin bir parçasını oluşturur.
//        Director (Yönetici): Bir ürünü nasıl oluşturacağını tanımlar. Director sınıfı, Builder’ı kullanarak nesnenin nasıl oluşturulacağını yönetir. (Not: Director opsiyoneldir ve bazen ihtiyaç duyulmaz.)
//

        House houseWithPool = new House.HouseBuilder(2, 2)
                .setSwimmingPool(true)
                .build();

        System.out.printf("House with pool --> %s %n", houseWithPool);

        House houseWithGarage = new House.HouseBuilder(1, 4)
                .setGarage(true)
                .build();

        System.out.printf("House with garage --> %s %n", houseWithGarage);

        House houseWithoutGarageAndPool = House.builder(5, 5) // lombok @Builder impl usage
                .build();

        System.out.printf("House without garage and pool --> %s", houseWithoutGarageAndPool);

    }
}