package ru.netology

data class LikesObject(
    val count : Int,
    val userLikes : Boolean,
    val canLike : Boolean,
    val canPublish : Boolean
)
