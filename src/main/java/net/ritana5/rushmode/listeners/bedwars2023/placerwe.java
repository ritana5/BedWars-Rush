package net.ritana5.rushmode.listeners.bedwars2023;

import com.tomkeuper.bedwars.api.arena.IArena;
import com.tomkeuper.bedwars.api.arena.team.TeamColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;

public class placerwe implements Listener {
    public placerwe(Block bed1, TeamColor col1, int i, IArena ar1) {
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
        double woolcolor;
        switch (col1.name()) {
            case "RED":
                woolcolor = 14.0;
                break;
            case "BLUE":
                woolcolor = 11.0;
                break;
            case "GREEN":
            case "LIME_H":
                woolcolor = 5.0;
                break;
            case "YELLOW":
                woolcolor = 4.0;
                break;
            case "AQUA":
            case "CYAN":
                woolcolor = 9.0;
                break;
            case "PINK":
            case "PINK_H":
                woolcolor = 6.0;
                break;
            case "GRAY":
                woolcolor = 8.0;
                break;
            case "DARK_GREEN":
                woolcolor = 13.0;
                break;
            case "DARK_GRAY":
                woolcolor = 7.0;
                break;
            case "BLACK":
                woolcolor = 15.0;
                break;
            case "ORANGE":
                woolcolor = 1.0;
                break;
            case "BROWN":
                woolcolor = 12.0;
                break;
            case "PURPLE":
                woolcolor = 10.0;
                break;
            case "MAGENTA":
                woolcolor = 2.0;
                break;
            case "LIGHT_BLUE":
                woolcolor = 3.0;
                break;
            default:
                woolcolor = 0.0;
        }

        bed1.getWorld().getBlockAt(AX, TOY, TOZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BX, TOY, BZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, TOY, BZ));
        bed1.getWorld().getBlockAt(CX, TOY, BZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, TOY, BZ));
        bed1.getWorld().getBlockAt(DX, TOY, DZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, TOY, DZ));
        bed1.getWorld().getBlockAt(EX, TOY, EZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, TOY, EZ));
        bed1.getWorld().getBlockAt(FX, TOY, EZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, TOY, EZ));
        bed1.getWorld().getBlockAt(TOX, BDY, TOZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, BDY, TOZ));
        bed1.getWorld().getBlockAt(FX, BDY, TOZ).setType(Material.WOOD);
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, BDY, TOZ));
        bed1.getWorld().getBlockAt(AXX, TOY, TOZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(AXX, TOY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BXX, TOY, BZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(BXX, TOY, BZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXX, TOY, BZZ));
        bed1.getWorld().getBlockAt(CXX, TOY, CZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(CXX, TOY, CZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXX, TOY, CZZ));
        bed1.getWorld().getBlockAt(DXX, TOY, CZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(DXX, TOY, CZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXX, TOY, CZZ));
        bed1.getWorld().getBlockAt(EXX, TOY, EZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(EXX, TOY, EZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXX, TOY, EZZ));
        bed1.getWorld().getBlockAt(FXX, TOY, FZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(FXX, TOY, FZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXX, TOY, FZZ));
        bed1.getWorld().getBlockAt(GXX, TOY, GZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(GXX, TOY, GZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXX, TOY, GZZ));
        bed1.getWorld().getBlockAt(HXX, TOY, HZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(HXX, TOY, HZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXX, TOY, HZZ));
        bed1.getWorld().getBlockAt(IXX, TOY, HZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(IXX, TOY, HZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXX, TOY, HZZ));
        bed1.getWorld().getBlockAt(JXX, TOY, JZZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(JXX, TOY, JZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXX, TOY, JZZ));
        bed1.getWorld().getBlockAt(AX, BDY, TOZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(AX, BDY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, BDY, TOZ));
        bed1.getWorld().getBlockAt(BX, BDY, BZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(BX, BDY, BZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, BDY, BZ));
        bed1.getWorld().getBlockAt(CX, BDY, BZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(CX, BDY, BZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, BDY, BZ));
        bed1.getWorld().getBlockAt(DX, BDY, DZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(DX, BDY, DZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, BDY, DZ));
        bed1.getWorld().getBlockAt(EX, BDY, EZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(EX, BDY, EZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, BDY, EZ));
        bed1.getWorld().getBlockAt(FX, BDY, EZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(FX, BDY, EZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, BDY, EZ));
        bed1.getWorld().getBlockAt(TOX, KYY, TOZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(TOX, KYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, KYY, TOZ));
        bed1.getWorld().getBlockAt(FX, KYY, TOZ).setType(Material.WOOL);
        bed1.getWorld().getBlockAt(FX, KYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, KYY, TOZ));
        bed1.getWorld().getBlockAt(AXXX, TOY, TOZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(AXXX, TOY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXXX, TOY, TOZ));
        bed1.getWorld().getBlockAt(BXXX, TOY, BZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(BXXX, TOY, BZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXXX, TOY, BZZZ));
        bed1.getWorld().getBlockAt(XXXX, TOY, ZZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(XXXX, TOY, ZZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(XXXX, TOY, ZZZZ));
        bed1.getWorld().getBlockAt(CXXX, TOY, CZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(CXXX, TOY, CZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXXX, TOY, CZZZ));
        bed1.getWorld().getBlockAt(DXXX, TOY, DZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(DXXX, TOY, DZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXXX, TOY, DZZZ));
        bed1.getWorld().getBlockAt(EXXX, TOY, EZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(EXXX, TOY, EZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXXX, TOY, EZZZ));
        bed1.getWorld().getBlockAt(FXXX, TOY, FZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(FXXX, TOY, FZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXXX, TOY, FZZZ));
        bed1.getWorld().getBlockAt(GXXX, TOY, GZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(GXXX, TOY, GZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXXX, TOY, GZZZ));
        bed1.getWorld().getBlockAt(HXXX, TOY, HZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(HXXX, TOY, HZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXXX, TOY, HZZZ));
        bed1.getWorld().getBlockAt(IXXX, TOY, IZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(IXXX, TOY, IZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXXX, TOY, IZZZ));
        bed1.getWorld().getBlockAt(JXXX, TOY, JZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(JXXX, TOY, JZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXXX, TOY, JZZZ));
        bed1.getWorld().getBlockAt(KXXX, TOY, KZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(KXXX, TOY, KZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(KXXX, TOY, KZZZ));
        bed1.getWorld().getBlockAt(LXXX, TOY, LZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(LXXX, TOY, LZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(LXXX, TOY, LZZZ));
        bed1.getWorld().getBlockAt(MXXX, TOY, MZZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(MXXX, TOY, MZZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(MXXX, TOY, MZZZ));
        bed1.getWorld().getBlockAt(AXX, OYYY, TOZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(AXX, OYYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AXX, OYYY, TOZ));
        bed1.getWorld().getBlockAt(BXX, OYYY, BZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(BXX, OYYY, BZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BXX, OYYY, BZZ));
        bed1.getWorld().getBlockAt(CXX, OYYY, CZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(CXX, OYYY, CZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CXX, OYYY, CZZ));
        bed1.getWorld().getBlockAt(DXX, OYYY, CZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(DXX, OYYY, CZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DXX, OYYY, CZZ));
        bed1.getWorld().getBlockAt(EXX, OYYY, EZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(EXX, OYYY, EZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EXX, OYYY, EZZ));
        bed1.getWorld().getBlockAt(FXX, OYYY, FZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(FXX, OYYY, FZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FXX, OYYY, FZZ));
        bed1.getWorld().getBlockAt(GXX, OYYY, GZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(GXX, OYYY, GZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(GXX, OYYY, GZZ));
        bed1.getWorld().getBlockAt(HXX, OYYY, HZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(HXX, OYYY, HZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(HXX, OYYY, HZZ));
        bed1.getWorld().getBlockAt(IXX, OYYY, HZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(IXX, OYYY, HZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(IXX, OYYY, HZZ));
        bed1.getWorld().getBlockAt(JXX, OYYY, JZZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(JXX, OYYY, JZZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(JXX, OYYY, JZZ));
        bed1.getWorld().getBlockAt(AX, PYYY, TOZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(AX, PYYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(AX, PYYY, TOZ));
        bed1.getWorld().getBlockAt(BX, PYYY, BZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(BX, PYYY, BZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(BX, PYYY, BZ));
        bed1.getWorld().getBlockAt(CX, PYYY, BZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(CX, PYYY, BZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(CX, PYYY, BZ));
        bed1.getWorld().getBlockAt(DX, PYYY, DZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(DX, PYYY, DZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(DX, PYYY, DZ));
        bed1.getWorld().getBlockAt(EX, PYYY, EZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(EX, PYYY, EZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(EX, PYYY, EZ));
        bed1.getWorld().getBlockAt(FX, PYYY, EZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(FX, PYYY, EZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, PYYY, EZ));
        bed1.getWorld().getBlockAt(TOX, NYYY, TOZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(TOX, NYYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(TOX, NYYY, TOZ));
        bed1.getWorld().getBlockAt(FX, NYYY, TOZ).setType(Material.STAINED_GLASS);
        bed1.getWorld().getBlockAt(FX, NYYY, TOZ).setData((byte) ((int) woolcolor));
        ar1.addPlacedBlock(bed1.getWorld().getBlockAt(FX, NYYY, TOZ));
    }
}
