package Items;

/**
 * Project: OpenAnimalCrossing
 * File: NonPlayerCharacter.java
 * Represents any placable piece of furniture (chairs, beds, tables, dressers,
 * etc.)
 * Last modified: 11:56 PM EST, Saturday, January 31, 2009.
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
public class Furniture extends Item implements isMovable, canRotate{
     public Furniture(String name, int price){
	  super(name, price);
     }
     
     

}
