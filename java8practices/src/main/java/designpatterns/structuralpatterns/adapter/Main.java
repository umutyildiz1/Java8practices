package DesignPatterns.structuralpatterns.adapter;

public class Main {

    //High

    //Adapter Design Pattern (Adaptör Tasarım Deseni), yazılım geliştirmede iki uyumsuz arayüze sahip nesnelerin birlikte çalışmasını
    // sağlayan bir tasarım desenidir. Temel amacı, mevcut bir sınıfı veya bileşeni değiştirmeden başka
    // bir sınıfın arayüzüne uyumlu hale getirmektir.
    // Bu, özellikle bir sistemde mevcut bir sınıfı veya bileşeni başka bir sisteme entegre ederken yararlıdır.

    //Örnek olarak Avrupadaki şarj adaptörleri ile Amerikadakiler farklı ve bunları uyumlu hale getirmek için
    //aralarına ek bir adaptör kullanırız.

    //Pros --> flexibility, reusability, modularity
    //Cons --> Code complexity

    class OldUser{
        int id;
        String name;
        String surname;
    }

    interface OldUserService{
        OldUser getOldUser(int id);
    }

    class NewUser{
        int id;
        String email;
        String name;
        String surname;
    }

    interface NewUserRepository{
        NewUser getNewUser(String email);
    }

    interface NewUserService{
        NewUser getNewUser(String email);
    }

    class NewUserAdapter implements NewUserService {

        //Eski bir user sistemimiz var ve yeni bir user sistemi ile entegre kullanmak istiyoruz. Birisi email ile get yaparken
        //diğeri id ile sorgu atıyor ve her ikisini de kullanmak zorundayız. Bu yüzden adapter yazmak zorundayız

        NewUserRepository newUserRepository;
        OldUserService oldUserService;

        @Override
        public NewUser getNewUser(String email) {
            NewUser user = newUserRepository.getNewUser(email);
            OldUser oldUser = oldUserService.getOldUser(user.id);
            user.name = oldUser.name;
            user.surname = oldUser.surname;
            return user;
        }
    }
}
