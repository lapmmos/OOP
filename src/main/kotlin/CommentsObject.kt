package ru.netology

data class CommentsObject(
    val count : Int,
    val canPost : Boolean,
    val groupsCanPost : Boolean,
    val canClose : Boolean,
    val canOpen : Boolean
)
