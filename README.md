Final Reality
=============

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

This work is license under a 
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/)

Context
-------

This project's goal is to create a (simplified) clone of _Final Fantasy_'s combat, a game developed
by [_Square Enix_](https://www.square-enix.com)
Broadly speaking for the combat the player has a group of characters to control, and a group of 
enemies controlled by the computer.

Run
-------

The program at the moment is running only for tests, to prove the test on intellij,
select the ```test``` package and run with coverage. 


Model
-------

The game is an object oriented program, we've used 
this approach to get advantages of the inheritance
and to make our program more extensible.

At moment, we've developed the model for weapons and
characters.

Characters can equip only a certain type of weapon
for more detail see the project description. 
 
Characters
-------
Characters package compounds are:

```ICharacter``` -> Beholds all the methods that any character should do like access  
                common parameters, wait turns, add them to the queue of turns, etc.
                This interface is going to be instantiated in turns queue.  
                
```IPCharacter``` -> Beholds all the behavior for playable characters, at moment it differs
                from ICharacter because of the possibility to equip weapons on. I created
                this interface to instantiate the group of playable characters.
                
```AbstractCharacter``` -> Implements some methods from ICharacter like getters and setters
                        but ```waitTurn``` method is abstract because depends on whether the
                        character is playable or enemy (CPU) (varies on the form to obtain
                        the weight of a character).
                        
```AbstractPlayerCharacter``` ->  Implements methods from IPCharacter and extends from
                            AbstractCharacter. Overrides the methods equals and hashcode
                            to compare instances of IPCharacters based on the names.
                            Adds extensibility to other type of normal characters.
                            Weapon defines the weight of a normal character.
                            
```AbstractMageCharacter``` -> Extends from AbstractPlayerCharacter, differs from a normal
                         character on the mana parameter and on the possibility to use 
                         spells (Spells aren't implemented yet). Defines the respective 
                         get and set mana methods that will be useful to any type of mage.
                         Adds extensibility to other type of mages. 
                         
Concrete Character classes:

```Enemy``` -> Extends from AbstractCharacter, defines his own equals and hash methods under the 
         assumption that would be different enemy's with the same name but different stats.
         For example, two goblins with a particular name, but with different HP, DFP, ATKP 
         aren't the same. Weight is a parameter of `Enemys`.

NormalCharacters -> ```Engineer```, ```Thief```, ```Knight```. 
                    Extends from AbstractPlayerCharacter. These characters can only use weapons.

MageCharacters ->  ```WhiteMage```, ```BlackMage```. Extends from AbstractMageCharacter. These
                   characters can use weapons and spells (not yet).

Weapon
-------

Weapons package compounds are:

```IWeapon``` -> Beholds all weapon's methods, at moment getters and setters of damage and 
                 weight.

```AbstractWeapon``` -> Implements IWeapon methods, defines the equals and hash methods under
                  the assumption that equal weapons would've same name's, type, damage and 
                  weight. Adds extensibility to other type of normalWeapons.

```AbstractMagicWeapon``` -> Extends from AbstractWeapon and differs from normal weapons on the
                       magicDamage parameter. Two magic Weapons are equal if they also have
                       same magicDamage. Adds extensibility to other type of magicWeapons.

Concrete weapons:

NormalWeapons -> ```Axe```, ```Knife```, ```Bow```, ```Sword```. Extends from AbstractWeapon.

MagicWeapons -> ```Wand```. Extends from AbstractMagicWeapons.

Controller
-------
Manage the model, can instantiate characters and weapons
and controls the flow of the game.


---