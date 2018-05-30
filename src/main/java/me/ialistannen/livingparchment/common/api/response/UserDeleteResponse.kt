package me.ialistannen.livingparchment.common.api.response

class UserDeleteResponse(val name: String, val status: UserDeleteStatus)

enum class UserDeleteStatus {
    NOT_FOUND,
    DELETED
}