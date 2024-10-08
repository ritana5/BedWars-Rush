package net.ritana5.rush.listeners.bedwars1058;

import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.arena.team.TeamColor;
import com.cryptomorin.xseries.XMaterial;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;

public class placerwe_1_13 implements Listener {
    public placerwe_1_13(Block bed1, TeamColor col1, int i, IArena ar1) {
        int TOX = bed1.getX();
        int TOY = bed1.getY();
        int TOZ = bed1.getZ();
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
        bed1.getWorld().getBlockAt(AX, TOY, TOZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BX, TOY, BZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, TOY, BZ));
        bed1.getWorld().getBlockAt(CX, TOY, BZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, TOY, BZ));
        bed1.getWorld().getBlockAt(DX, TOY, DZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, TOY, DZ));
        bed1.getWorld().getBlockAt(EX, TOY, EZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, TOY, EZ));
        bed1.getWorld().getBlockAt(FX, TOY, EZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, TOY, EZ));
        bed1.getWorld().getBlockAt(TOX, BDY, TOZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, BDY, TOZ));
        bed1.getWorld().getBlockAt(FX, BDY, TOZ).setType(XMaterial.OAK_PLANKS.parseMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, BDY, TOZ));
        bed1.getWorld().getBlockAt(AXX, TOY, TOZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BXX, TOY, BZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXX, TOY, BZZ));
        bed1.getWorld().getBlockAt(CXX, TOY, CZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXX, TOY, CZZ));
        bed1.getWorld().getBlockAt(DXX, TOY, CZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXX, TOY, CZZ));
        bed1.getWorld().getBlockAt(EXX, TOY, EZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXX, TOY, EZZ));
        bed1.getWorld().getBlockAt(FXX, TOY, FZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXX, TOY, FZZ));
        bed1.getWorld().getBlockAt(GXX, TOY, GZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXX, TOY, GZZ));
        bed1.getWorld().getBlockAt(HXX, TOY, HZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXX, TOY, HZZ));
        bed1.getWorld().getBlockAt(IXX, TOY, HZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXX, TOY, HZZ));
        bed1.getWorld().getBlockAt(JXX, TOY, JZZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXX, TOY, JZZ));
        bed1.getWorld().getBlockAt(AX, BDY, TOZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, BDY, TOZ));
        bed1.getWorld().getBlockAt(BX, BDY, BZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, BDY, BZ));
        bed1.getWorld().getBlockAt(CX, BDY, BZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, BDY, BZ));
        bed1.getWorld().getBlockAt(DX, BDY, DZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, BDY, DZ));
        bed1.getWorld().getBlockAt(EX, BDY, EZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, BDY, EZ));
        bed1.getWorld().getBlockAt(FX, BDY, EZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, BDY, EZ));
        bed1.getWorld().getBlockAt(TOX, KYY, TOZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, KYY, TOZ));
        bed1.getWorld().getBlockAt(FX, KYY, TOZ).setType(col1.woolMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, KYY, TOZ));
        bed1.getWorld().getBlockAt(AXXX, TOY, TOZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXXX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BXXX, TOY, BZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXXX, TOY, BZZZ));
        bed1.getWorld().getBlockAt(XXXX, TOY, ZZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(XXXX, TOY, ZZZZ));
        bed1.getWorld().getBlockAt(CXXX, TOY, CZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXXX, TOY, CZZZ));
        bed1.getWorld().getBlockAt(DXXX, TOY, DZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXXX, TOY, DZZZ));
        bed1.getWorld().getBlockAt(EXXX, TOY, EZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXXX, TOY, EZZZ));
        bed1.getWorld().getBlockAt(FXXX, TOY, FZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXXX, TOY, FZZZ));
        bed1.getWorld().getBlockAt(GXXX, TOY, GZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXXX, TOY, GZZZ));
        bed1.getWorld().getBlockAt(HXXX, TOY, HZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXXX, TOY, HZZZ));
        bed1.getWorld().getBlockAt(IXXX, TOY, IZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXXX, TOY, IZZZ));
        bed1.getWorld().getBlockAt(JXXX, TOY, JZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXXX, TOY, JZZZ));
        bed1.getWorld().getBlockAt(KXXX, TOY, KZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(KXXX, TOY, KZZZ));
        bed1.getWorld().getBlockAt(LXXX, TOY, LZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(LXXX, TOY, LZZZ));
        bed1.getWorld().getBlockAt(MXXX, TOY, MZZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(MXXX, TOY, MZZZ));
        bed1.getWorld().getBlockAt(AXX, OYYY, TOZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXX, OYYY, TOZ));
        bed1.getWorld().getBlockAt(BXX, OYYY, BZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXX, OYYY, BZZ));
        bed1.getWorld().getBlockAt(CXX, OYYY, CZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXX, OYYY, CZZ));
        bed1.getWorld().getBlockAt(DXX, OYYY, CZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXX, OYYY, CZZ));
        bed1.getWorld().getBlockAt(EXX, OYYY, EZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXX, OYYY, EZZ));
        bed1.getWorld().getBlockAt(FXX, OYYY, FZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXX, OYYY, FZZ));
        bed1.getWorld().getBlockAt(GXX, OYYY, GZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXX, OYYY, GZZ));
        bed1.getWorld().getBlockAt(HXX, OYYY, HZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXX, OYYY, HZZ));
        bed1.getWorld().getBlockAt(IXX, OYYY, HZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXX, OYYY, HZZ));
        bed1.getWorld().getBlockAt(JXX, OYYY, JZZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXX, OYYY, JZZ));
        bed1.getWorld().getBlockAt(AX, PYYY, TOZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, PYYY, TOZ));
        bed1.getWorld().getBlockAt(BX, PYYY, BZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, PYYY, BZ));
        bed1.getWorld().getBlockAt(CX, PYYY, BZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, PYYY, BZ));
        bed1.getWorld().getBlockAt(DX, PYYY, DZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, PYYY, DZ));
        bed1.getWorld().getBlockAt(EX, PYYY, EZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, PYYY, EZ));
        bed1.getWorld().getBlockAt(FX, PYYY, EZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, PYYY, EZ));
        bed1.getWorld().getBlockAt(TOX, NYYY, TOZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, NYYY, TOZ));
        bed1.getWorld().getBlockAt(FX, NYYY, TOZ).setType(col1.glassMaterial());
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, NYYY, TOZ));
    }
}
