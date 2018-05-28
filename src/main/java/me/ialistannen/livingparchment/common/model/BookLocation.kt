package me.ialistannen.livingparchment.common.model

import java.util.*

data class BookLocation(val name: String,
                        val description: String = "",
                        val uuid: UUID = UUID.randomUUID()
)