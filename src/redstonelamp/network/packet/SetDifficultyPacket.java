package redstonelamp.network.packet;

import redstonelamp.network.NetworkInfo;
import redstonelamp.utils.DynamicByteBuffer;

/**
 * SetDifficultyPacket (0xb0)
 */
public class SetDifficultyPacket extends DataPacket{
    public final static byte ID = NetworkInfo.SET_DIFFICULTY_PACKET;

    public int difficulty;

    @Override
    public byte getPID() {
        return NetworkInfo.SET_DIFFICULTY_PACKET;
    }

    @Override
    protected void _encode(DynamicByteBuffer bb) {
        bb.putInt(difficulty);
    }

    @Override
    protected void _decode(DynamicByteBuffer bb) {
        difficulty = bb.getInt();
    }
}
