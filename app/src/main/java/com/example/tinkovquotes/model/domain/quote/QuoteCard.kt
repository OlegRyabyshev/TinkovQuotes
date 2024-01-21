package com.example.tinkovquotes.model.domain.quote

data class QuoteItem(
    val id: Int,
    val title: String,
    val topicType: TopicItemType,
    val isFavorite: Boolean
) {

    enum class TopicItemType {
        HAPPY,
        LIKING,
        SAD,
        ANNOYED,
        BASED,
        RICH,
        DREAMING,
        THINKING,
        SARCASTIC,
        QUESTIONING,
        NOT_CARING,
        NOT_SURE
    }
}