package DesignPatterns.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Average

    //Composite Structural Design Pattern, nesneleri tree yapısı şeklinde ele alır.
    //3 ana bölümden oluşur :
    //* Component : Kullanıcı arayüzü sağlayan en üst tabakadır.
    //* Leaf : Treenin en alt tabakasıdır.
    //* Composite : Birden fazla leaf veya leaf grubunu içeren bunların yönetimi sağlayan grup. Component arayüzünü impl eder

    //Hiyerarşi gerektiren örnekler dosya sistemleri, menü yapıları gibi durumlarda kullanışlıdır.

    //Component
    static interface FileSystem{
        void showDetails();
    }
    // Leaf Class
    static class File implements FileSystem {
        private String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public void showDetails() {
            System.out.println("File: " + name);
        }
    }

    // Composite Class
    static class Directory implements FileSystem {
        private String name;
        private List<FileSystem> children = new ArrayList<>();

        public Directory(String name) {
            this.name = name;
        }

        public void add(FileSystem entity) {
            children.add(entity);
        }

        public void remove(FileSystem entity) {
            children.remove(entity);
        }

        @Override
        public void showDetails() {
            System.out.println("Directory: " + name);
            for (FileSystem entity : children) {
                entity.showDetails();
            }
        }
    }

    public static void main(String[] args) {
        // Leaf objects
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        // Composite objects
        Directory dir1 = new Directory("Folder1");
        dir1.add(file1);
        dir1.add(file2);

        Directory dir2 = new Directory("Folder2");
        File file3 = new File("File3.txt");
        dir2.add(file3);

        // Root composite
        Directory root = new Directory("Root");
        root.add(dir1);
        root.add(dir2);

        // Client call
        root.showDetails(); // Output the full structure
    }
}
