package Characters;


/**
 * Project: OpenAnimalCrossing
 * File: Character.java
 * This abstract class represents any character in the game.
 * Last Modified: April 2, 2008.
 *
 * Copyright (C) 2008 Dorian Patterson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import Items.Inventory;
public class Character{
     // Data members
     private String name;// Character's name.
     private char sex; // Use 'M' for male, 'F' for female.
     private int age; // Character's age in years.
     private Inventory pack; //

     // Constructors
     /**
      * @param name
      * @param sex
      * @param age
      */
     public Character(String name, char sex, int age){
	  this.name = name;
	  this.sex = sex;
	  this.age = age;
     }
}