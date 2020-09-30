package ru.wall

data class Post(
    val id: Int = WallService.getNumberPost(),
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Long,
    val text: String = "",
    val replyOwnerId: Int?,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: String = "",
    val copyright: String = "",
    val likes: Int = 0,
    val reposts: Post?,
    val views: Int = 0,
    val postType: String = "",
    val postSource: Post?,
    val attachments: Attachment?,
    val geo: String?,
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postenedId: Int = 0,
)