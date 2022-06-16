package ru.netology

data class PostSource(
    val type : String, // Тип источника.
    val platgorm : String, // Название платформы, если оно доступно.
    val data : String, // Тип действия (только для type = vk или widget).
    val url : String // URL ресурса, с которого была опубликована запись.
)
