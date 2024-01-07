package org.anime_game_servers.core.base.annotations.proto

/**
 * This annotation is used to specify alternative names for a field that represents a proto field.
 */
@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.SOURCE)
annotation class AltName(vararg val altNames: String)
