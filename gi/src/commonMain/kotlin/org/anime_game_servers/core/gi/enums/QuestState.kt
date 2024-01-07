package org.anime_game_servers.core.gi.enums

import org.anime_game_servers.core.base.annotations.lua.LuaNames
import org.anime_game_servers.core.base.annotations.lua.LuaStatic
import org.anime_game_servers.core.base.interfaces.IntValueEnum

@LuaStatic
enum class QuestState(val id: Int) : IntValueEnum {
    @LuaNames("NONE")
    QUEST_STATE_NONE(0),
    @LuaNames("UNSTARTED")
    QUEST_STATE_UNSTARTED(1),
    @LuaNames("UNFINISHED")
    QUEST_STATE_UNFINISHED(2),
    @LuaNames("FINISHED")
    QUEST_STATE_FINISHED(3),
    @LuaNames("FAILED")
    QUEST_STATE_FAILED(4),
    @LuaNames("UNKNOWN")
    QUEST_STATE_UNKNOWN(9999);

    override fun getValue() = id
}