package com.kidbengalamiguel477.greenstickmod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GreenStickItem extends Item {
    public GreenStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            // Add logic for green stick functionality here
            // For example, emit green particles when used on a block
            // And stick blocks together when used on two adjacent blocks
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}