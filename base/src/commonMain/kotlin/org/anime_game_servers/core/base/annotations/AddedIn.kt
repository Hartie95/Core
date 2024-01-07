package org.anime_game_servers.core.base.annotations

import org.anime_game_servers.core.base.Version

/**
 * This identifies models and properties that got added in a specific version of the game.
 * If not added to a property, it's assumed that the property was added in the same version as the model.
 */
annotation class AddedIn(val version: Version)
