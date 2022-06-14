package ru.netology

data class Post(
    var id : Long = 0,
    val ownerId : Long,
    val fromId : Long,
    val createdBy : Long,
    val date : Long,
    val text : String,
    val replyOwnerId : Long,
    val replyPostId : Long,
    val friendsOnly : Boolean,
    val comments : CommentsObject,
    val copyright : CopyrightObject,
    val likes : LikesObject,
    val reposts : RepostsObject,
    val views : ViewsObject,
    val postType : String,
    val signerId : Long,
    val canPin : Boolean,
    val canDelete : Boolean,
    val canEdit : Boolean,
    val isPinned : Boolean,
    val markedAsAds : Boolean,
    val isFavorite : Boolean,
    val donut : DonutObject,
    val postponedId : Long
)
{}
