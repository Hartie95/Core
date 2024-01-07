package org.anime_game_servers.core.base.annotations.proto


/**
 * This annotation is used to mark a class as a proto command. This means it's not just a data definition, but instead a root message
 * that's send between the server and the client.
 * @param type The type of the command. This is used to define the direction and situation in which the command is used.
 * @param alternateNames Alternative names for the command. This is used for the mapping of the proto definition for the parsing.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class ProtoCommand(val type: CommandType, vararg val alternateNames: String)
