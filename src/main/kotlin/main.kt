
package ru.netology

fun main(args: Array<String>) {

    val post1 = Post(
        1,
        12345689,
        12345689,
        111111,
        1460041200,
        "Пост 1",
        12345689,
        6765,
        true,
        CommentsObject(123, true, false, false,true),
        CopyrightObject(23452784, "dfdfdsf","Текст","тип"),
        LikesObject(4873, true, true,true),
        RepostsObject(23, false),
        ViewsObject(21),
        "post", //post, copy, reply, postpone, suggest.
        12786,
        true,
        true,
        false,
        true,
        false,
        false,
        DonutObject(true, 223,"placeholder", true, "all"),
        1
    )
    val post2 = Post(
        2,
        12345665,
        12345665,
        111111,
        1460041200,
        "Пост 2",
        12345689,
        6765,
        true,
        CommentsObject(123, true, false, false,true),
        CopyrightObject(23452784, "dfdfdsf","Текст","тип"),
        LikesObject(4873, true, true,true),
        RepostsObject(23, false),
        ViewsObject(21),
        "post", //post, copy, reply, postpone, suggest.
        12786,
        true,
        true,
        false,
        true,
        false,
        false,
        DonutObject(true, 223,"placeholder", true, "all"),
        1
    )
    val post3 = Post(
        3,
        12345670,
        12345555,
        111111,
        1460041200,
        "Пост 3",
        12345689,
        6765,
        false,
        CommentsObject(123, true, false, false,true),
        CopyrightObject(23452784, "dfdfdsf","Текст","тип"),
        LikesObject(4873, true, true,true),
        RepostsObject(23, false),
        ViewsObject(21),
        "post", //post, copy, reply, postpone, suggest.
        12786,
        true,
        true,
        false,
        true,
        false,
        false,
        DonutObject(true, 223,"placeholder", true, "all"),
        1
    )

    val post4 = Post(
        4,
        99999999,
        99999999,
        99999999,
        1460041200,
        "Update",
        99999999,
        99999999,
        true,
        CommentsObject(99999999, true, false, false,true),
        CopyrightObject(99999999, "Update","Update","Update"),
        LikesObject(99999999, true, true,true),
        RepostsObject(99999999, false),
        ViewsObject(99999999),
        "post", //post, copy, reply, postpone, suggest.
        99999999,
        true,
        true,
        false,
        true,
        false,
        false,
        DonutObject(true, 99999999,"Update", true, "Update"),
        1
    )

    WallService.add(post1)
    WallService.add(post2)

    WallService.print()

    if (WallService.update(post4)) WallService.print()
    if (WallService.update(post3)) WallService.print()
}