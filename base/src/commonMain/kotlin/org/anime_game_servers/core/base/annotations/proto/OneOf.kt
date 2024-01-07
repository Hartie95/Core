package org.anime_game_servers.core.base.annotations.proto

/**
 * This is used to define the metadata for proto fields with the type [OneOfType].
 */
@Target(AnnotationTarget.PROPERTY)
annotation class OneOf(vararg val types: OneOfEntry, val allowTypedBasedMapping: Boolean = true)
