package com.spartaglobal.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTests {

    private static Program sut;

    @BeforeEach
    void setUp()

    {
        sut = new Program();
        System.out.println("Hello");
    }

    //beforeeach - runs before every test method
    //beforeall, runs once, then the tests methods run            //Testing the cases on the boundary value is boundary value analysis
    @Test
    @DisplayName("Given a time of 21, greeting returns Good Evening!")
    public void givenAtTimeOf21_Greeting_ReturnsGoodEvening(){
        //Arrange
        var time = 21;
        var expectedGreeting = "Good evening!";
        //Act
        var result = sut.greeting(time);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"12|Good morning!",
    "13|Good afternoon!"},
    delimiter = '|')
    @DisplayName("Given the times 12 and 13, I expected the appropriate greeting gets returned")

    public void give12Or13_appropriateValueReturned(int time, String expected){

        assertEquals(expected, null);
    }




    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Given the time between 5 and 12, I expected greeting to return good Morning")
    public void givenAtTimeBetween5And12_Greeting_ReturnsGoodMorning(int time) {

        assertEquals("Good Morning!", Program.greeting(time));
    }
    @AfterEach
    public  void cleanUpEach()
    {
        System.out.println("Cleanup");
    }
}

