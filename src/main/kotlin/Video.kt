package ru.netology

data class Video(
    val id : Int, //	Идентификатор видеозаписи
    val owneId : Int, // Идентификатор владельца видеозаписи
    val title : String, // Название видеозаписи
    val description : String, // Текст описания видеозаписи
    val duration : Int, // Длительность ролика в секундах
    val image : Array<Image>? = emptyArray<Image>(), // Изображение обложки
    val firstFrame : Array<Image>? = emptyArray<Image>(), // Изображение первого кадра
    val date : Int, // Дата создания видеозаписи в формате Unixtime
    val adding_date : Int, // Дата добавления видеозаписи пользователем или группой в формате Unixtime.
    val views : Int, //	Количество просмотров видеозаписи
    val localViews : Int, // Если видео внешнее, количество просмотров в ВК
    val comments : Int, // Количество комментариев к видеозаписи
    val player : String, // URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и html5, плеер всегда масштабируется по размеру окна.
    val platform : String, // Название платформы (для видеозаписей, добавленных с внешних сайтов)
    val canAdd : Boolean, // Может ли пользователь добавить видеозапись к себе, true может
    val isPrivate : Boolean = true, // Поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
    val accessKey : String, // Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
    val processing : Boolean, // Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
    val isFavorite : Boolean, // true, если объект добавлен в закладки у текущего пользователя.
    val canComment : Boolean, // Может ли пользователь комментировать видео. true может
    val canEdit : Boolean, // Может ли пользователь редактировать видео, true может
    val canLike : Boolean, // Может ли пользователь добавить видео в список <<Мне нравится>>, true может
    val canRepost : Boolean, // Может ли пользователь сделать репост видео, true может
    val canSubscribe : Boolean, // Может ли пользователь подписаться на автора видео, true может
    val canAddToFaves : Boolean, // Может ли пользователь добавить видео в избранное. true может
    val canAttachLink : Boolean, // Может ли пользователь прикрепить кнопку действия к видео.  true может
    val width : Int, // Ширина видео
    val height : Int, // Высота видео
    val userId : Int, // Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников
    val converting : Boolean, // Конвертируется ли видео, true - да
    val added : Boolean, // Добавлено ли видео в альбомы пользователя, true - да
    val isSubscribed : Boolean, // Подписан ли пользователь на автора видео.true - да
    val repeat : Int, // Поле возвращается в том случае, если видео зациклено, всегда содержит 1
    val type : String, // Тип видеозаписи. Может принимать значения: "video", "music_video", "movie".
    val balance : Int, // Баланс донатов в прямой трансляции.
    val live_status : String, // Статус прямой трансляции. Может принимать значения: "waiting", "started", "finished", "failed", "upcoming".
    val live : Boolean, // Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
    val upcoming : Boolean, // Поле свидетельствует о том, что трансляция скоро начнётся
    val spectators : Int, // Количество зрителей прямой трансляции
    val likes : VideoLikes, // Содержит объект отметки <<Мне нравится>>
    val repostst : VideoReposts // Содержит объект репоста.
)
