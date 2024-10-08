package net.ritana5.rush.listeners.bedwars2023;

import com.cryptomorin.xseries.XMaterial;
import com.tomkeuper.bedwars.api.arena.IArena;
import com.tomkeuper.bedwars.api.arena.team.TeamColor;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;

public class placersn_1_13 implements Listener {
    public placersn_1_13(Block bed, TeamColor col, int i, IArena ar) {
        int TOX = bed.getZ();
        int TOY = bed.getY();
        int TOZ = bed.getX();
        int AX = TOX - 1;
        int BX = AX + 1;
        int BZ = TOZ + 1;
        int CX = BX + 1;
        int DZ = BZ - 1;
        int DX = AX + 3;
        int EX = AX + 1;
        int EZ = TOZ - 1;
        int FX = EX + 1;
        int FZ = EZ - 1;
        int BDY = TOY + 1;
        int AXX = TOX - 2;
        int BXX = AX;
        int BZZ = TOZ + 1;
        int CXX = AX + 1;
        int CZZ = TOZ + 2;
        int DXX = BX + 1;
        int EXX = AX + 3;
        int EZZ = BZZ;
        int FXX = EXX + 1;
        int FZZ = TOZ;
        int GXX = FXX - 1;
        int GZZ = FZZ - 1;
        int HXX = GXX - 1;
        int HZZ = GZZ - 1;
        int IXX = HXX - 1;
        int JXX = IXX - 1;
        int JZZ = HZZ + 1;
        int KYY = BDY + 1;
        int AXXX = AXX - 1;
        int BXXX = AXX;
        int BZZZ = BZZ;
        int XXXX = BXX;
        int ZZZZ = BZZ + 1;
        int CXXX = CXX;
        int CZZZ = CZZ + 1;
        int DXXX = DXX;
        int DZZZ = CZZ + 1;
        int EXXX = EXX;
        int EZZZ = EZZ + 1;
        int FXXX = FXX;
        int FZZZ = FZZ + 1;
        int GXXX = FXX + 1;
        int GZZZ = FZZ;
        int HXXX = FXX;
        int HZZZ = FZZ - 1;
        int IXXX = GXX;
        int IZZZ = GZZ - 1;
        int JXXX = HXX;
        int JZZZ = HZZ - 1;
        int KXXX = HXX - 1;
        int KZZZ = HZZ - 1;
        int LXXX = JXX;
        int LZZZ = JZZ - 1;
        int MXXX = AXX;
        int MZZZ = BZZ - 2;
        int NYYY = TOY + 3;
        int OYYY = TOY + 1;
        int PYYY = TOY + 2;
        bed.getWorld().getBlockAt(TOZ, TOY, AX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AX));
        bed.getWorld().getBlockAt(BZ, TOY, BX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, TOY, BX));
        bed.getWorld().getBlockAt(BZ, TOY, CX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, TOY, CX));
        bed.getWorld().getBlockAt(DZ, TOY, DX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, TOY, DX));
        bed.getWorld().getBlockAt(EZ, TOY, EX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, TOY, EX));
        bed.getWorld().getBlockAt(EZ, TOY, FX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, TOY, FX));
        bed.getWorld().getBlockAt(TOZ, BDY, TOX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, TOX));
        bed.getWorld().getBlockAt(TOZ, BDY, FX).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, FX));
        bed.getWorld().getBlockAt(TOZ, TOY, AXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AXX));
        bed.getWorld().getBlockAt(BZZ, TOY, BXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZ, TOY, BXX));
        bed.getWorld().getBlockAt(CZZ, TOY, CXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, TOY, CXX));
        bed.getWorld().getBlockAt(CZZ, TOY, DXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, TOY, DXX));
        bed.getWorld().getBlockAt(EZZ, TOY, EXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZ, TOY, EXX));
        bed.getWorld().getBlockAt(FZZ, TOY, FXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZ, TOY, FXX));
        bed.getWorld().getBlockAt(GZZ, TOY, GXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZ, TOY, GXX));
        bed.getWorld().getBlockAt(HZZ, TOY, HXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, TOY, HXX));
        bed.getWorld().getBlockAt(HZZ, TOY, IXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, TOY, IXX));
        bed.getWorld().getBlockAt(JZZ, TOY, JXX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZ, TOY, JXX));
        bed.getWorld().getBlockAt(TOZ, BDY, AX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, BDY, AX));
        bed.getWorld().getBlockAt(BZ, BDY, BX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, BDY, BX));
        bed.getWorld().getBlockAt(BZ, BDY, CX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, BDY, CX));
        bed.getWorld().getBlockAt(DZ, BDY, DX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, BDY, DX));
        bed.getWorld().getBlockAt(EZ, BDY, EX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, BDY, EX));
        bed.getWorld().getBlockAt(EZ, BDY, FX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, BDY, FX));
        bed.getWorld().getBlockAt(TOZ, KYY, TOX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, KYY, TOX));
        bed.getWorld().getBlockAt(TOZ, KYY, FX).setType(col.woolMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, KYY, FX));
        bed.getWorld().getBlockAt(TOZ, TOY, AXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, TOY, AXXX));
        bed.getWorld().getBlockAt(BZZZ, TOY, BXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZZ, TOY, BXXX));
        bed.getWorld().getBlockAt(ZZZZ, TOY, XXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(ZZZZ, TOY, XXXX));
        bed.getWorld().getBlockAt(CZZZ, TOY, CXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZZ, TOY, CXXX));
        bed.getWorld().getBlockAt(DZZZ, TOY, DXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZZZ, TOY, DXXX));
        bed.getWorld().getBlockAt(EZZZ, TOY, EXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZZ, TOY, EXXX));
        bed.getWorld().getBlockAt(FZZZ, TOY, FXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZZ, TOY, FXXX));
        bed.getWorld().getBlockAt(GZZZ, TOY, GXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZZ, TOY, GXXX));
        bed.getWorld().getBlockAt(HZZZ, TOY, HXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZZ, TOY, HXXX));
        bed.getWorld().getBlockAt(IZZZ, TOY, IXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(IZZZ, TOY, IXXX));
        bed.getWorld().getBlockAt(JZZZ, TOY, JXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZZ, TOY, JXXX));
        bed.getWorld().getBlockAt(KZZZ, TOY, KXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(KZZZ, TOY, KXXX));
        bed.getWorld().getBlockAt(LZZZ, TOY, LXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(LZZZ, TOY, LXXX));
        bed.getWorld().getBlockAt(MZZZ, TOY, MXXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(MZZZ, TOY, MXXX));
        bed.getWorld().getBlockAt(TOZ, OYYY, AXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, OYYY, AXX));
        bed.getWorld().getBlockAt(BZZ, OYYY, BXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZZ, OYYY, BXX));
        bed.getWorld().getBlockAt(CZZ, OYYY, CXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, OYYY, CXX));
        bed.getWorld().getBlockAt(CZZ, OYYY, DXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(CZZ, OYYY, DXX));
        bed.getWorld().getBlockAt(EZZ, OYYY, EXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZZ, OYYY, EXX));
        bed.getWorld().getBlockAt(FZZ, OYYY, FXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(FZZ, OYYY, FXX));
        bed.getWorld().getBlockAt(GZZ, OYYY, GXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(GZZ, OYYY, GXX));
        bed.getWorld().getBlockAt(HZZ, OYYY, HXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, OYYY, HXX));
        bed.getWorld().getBlockAt(HZZ, OYYY, IXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(HZZ, OYYY, IXX));
        bed.getWorld().getBlockAt(JZZ, OYYY, JXX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(JZZ, OYYY, JXX));
        bed.getWorld().getBlockAt(TOZ, PYYY, AX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, PYYY, AX));
        bed.getWorld().getBlockAt(BZ, PYYY, BX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, PYYY, BX));
        bed.getWorld().getBlockAt(BZ, PYYY, CX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(BZ, PYYY, CX));
        bed.getWorld().getBlockAt(DZ, PYYY, DX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(DZ, PYYY, DX));
        bed.getWorld().getBlockAt(EZ, PYYY, EX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, PYYY, EX));
        bed.getWorld().getBlockAt(EZ, PYYY, FX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(EZ, PYYY, FX));
        bed.getWorld().getBlockAt(TOZ, NYYY, TOX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, NYYY, TOX));
        bed.getWorld().getBlockAt(TOZ, NYYY, FX).setType(col.glassMaterial());
        ar.addPlacedBlock(bed.getWorld().getBlockAt(TOZ, NYYY, FX));
    }
}
