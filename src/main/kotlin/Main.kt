package ru.wall
import java.util.*


fun main() {
    val calendar = Calendar.getInstance()
    val timestamp = calendar.timeInMillis
    val attachment: Attachment = AudioAttachment(AttachmentType.AUDIO, Audio(id = 1, ownerId = 10, albumId = 15, userId = 100))

    val post = Post(
            ownerId = 15,
            fromId = 25,
            createdBy = 1,
            date = timestamp,
            text = "Новый пост 1",
            replyPostId = 10,
            comments = "",
            copyright = "",
            attachments = attachment,
            likes = 0,
            views = 0,
            replyOwnerId = null,
            postType = "",
            signerId = 0,
            geo = null,
            postSource = null,
            reposts = null,
    )
    println("Первый пост: $post")
    WallService.add(post)
    val twoPost = Post(
            ownerId = 15,
            fromId = 25,
            createdBy = 1,
            date = timestamp,
            text = "Новый пост 2",
            replyPostId = 10,
            comments = "",
            copyright = "",
            attachments = attachment,
            likes = 0,
            views = 0,
            postType = "",
            signerId = 0,
            replyOwnerId = null,
            geo = null,
            postSource = null,
            reposts = null,
    )
    println("Второй пост: $twoPost")
    WallService.add(twoPost)
    val result1 = WallService.getPost(id = 1)
    println("Пост до изменения: $result1")
    val updatedPost = twoPost.copy(likes = 10, text = "Новый текст")
    WallService.update(updatedPost)

    val result2 = WallService.getPost(id = 1)
    println("Пост после изменения: $result2")
}
