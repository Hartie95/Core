package org.anime_game_servers.core.gi.models

interface Vector {
    fun getX(): Float
    fun getY(): Float
    fun getZ(): Float


    /**
     * To XYZ array for Spatial Index
     */
    fun toDoubleArray(): DoubleArray {
        return doubleArrayOf(getX().toDouble(), getY().toDouble(), getZ().toDouble())
    }

    /**
     * To XZ array for Spatial Index (Blocks)
     */
    fun toXZDoubleArray(): DoubleArray {
        return doubleArrayOf(getX().toDouble(), getZ().toDouble())
    }
}