package Items;

/**
 * Project: OpenAnimalCrossing
 * File: Item.java
 * Represents a generic item in the game world (anything that can be put in an
 * inventory).
 * Last modified: April 2, 2008
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
public class Item {
     // Data members
     private String name; // Name of the item.
     private int price; // Buying price. If negative, the item cannot be sold.
     
     // Constructors
     public Item(String name, int price){
	  this.name = name;
	  this.price = price;
     }

}
