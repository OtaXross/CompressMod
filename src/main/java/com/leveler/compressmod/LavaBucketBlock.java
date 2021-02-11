package com.leveler.compressmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.LavaFluid;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.block.AbstractFireBlock;

public class LavaBucketBlock extends Block{
    public LavaBucketBlock(Properties properties) {
        super(properties);
        // TODO Auto-generated constructor stub
    }

    @Deprecated
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
      BlockPos blockpos = pos.up();
      if (worldIn.getBlockState(blockpos).isAir() && !worldIn.getBlockState(blockpos).isOpaqueCube(worldIn, blockpos)) {
         if (rand.nextInt(100) == 0) {
            double d0 = (double) pos.getX() + rand.nextDouble();
            double d1 = (double) pos.getY() + 1.0D;
            double d2 = (double) pos.getZ() + rand.nextDouble();
            worldIn.addParticle(ParticleTypes.LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
            worldIn.playSound(d0, d1, d2, SoundEvents.BLOCK_LAVA_POP, SoundCategory.BLOCKS,
                  0.2F + rand.nextFloat() * 0.2F, 0.9F + rand.nextFloat() * 0.15F, false);
            worldIn.playSound((double) pos.getX(), (double) pos.getY(), (double) pos.getZ(),
               SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F,
               0.9F + rand.nextFloat() * 0.15F, false);
            

            if (rand.nextInt(200) == 0) {
               worldIn.playSound((double) pos.getX(), (double) pos.getY(), (double) pos.getZ(),
                     SoundEvents.BLOCK_LAVA_AMBIENT, SoundCategory.BLOCKS, 0.2F + rand.nextFloat() * 0.2F,
                     0.9F + rand.nextFloat() * 0.15F, false);
            }
         }
      }
   }
}
