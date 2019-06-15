package com.boundless.jerboa.platform

interface BasicMusicPlayer {
    fun load(
            resource: Int,
            looping: Boolean = false
    )
    fun start()
    fun stop()
}
