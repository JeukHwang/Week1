package com.madcamp.week1.profile

data class SignupData(
    val id: String,
    val name: String,
    val classNum: String,
    val profilePhoto: String,
    val email: String?,
    val githubId: String?,
    val instagramId: String?,
    val facebookId: String?,
    val linkedInId: String?,
    val explanation: String,
)
