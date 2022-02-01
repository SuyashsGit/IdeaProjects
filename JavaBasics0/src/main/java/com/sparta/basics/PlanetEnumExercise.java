package com.sparta.basics;
import java.util.Scanner;

    // An Enum class
    enum Planets {
        JUPITER,
        SATURN,
        NEPTUNE,
        URANUS,
        EARTH,
        VENUS,
        MARS,
        MERCURY,
        PLUTO;
    }

    // Driver class that contains an object of "Planets" and
// main().
    public class PlanetEnumExercise {
        Planets planet;

        // Constructor
        public PlanetEnumExercise(Planets planet) { this.planet = planet; }

        // Prints a line about planet using switch
        public void planetIsLike()
        {
            switch (planet)
            {
                case JUPITER:
                    System.out.println("Jupiter has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case SATURN:
                    System.out.println("SATURN has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case NEPTUNE:
                    System.out.println("NEPTUNE has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case URANUS:
                    System.out.println("URANUS has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case EARTH:
                    System.out.println("EARTH has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case VENUS:
                    System.out.println("VENUS has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case MARS:
                    System.out.println("MARS has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case MERCURY:
                    System.out.println("MERCURY has a mass of ,and it is at a distance of... from the sun.");
                    break;
                case PLUTO:
                    System.out.println("PLUTO has a mass of ,and it is at a distance of... from the sun.");
                    break;
                default:
                    System.out.println("Planets are very big in size.");
                    break;
            }
        }

        // Driver method
        public static void main(String[] args)
        {
            String str = "SATURN";
            PlanetEnumExercise t1 = new PlanetEnumExercise(Planets.valueOf(str));
            t1.planetIsLike();
        }
    }

