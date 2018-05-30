package me.ialistannen.livingparchment.common.api.response

data class LoginResponse(val token: String?, val status: LoginStatus)

enum class LoginStatus {
    AUTHENTICATED,
    INVALID_CREDENTIALS,
    INTERNAL_ERROR
}