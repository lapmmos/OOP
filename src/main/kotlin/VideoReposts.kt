package ru.netology

data class VideoReposts(
    val count : Int, //  Счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения
    val wallCount : Int, // Счетчик репостов на стену
    val MailCount : Int, // Счетчик репостов в личные сообщения
    val userReposted : Boolean // Информация о том, сделал ли текущий пользователь репост этого видео.
)
