package org.anime_game_servers.core.gi.enums

import org.anime_game_servers.core.base.annotations.lua.LuaNames
import org.anime_game_servers.core.base.annotations.lua.LuaStatic
import org.anime_game_servers.core.base.interfaces.IntValueEnum

@LuaStatic
@LuaNames("ElementType")
enum class Element(val id:Int) : IntValueEnum {
    NONE(0),
    FIRE(1),
    WATER(2),
    GRASS(3),
    ELECTRIC(4),
    ICE(5),
    FROZEN(6),
    WIND(7),
    ROCK(8),
    ANTI_FIRE(9),
    VehicleMuteIce(10),
    Mushroom(11),
    Overdose(12),
    Wood(13),
    COUNT(14),
    DEFAULT(255);

    override fun getValue() = id
}