package de.fh_zwickau.oose.zuul05.model.Items;

import de.fh_zwickau.oose.zuul05.model.Game;
import de.fh_zwickau.oose.zuul05.model.Player;

/**
 * The type Key.
 */
public class Key extends Item {

    /**
     * Constructor for objects of class Item
     *
     * @param name        the name
     * @param description the description
     */
    public Key(String name, String description) {
        super(name, description);
    }

    @Override
    public void use(Player player) {
        Game.getEssenraum().setGeschlossen(false);
    }
}

