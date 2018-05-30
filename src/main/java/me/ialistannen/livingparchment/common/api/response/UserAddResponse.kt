package me.ialistannen.livingparchment.common.api.response

data class UserAddResponse(val username: String, val status: UserAddStatus)

enum class UserAddStatus {
    ADDED,
    ALREADY_EXISTED
}