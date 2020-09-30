package com.github.cc3002.finalreality.model.character;

import com.github.cc3002.finalreality.model.weapon.AbstractWeapon;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.BlockingQueue;

/**
 * A class that holds all the information of a Black Mage character of the game.
 *
 * @author Ignacio Slater Muñoz
 * @author <Byron Ortiz>
 */
public class BlackMageCharacter extends AbstractMageCharacter {
    public BlackMageCharacter(@NotNull String name, int healthPoints, int defensePoints,
                              @NotNull BlockingQueue<ICharacter> turnsQueue, AbstractWeapon weapon,
                              Spell equippedSpell, int mana) {
        super(name, healthPoints, defensePoints, turnsQueue, weapon, equippedSpell, mana);
    }

    @Override
    public String getCharacterClass() {
        return "Black Mage";
    }
}
