import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// ? Is output correct for toString
// ? sorting methods correct
// ? better way to add all to an array
public class Main
{

    private static List<Animals> filterAnimals(List<Animals> animals, CheckAnimal tester)
    {
        List<Animals> newAnimals = new ArrayList<>();

        animals.forEach(animal -> {
            if(tester.test(animal))
            {
                newAnimals.add(animal);
            }
        });

        return  newAnimals;
    }
    public static void main(String[] args)
    {
        // instantiate
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);


        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // List of Animals
        List<Animals> listOfAnimals = new ArrayList<>();

        listOfAnimals.add(panda);
        listOfAnimals.add(zebra);
        listOfAnimals.add(koala);
        listOfAnimals.add(sloth);
        listOfAnimals.add(armadillo);
        listOfAnimals.add(raccoon);
        listOfAnimals.add(bigfoot);

        listOfAnimals.add(pigeon);
        listOfAnimals.add(peacock);
        listOfAnimals.add(toucan);
        listOfAnimals.add(parrot);
        listOfAnimals.add(swan);

        listOfAnimals.add(salmon);
        listOfAnimals.add(catfish);
        listOfAnimals.add(perch);

        // *** List all the animals in descending order by year named ***
        //listOfAnimals.forEach(animal -> System.out.println(animal.getName()));

        // List of all animals Alphabetically
        listOfAnimals.sort((animal1, animal2)-> animal1.getName().compareToIgnoreCase(animal2.getName()));
        System.out.println("\n*** List all the animals alphabetically ***");
        listOfAnimals.forEach(System.out::println);

        // List all the animals order by how they move
        listOfAnimals.sort(Comparator.comparing(Animals::move));
        System.out.println("\n*** List all the animals order by how they move ***");
        listOfAnimals.forEach(System.out::println);

        // List only animals with lungs
        List<Animals> animalsByBreath = filterAnimals(listOfAnimals, animal -> animal.breath() == "lungs");
        System.out.println("\n*** List only those animals the breath with lungs ***");
        animalsByBreath.forEach(System.out::println);

        // List animals with lungs and year named == 1758
        List<Animals> animalsByBreathYear = filterAnimals(listOfAnimals, animal -> animal.breath() == "lungs" && animal.getYear() == 1758);
        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        animalsByBreathYear.forEach(System.out::println);

        // List animals with lungs and lay eggs
        List<Animals> animalsByLungsEggs = filterAnimals(listOfAnimals, animal -> animal.breath() == "lungs" && animal.reproduce() == "eggs");
        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        animalsByLungsEggs.forEach(System.out::println);

        List<Animals> animalsBySpecificYear = filterAnimals(listOfAnimals, animal -> animal.getYear() == 1758 );
        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        animalsBySpecificYear.forEach(System.out::println);

        /*--------------------- Stretch Goal ---------------------*/
        List<Animals> listOfMammals =listOfAnimals;
        listOfMammals = filterAnimals(listOfAnimals, animal -> animal instanceof Mammals);
        System.out.println("\n *** Stretch Goal ***\n\n");
        System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
        listOfMammals.forEach(System.out::println);
    }


}
