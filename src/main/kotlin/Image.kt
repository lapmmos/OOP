package ru.netology

data class Image(
    val height : Int, //Высота изображения.
    val url : String, // Ссылка на изображение
    val width : Int, // Ширина изображения
    val withPadding : Int = 1 // Поле возвращается, если изображение с отбивкой, всегда содержит 1.
)
