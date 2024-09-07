package DesignPatterns.structuralpatterns.bridge;

public class Main {


    //Implementor
    interface Color {
        String getColor();
    }

    //Concrete Implementor
    static class Red implements Color {
        @Override
        public String getColor() {
            return "applying in " + this.getClass().getSimpleName();
        }
    }

    static class Green implements Color {
        @Override
        public String getColor() {
            return "applying color : " + this.getClass().getSimpleName();
        }
    }

    //Abstraction
    static abstract class Shape {
        private final Color color;

        public Shape(Color color) {
            this.color = color;
        }

        public void draw(){
            System.out.println(this.getClass().getSimpleName() + " drawing with " + color.getColor());
        }
    }

    //Refined Abstraction
    static class Circle extends Shape {

        public Circle(Color color) {
            super(color);
        }
    }

    static class Rectangle extends Shape {

        public Rectangle(Color color) {
            super(color);
        }
    }

    public static void main(){
        Shape greenRectangle = new Rectangle(new Green());
        Shape redCircle = new Circle(new Red());
        redCircle.draw();
        greenRectangle.draw();
    }

    public static void main(String[] args) {
        main();

        //Low

        //Bridge Design Pattern büyük bir classı birbiri ile ilişkili fakat bağımsız iki ayrı hiyerarşiye böler --> Abstraction ve Implementation
        //Bridge deseni, iki ana bileşen içerir:
        //
        //Abstraction (Soyutlama): Bu bileşen, üst düzey bir arayüz sağlar. Alt sınıfları, kendi ihtiyaçlarına göre bu soyutlamayı kullanarak spesifik detayları uygular.
        //Implementor (Uygulayıcı): Soyutlamadan bağımsız olarak, gerçek işlevsellik sağlayan uygulama sınıflarını içerir. Bir interface veya abstract class ile tanımlanır.
        //Adımlar
        //Abstraction: Bu sınıf, uygulama detayları hakkında bilgi sahibi olmadan kullanıcıya bir arayüz sunar. Bir Implementor referansı tutar.
        //RefinedAbstraction: Abstraction sınıfının genişletilmiş hali. Ekstra özellikler ekler.
        //Implementor: Abstraction sınıfı tarafından kullanılan interface. Bu interface, gerçek uygulama sınıflarını soyutlar.
        //ConcreteImplementor: Implementor interface'inin somut uygulamaları. Bu sınıflar, sistemin gerçek işlevlerini içerir.

        //Impl olarak img'de örnek olarak mesela her renk ve şekil kombinasyonu için ayrı ayrı sınıf yazmak zorundayız ve bu
        //bir yerden sonra sürdürebilir olmaz. Bu yüzden birbiri ile ilişkili fakat bağımsız şekilde renk ve şekil olarak
        //abstraction ve implementation olarak ayırdık ve bu daha reusable ve maintable kod sağlar :)
    }
}
