package ru.netology

data class Comment(
    val id : Int, // Идентификатор комментария
    val postId : Int, // идентификатор поста
    val fromId : Int, // Идентификатор автора комментария
    val date : Int, // Дата создания комментария в формате Unixtime
    val text : String, // Текст комментария
    val donut : DonutObject?, //  Информация о VK Donut
    val attachments : Array<Attachment>? = emptyArray(), // Медиавложения комментария (фотографии, ссылки и т.п.)
    val parentsStack : Array<Int>? = emptyArray(), // Массив идентификаторов родительских комментариев
    val thread : Thread?
)
