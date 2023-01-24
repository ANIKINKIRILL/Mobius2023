package com.anikinkirill.mobius

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform