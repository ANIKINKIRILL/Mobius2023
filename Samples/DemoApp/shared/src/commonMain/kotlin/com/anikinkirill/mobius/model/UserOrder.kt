package com.anikinkirill.mobius.model

import io.github.skeptick.libres.images.Image

data class UserOrder(
    val userItems: List<Image>,
)