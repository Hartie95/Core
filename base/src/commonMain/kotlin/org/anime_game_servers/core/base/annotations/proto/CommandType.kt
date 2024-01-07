package org.anime_game_servers.core.base.annotations.proto

/**
 * This defines the type a proto command is. This can be used to identify the direction of a command in Server client communication.
 */
enum class CommandType {
    REQUEST,
    RESPONSE,
    NOTIFY,
    CLIENT,
    BOTH
}