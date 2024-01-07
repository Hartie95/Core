package org.anime_game_servers.core.base.annotations.proto

import org.anime_game_servers.core.base.Version
import kotlin.reflect.KClass

/**
 * This wraps the information of a oneOf entry in a proto message for use in [OneOf].
 * @param type The type of the oneOf entries data.
 * @param name The potential names of the oneOf entries.
 * @param addedIn The version this oneOf entry was added in. If this is [Version.DEFAULT] it is assumed that this entry was added together with the corresponding field.
 * @param removedIn The version this oneOf entry was removed in. If this is [Version.DEFAULT] it is assumed that this entry was not removed.
 */
@Target(AnnotationTarget.PROPERTY)
annotation class OneOfEntry(
    val type: KClass<*>,
    vararg val name: String,
    val addedIn: Version = Version.DEFAULT,
    val removedIn: Version = Version.DEFAULT
)
