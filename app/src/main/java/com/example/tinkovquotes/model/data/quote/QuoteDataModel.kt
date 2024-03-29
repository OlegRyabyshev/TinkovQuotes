package com.example.tinkovquotes.model.data.quote

data class QuoteDataModel(
    val id: Int,
    val titleText: String,
    val topicType: TopicType
) {
    enum class TopicType {
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