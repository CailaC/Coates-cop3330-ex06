/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

package org.example;

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "What is your current age?" );
        int age = input.nextInt();

        System.out.println( "At what age would you like to retire?" );
        int rAge = input.nextInt();

        //calculates years left until you can retire
        int yearsLeft = rAge - age;

        //Gets Current year
        int year = Calendar.getInstance().get(Calendar.YEAR);

        //Calculates year you'll retire in
        int retireDate = year + yearsLeft;

        System.out.println("You have " + yearsLeft + " years left until you can retire");
        System.out.println("It's " + year + " so you can retire in " + retireDate);

    }
}

