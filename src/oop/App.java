package oop;

import java.util.*;

public class App {
    public static void main(String[] args) {
        /*
            PRZED URUCHOMIENIEM KLASY ZAIMPLEMENTUJ KONSTRUKTORY Z PARAMETREM!!
         */

        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Azor");
        animals[1] = new Dog("Szarik");
        animals[2] = new Cat("Mruczek");
        animals[3] = new Dog("Scooby");
        animals[4] = new Cat("Garfield");
        //Przenieś tworzenie instancji obiektów poza tablicę

        animals[3].printInfo();

        List<Animal> animalList = new ArrayList<Animal>();
        //dodaj zwierzęta do listy
        //sprawdź długość (rozmiar listy), sprawdź czy lista jest pusta

        HashSet<String> animalsNames = new HashSet<String>();
        //dodaj do setu imiona poszczególnych zwierząt z listy (korzystając z metod obiektu),
        //niektóre zwierzęta dodaj więcej niż raz
        //sprawdź czy set zawiera daną nazwę zwierzaka

        HashMap<String, Animal> animalsMap= new HashMap<String, Animal>();
        //Stwórz mapę obiektów przechowującą imię zwierzaka i jego obiekt
        //pobierz obiekt zwierzęcia na podstawie jego imienia i wyświetl informacje o nim
    }
}
