package com.github.cc3002.finalreality.model.weapon;

import com.github.cc3002.finalreality.model.character.IPCharacter;
import com.github.cc3002.finalreality.model.character.playercharacter.*;
import com.github.cc3002.finalreality.model.character.playercharacter.magecharacter.BlackMage;
import com.github.cc3002.finalreality.model.character.playercharacter.magecharacter.WhiteMage;

import java.util.Objects;

/**
 * A class that holds all the information of a weapon.
 *
 * @author Ignacio Slater Muñoz.
 * @author <Your name>
 */
public abstract class AbstractWeapon implements IWeapon {

    private final String name;
    private final int weight;
    private final int damage;

    public AbstractWeapon(final String name, final int weight, int damage) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    public void displayEquipError(IPCharacter character) {
        System.out.println( character.getCharacterClass() +
                " can not equip weapon type " + this.getType());
    }

    @Override
    public void equipToKnight(Knight character) {
        displayEquipError(character);
    }

    @Override
    public void equipToThief(Thief character) {
        displayEquipError(character);
    }

    @Override
    public void equipToEngineer(Engineer character) {
        displayEquipError(character);
    }

    @Override
    public void equipToWhiteMage(WhiteMage character) {
        displayEquipError(character);
    }

    @Override
    public void equipToBlackMage(BlackMage character) {
        displayEquipError(character);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        IWeapon that = (IWeapon) o;
        return getWeight() == that.getWeight() &&
                getDamage() == that.getDamage() &&
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight(), getDamage());
    }
}
