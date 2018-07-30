package com.java.session1;

/**
 * Created by mbiswas on 2/28/18.
 */
public class Zoo {
    public static void main(String[] agrs){

        //Below line is wrong. coz Animal is an abstract class. we cann't instantiated
        //Animal animal1 = new Animal(4,"M",40);



        // What methods this instance(flyingBird) variable has visibility
        Flyable flyingBird = new Sparrow(1,"M", 10);




//        Bird bird1 = new Bird(5,"F",50); // variable t
//        bird1.move();
//
//
//        Chicken chick1 = new Chicken(1,"M",10);
//        chick1.fly();
//
//
//        Sparrow sparrow1 = new Sparrow(1,"M",5);
//        sparrow1.move();


        Fish fish1 = new Fish(3,"M", 14);
        fish1.move();


        /*
        variable type is Animal. But the object is created type Sparrow.
        But the variable that pointed to the object is Animal. It can fetch upper methods..not child class methods.
        For example here, sparrow2 cann't fetch Sparrow class methods. But can fetch Bird, Animal classes methods.
        */
        Animal sparrow2 = new Sparrow(2,"M", 20);
        sparrow2.move();
        moveAnimal(sparrow2);




    }

    /*
    This method is created to show polymorphism.
    Notice that its just representing the general idea that an animal being able to move and parameter thar this method
    has is of type Animal. Ita a parent type. So all of its children can also be passed in through the same method.
    This is called Polymorphism and it allows for making your program more dynamic.
    */

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
