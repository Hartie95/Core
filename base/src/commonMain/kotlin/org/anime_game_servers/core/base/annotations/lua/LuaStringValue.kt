package org.anime_game_servers.core.base.annotations.lua

/**
 * This annotation marks a class to be exported into the default context of a lua engine.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class LuaStringValue(val value: String)