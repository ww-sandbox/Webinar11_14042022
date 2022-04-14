package oop;

import oop.Animals.Animal;
import oop.Animals.Cat;
import oop.Animals.Dog;

import java.util.*;

public class AnimalsWorld {
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

//        animals[3].printInfo();

        ArrayList<Animal> animalsList = new ArrayList<Animal>();
        System.out.println(animalsList.isEmpty());
        animalsList.add(new Dog("pies1"));
//        Możemy dodać nowy element jednocześnie go tworząc
        Cat cat1 = new Cat("kot1");
        animalsList.add(cat1);
//        lub stworzyć obiekt i dodać go do listy
//        proste dodawanie
        animalsList.add(1, animals[3]);
//        lub skorzystać z jakiegoś już istniejącego
//        dodawanie na konkretne miejsce (pod konkretnym indeksem) w liście
        System.out.println(animalsList);
        System.out.println(animalsList.isEmpty());
        System.out.println(animalsList.size());
        Cat cat2 = new Cat("kot1");
        System.out.println(animalsList.contains(cat1));
//        Ponieważ Java 'nie wie' jak porównywać nasze obiekty (zwierzęta) w przypadku użycia contains sprawdzi
//        czy istnieje taki obiekt porównując jego referencję (w uproszczeniu gdzie znajduje się w pamięci)
        //dodaj zwierzęta do listy
        //sprawdź długość (rozmiar listy), sprawdź czy lista jest pusta

        TreeSet<String> animalsNamesSet = new TreeSet<String>();
        ArrayList<String> animalsNamesList = new ArrayList<String>();
        //dodaj do setu imiona poszczególnych zwierząt z listy (korzystając z metod obiektu),
        //niektóre zwierzęta dodaj więcej niż raz
        //sprawdź czy set zawiera daną nazwę zwierzaka
        for (Animal animal:
             animals) {
            animalsNamesSet.add(animal.getName());
            animalsNamesList.add(animal.getName());
        }
//        Dodawanie tych samych elementów do listy i setu
        animalsNamesList.add(animals[2].getName());
        animalsNamesSet.add(animals[2].getName());
//        Ponowne dodanie tego samego imienia
        System.out.println(animalsNamesSet.add(animals[2].getName()));
//        Jeśli próbujemy do Setu dodać ponoewnie tę samą wartość, a już istnieje, zwrócony zostanie 'false'
        System.out.println("Set\n" + animalsNamesSet);
        System.out.println("Lista\n" + animalsNamesList);
//        Porównanie zawartości obydwu kolejkcji
        System.out.println(animalsNamesSet.isEmpty());
        System.out.println(animalsNamesSet.size());
//        HashSet<String> animalsNamesSet2 = (HashSet<String>)animalsNamesList;


        HashMap<String, Animal> animalsMap= new HashMap<String, Animal>();
        //Stwórz mapę obiektów przechowującą imię zwierzaka i jego obiekt
        //pobierz obiekt zwierzęcia na podstawie jego imienia i wyświetl informacje o nim
        animalsMap.put(animals[0].getName(), animals[0]);
        System.out.println(animalsMap);
//        Kolekcja Animals, w naszym wypadku nieco nieczytelna. Dlatego kolejne przykłady już z wykorzystaniem String

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Polska", "Warszawa");
        System.out.println(capitals);
        capitals.put("Niemcy", "Berlin");
        capitals.put("Czechy", "Warszawa");
//        Dodanie już istniejącej wartości, jednak pod innym kluczem
        capitals.put("Polska", "Praga");
//        Dodanie innej wartości jednak do istniejącego już klucza
        System.out.println(capitals);
        System.out.println(capitals.get("Polska"));
        System.out.println(capitals.get("Włochy"));
//        Próba pobrania wartości dla nieistniejącego klucza
        System.out.println(capitals.values());
        for (String capital:
                capitals.keySet()
             ) {

        }
//        Pętla z iteracją po wszystkich kluczach naszej mapy
    }
}
