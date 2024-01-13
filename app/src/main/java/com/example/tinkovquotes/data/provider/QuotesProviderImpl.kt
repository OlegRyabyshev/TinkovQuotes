package com.example.tinkovquotes.data.provider

import com.example.tinkovquotes.model.data.quote.QuoteDataModel

class QuotesProviderImpl : QuotesProvider {

    override fun getQuotesList(): List<QuoteDataModel> =
        listOf(
            QuoteDataModel(
                id = 1,
                titleText = "Вот подзаебала эта тема",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 2,
                titleText = "Попробую, попытаюсь объяснить",
                subtitleText = "Для кого-то это будет оправданием"
            ),
            QuoteDataModel(
                id = 3,
                titleText = "Это было непросто смело",
                subtitleText = "Это было пиздец как смело"
            ),
            QuoteDataModel(
                id = 4,
                titleText = "Мы любим такие формы, форматы",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 5,
                titleText = "Сказать такое",
                subtitleText = "Я, считаю, это супер круто"
            ),
            QuoteDataModel(
                id = 6,
                titleText = "Это был сарказм",
                subtitleText = "Большой"
            ),
            QuoteDataModel(
                id = 7,
                titleText = "Кстати, я ним хорошо отношусь ко всем",
                subtitleText = "Они ребята реально хорошие"
            ),
            QuoteDataModel(
                id = 8,
                titleText = "Объяснил",
                subtitleText = "Надеюсь"
            ),
            QuoteDataModel(
                id = 9,
                titleText = "Ну окей... Мы не знаем",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 10,
                titleText = "Это не так устроено",
                subtitleText = "Они там в космосе где-то"
            ),
            QuoteDataModel(
                id = 11,
                titleText = "Я его чморил",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 12,
                titleText = "Я делал то, что я мог делать",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 13,
                titleText = "Вообще ничего никогда не сказал ваш герой",
                subtitleText = "Вообще, блядь, никогда он и ничего не сказал. И сейчас молчит"
            ),
            QuoteDataModel(
                id = 14,
                titleText = "Ваш герой. Чеж же он молчит-то?",
                subtitleText = "Что он сказал?"
            ),
            QuoteDataModel(
                id = 15,
                titleText = "Можно мечтать. И я с вами вместе мечтаю",
                subtitleText = "Ну давайте мечтать. А можно быть реалистом. А реалистично это никогда не будет"
            ),
            QuoteDataModel(
                id = 16,
                titleText = "Ну это пиздец какой-то",
                subtitleText = "Ну сколько можно?"
            ),
            QuoteDataModel(
                id = 17,
                titleText = "Жопу лижете",
                subtitleText = "Заебись"
            ),
            QuoteDataModel(
                id = 18,
                titleText = "Я ошибся. Я могу один раз ошибиться?",
                subtitleText = "Мне можно это простить? Ошибся, допустим. Давайте прошу у всех прощения за эту фразу"
            ),
            QuoteDataModel(
                id = 19,
                titleText = "Но я остаюсь с тем, что это был великий сарказм",
                subtitleText = "И что в принципе в моей фразе есть много логики, если о ней хорошо подумать"
            ),
            QuoteDataModel(
                id = 20,
                titleText = "Ну ты понимаешь, я никого не хочу осуждать",
                subtitleText = "Кто-то это намеренно избегает, кто-то неинтересно. Вот мне неинтересно."
            )
        )
}