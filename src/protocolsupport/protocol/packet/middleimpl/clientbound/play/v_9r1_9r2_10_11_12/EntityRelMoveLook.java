package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.packet.ClientBoundPacket;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleEntityRelMoveLook;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.VarNumberSerializer;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class EntityRelMoveLook extends MiddleEntityRelMoveLook {

	@Override
	public RecyclableCollection<ClientBoundPacketData> toData(ProtocolVersion version) {
		ClientBoundPacketData serializer = ClientBoundPacketData.create(ClientBoundPacket.PLAY_ENTITY_REL_MOVE_LOOK_ID, version);
		VarNumberSerializer.writeVarInt(serializer, entityId);
		serializer.writeShort(relX);
		serializer.writeShort(relY);
		serializer.writeShort(relZ);
		serializer.writeByte(yaw);
		serializer.writeByte(pitch);
		serializer.writeBoolean(onGround);
		return RecyclableSingletonList.create(serializer);
	}

}
