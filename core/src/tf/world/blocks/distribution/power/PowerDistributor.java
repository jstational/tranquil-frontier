package tf.world.blocks.distribution.power;

import mindustry.world.blocks.power.*;
import mindustry.gen.Building;

public class PowerDistibutor extends PowerBlock {
    public float range;
    public float tranferCap;

    public class PowerDistributorBuild extends Building {
        public PowerDistributor block;
    }
}
