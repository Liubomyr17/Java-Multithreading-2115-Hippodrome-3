package com.company;

/*

2113 Hyppodrome 2
Hippodrome (2)
Since this is a hippodrome, then there should be horses on it.
So our hippodrome must keep a list of all his horses.
Add a horses field of type List <Horse> to the Hippodrome class.
And so that the horses are not stolen - make this field private.
Add getter for this field.

Requirements:
1. A list of horses must be created in the Hippodrome class.
2. In the Hippodrome class, the getHorses method must be created that returns a list of horses.
3. The getHorses method must be declared with the public access modifier.
4. The horses field must be declared with a private access modifier.
________________________________________
Hippodrome (1)
Today we will write a small game called "Hippodrome".
When I say we - I mean you. I will work as a mentor.
First, we need the classes "racetrack" and "horse".
Create classes Hippodrome (hippodrome), Horse (horse).
Also, don't forget that any program starts with the main method.
Add it to the Hippodrome class.


 */
import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {

    }
}

