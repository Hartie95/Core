package org.anime_game_servers.core.base.annotations.proto

/**
 * This marks an enum as that's also a Proto model. It will result in code gen that will create handlers far parsing packages with it.
 * @param parentClass The name of the parent class. This is used in cases where a model is nested in another model.
 *                    This is required for example when there are multiple proto definitions with the same name in the original source
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class ProtoEnum(val parentClass: String = "", vararg val alternativeNames: String)