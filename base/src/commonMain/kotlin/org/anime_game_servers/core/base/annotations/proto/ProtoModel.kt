package org.anime_game_servers.core.base.annotations.proto

/**
 * This is used to identify an interface as a proto model definition that will be used to generate handling classes and mapped to proto defintions.
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class ProtoModel(val parentClass: String = "", vararg val alternativeNames: String)
