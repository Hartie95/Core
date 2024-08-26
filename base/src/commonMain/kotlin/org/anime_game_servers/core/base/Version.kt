package org.anime_game_servers.core.base

import kotlin.jvm.JvmStatic

import org.anime_game_servers.core.base.Game.GI
import org.anime_game_servers.core.base.Game.HKSR
import org.anime_game_servers.core.base.Game.NONE

enum class Version(val game: Game, val id:Int, val namespace:String) {
    DEFAULT(NONE, 0,"DEFAULT"),

    GI_CB1(GI, 700,"VCB1"),
    GI_CB2(GI, 800,"VCB2"),
    GI_0_9_0(GI, 900,"V0_9"),
    GI_1_0_0(GI, 1000,"V1_0"),
    GI_1_1_0(GI, 1100,"V1_1"),
    GI_1_2_0(GI, 1200,"V1_2"),
    GI_1_3_0(GI, 1300,"V1_3"),
    GI_1_4_0(GI, 1400,"V1_4"),
    GI_1_5_0(GI, 1500,"V1_5"),
    GI_1_6_0(GI, 1600,"V1_6"),
    GI_2_0_0(GI, 2000,"V2_0"),
    GI_2_1_0(GI, 2100,"V2_1"),
    GI_2_2_0(GI, 2200,"V2_2"),
    GI_2_3_0(GI, 2300,"V2_3"),
    GI_2_4_0(GI, 2400,"V2_4"),
    GI_2_5_0(GI, 2500,"V2_5"),
    GI_2_6_0(GI, 2600,"V2_6"),
    GI_2_7_0(GI, 2700, "V2.7"),
    GI_2_8_0(GI, 2800, "V2_8"),
    GI_3_0_0(GI, 3000, "V3_0"),
    GI_3_1_0(GI, 3100, "V3_2"),
    GI_3_2_0(GI, 3200, "V3_2"),
    GI_3_3_0(GI, 3300, "V3_3"),
    GI_3_4_0(GI, 3400, "V3_4"),
    GI_3_5_0(GI, 3500, "V3_5"),
    GI_3_6_0(GI, 3600, "V3_6"),
    GI_3_7_0(GI, 3700, "V3_7"),
    GI_3_8_0(GI, 3800, "V3_8"),
    GI_4_0_0(GI, 4000, "V4_0"),
    GI_4_0_1(GI, 4001, "V4_0"),
    GI_4_1_0(GI, 4100, "V4_1"),
    GI_4_2_0(GI, 4200, "V4_2"),
    GI_4_3_0(GI, 4300, "V4_3"),
    GI_4_4_0(GI, 4400, "V4_4"),
    GI_4_5_0(GI, 4500, "V4_5"),
    GI_4_6_0(GI, 4600, "V4_6"),
    GI_4_7_0(GI, 4700, "V4_7"),
    GI_4_8_0(GI, 4800, "V4_8"),
    GI_5_0_0(GI, 5000, "V5_0"),
    GI_5_1_0(GI, 5100, "V5_1"),
    GI_5_2_0(GI, 5200, "V5_2"),
    GI_5_3_0(GI, 5300, "V5_3"),
    GI_5_4_0(GI, 5400, "V5_4"),
    GI_5_5_0(GI, 5500, "V5_5"),
    GI_5_6_0(GI, 5600, "V5_6"),

    SR_CB1(HKSR, 600, "VCB1"),
    SR_CB2(HKSR, 700, "VCB2"),
    SR_CB3(HKSR, 900, "VCB3"),
    SR_1_0_0(HKSR, 1000, "V1_0"),
    SR_1_1_0(HKSR, 1100, "V1_1"),
    SR_1_2_0(HKSR, 1200, "V1_2"),
    SR_1_3_0(HKSR, 1300, "V1_3"),
    SR_1_4_0(HKSR, 1400, "V1_4"),
    SR_1_5_0(HKSR, 1500, "V1_5"),
    SR_1_6_0(HKSR, 1600, "V1_6"),
    SR_2_0_0(HKSR, 2000, "V2_0"),
    SR_2_1_0(HKSR, 2100, "V2_1"),
    SR_2_2_0(HKSR, 2200, "V2_2"),
    SR_2_3_0(HKSR, 2300, "V2_3"),
    SR_2_4_0(HKSR, 2400, "V2_4"),
    SR_2_5_0(HKSR, 2500, "V2_5"),
    ;
    companion object {
        @JvmStatic
        fun fromId(game: Game, id:Int):Version?{
            return entries.firstOrNull { it.game == game && it.id == id }
        }

        @JvmStatic
        fun fromVersion(game: Game, major: Int, minor: Int, fix:Int):Version?{
            val versionId = idFromVersion(game, major, minor, fix)
            return entries.firstOrNull { it.game == game && it.id == versionId }
        }

        @JvmStatic
        fun idFromVersion(game: Game, major: Int, minor: Int, fix:Int):Int{
            return major*1000 + minor*100 +fix;
        }
    }
}
