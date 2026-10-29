package tf.world.blocks.distribution.power;

import mindustry.world.power.*;
import mindustry.gen.Building;

public class PowerDriver extends PowerBlock {
    public PowerDriver(String name) {
        super(name);
    }

    public class PowerDriverBuild extends Building {
        public PowerDriver block;
    }
}