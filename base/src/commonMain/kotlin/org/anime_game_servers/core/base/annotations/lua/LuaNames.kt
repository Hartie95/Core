package org.anime_game_servers.core.base.annotations.lua

/**
 * This annotation allows to specify names of lua models and members. The first name is the default name also used for serialisation.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION)
annotation class LuaNames(vararg val value: String)
