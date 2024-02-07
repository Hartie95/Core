package org.anime_game_servers.core.gi.enums

import org.anime_game_servers.core.base.annotations.lua.LuaNames
import org.anime_game_servers.core.base.annotations.lua.LuaStatic
import org.anime_game_servers.core.base.interfaces.IntValueEnum

@Suppress("RUNTIME_ANNOTATION_NOT_SUPPORTED")
@LuaStatic
@LuaNames("ElementType")
enum class Element(val id:Int) : IntValueEnum {
    @LuaNames("None")
    NONE(0),
    @LuaNames("Fire")
    FIRE(1),
    @LuaNames("Water")
    WATER(2),
    @LuaNames("Grass")
    GRASS(3),
    @LuaNames("Electric")
    ELECTRIC(4),
    @LuaNames("Ice")
    ICE(5),
    @LuaNames("Frozen")
    FROZEN(6),
    @LuaNames("Wind")
    WIND(7),
    @LuaNames("Rock")
    ROCK(8),
    @LuaNames("AntiFire")
    ANTI_FIRE(9),
    @LuaNames("VehicleMuteIce")
    VEHICLE_MUTE_ICE(10),
    @LuaNames("Mushroom")
    MUSHROOM(11),
    @LuaNames("Overdose")
    OVERDOSE(12),
    @LuaNames("Wood")
    WOOD(13),
    @LuaNames("count")
    COUNT(14),
    DEFAULT(255);

    override fun getValue() = id
}