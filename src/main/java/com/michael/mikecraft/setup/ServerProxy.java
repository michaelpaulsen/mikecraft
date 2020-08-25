package com.michael.mikecraft.setup;

import net.minecraft.world.World;

public class ServerProxy implements Iproxy {
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("only accesable on the client side");
    }
}
