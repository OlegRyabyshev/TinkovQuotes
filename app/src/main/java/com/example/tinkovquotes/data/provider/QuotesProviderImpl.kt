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
            ),
            QuoteDataModel(
                id = 21,
                titleText = "Они все очень, на мой взгляд, тупые",
                subtitleText = "Они все, так сказать, примитивные"
            ),
            QuoteDataModel(
                id = 22,
                titleText = "У них какое-то чинопочитание там, какое-то величие",
                subtitleText = "Какая-то хуйня бля, мне вообще они неинтересны, я не хочу с ними разговаривать"
            ),
            QuoteDataModel(
                id = 23,
                titleText = "Я это не понимаю, мне это это неинтересно",
                subtitleText = "Вот мне лично это неинтересно. За других сказать не могу"
            ),
            QuoteDataModel(
                id = 24,
                titleText = "Круто, это же круто",
                subtitleText = "Да это же круто"
            ),
            QuoteDataModel(
                id = 25,
                titleText = "Какие у нас классные ребята работают",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 26,
                titleText = "Мне это неинтересно",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 27,
                titleText = "Я уважаю что они делают, но как бы",
                subtitleText = "Я не понимаю, я во первых процессы эти многие не понимаю"
            ),
            QuoteDataModel(
                id = 28,
                titleText = "Да, конечно, мы все виноваты в этом пиздеце",
                subtitleText = "Все мы виноваты в этом пиздеце. Вся Россия помазалась этим говном"
            ),
            QuoteDataModel(
                id = 29,
                titleText = "Я реально прихерел",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 30,
                titleText = "Это, конечно, печально",
                subtitleText = "Это печально"
            ),
            QuoteDataModel(
                id = 31,
                titleText = "То есть как вот это",
                subtitleText = "Это вот так вот как-то щелкает"
            ),
            QuoteDataModel(
                id = 32,
                titleText = "Ты, блять, можешь себе представить?",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 33,
                titleText = "Ну, вообщем-то, да. Как это происходит я не понимаю",
                subtitleText = "У кого-то это щелкает, а у кого-то это не щелкает"
            ),
            QuoteDataModel(
                id = 34,
                titleText = "Я проснулся утром",
                subtitleText = "Если честно, я день первый ничего не понимал"
            ),
            QuoteDataModel(
                id = 35,
                titleText = "Я как бы не понимал весь масштаб этого пиздеца",
                subtitleText = "Я думал это просто че-то какая-то там. Ну знаешь. Я не очень понял контекст. Еще был занят в этот день"
            ),
            QuoteDataModel(
                id = 36,
                titleText = "Я не мог в это поверить. Это было невозможно",
                subtitleText = "Я спорил со всеми"
            ),
            QuoteDataModel(
                id = 37,
                titleText = "Ну, естественно, я в это поверить не мог",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 38,
                titleText = "Ну, у меня взяло где-то 48 часов как бы осознать, вообще, что происходит",
                subtitleText = "Как бы потому что я не мог в это поверить. Я, кстати, до сих пор не очень в это верю, если честно"
            ),
            QuoteDataModel(
                id = 39,
                titleText = "Дай им бог здоровья. Спасибо за то, что они меня спасали",
                subtitleText = "Если бы не они, я бы, конечно, не выжил"
            ),
            QuoteDataModel(
                id = 40,
                titleText = "Ну что это за пиздец такой",
                subtitleText = "Ну как это может быть в 21 веке"
            ),
            QuoteDataModel(
                id = 41,
                titleText = "Мне не надо никаких миллиардов. Я ничего не хочу",
                subtitleText = "Я не хочу это видеть. Я хочу про это сказать всем. Понимаешь, это моя позиция"
            ),
            QuoteDataModel(
                id = 42,
                titleText = "Я посчитал, что правильным умереть с хорошей кармой",
                subtitleText = "Потому что, ну, мы все умрем"
            ),
            QuoteDataModel(
                id = 43,
                titleText = "Хочется умереть достойно",
                subtitleText = "И чтобы тебя семья вспоминала и дети тобой гордились"
            ),
            QuoteDataModel(
                id = 44,
                titleText = "Наш папа ссыкун",
                subtitleText = "Язык в жопу засунул"
            ),
            QuoteDataModel(
                id = 45,
                titleText = "Да мне было страшно",
                subtitleText = "Но я это сделал"
            ),
            QuoteDataModel(
                id = 46,
                titleText = "Они нормальные люди",
                subtitleText = "Они разберутся. Пройдет один год, два, три"
            ),
            QuoteDataModel(
                id = 47,
                titleText = "Я никогда не коллаборировал",
                subtitleText = "Не состоял, что называется. Не участвовал. Ничего."
            ),
            QuoteDataModel(
                id = 48,
                titleText = "Они меня ввели туда случайно",
                subtitleText = "Они сделали ошибку"
            ),
            QuoteDataModel(
                id = 49,
                titleText = "Ну да, конечно, мы знаем, типа бля, ну, конееечно, ну мы же знаем",
                subtitleText = "Ну они знают. Вот они знают. Я не знаю"
            ),
            QuoteDataModel(
                id = 50,
                titleText = "Это так не работает. У них там какие-то другие...",
                subtitleText = "Они по фактам"
            ),
            QuoteDataModel(
                id = 51,
                titleText = "Это полный бред",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 52,
                titleText = "Ну... вы можете так считать",
                subtitleText = "Молодцы. Посмотрим"
            ),
            QuoteDataModel(
                id = 53,
                titleText = "Но парадоксальным образом это то, что спасает мою жизнь",
                subtitleText = "Понимаешь. Это инь и янь"
            ),
            QuoteDataModel(
                id = 54,
                titleText = "То есть, понимаешь, ты должен страдать",
                subtitleText = "И тогда вроде как... Ну понимаешь, да?"
            ),
            QuoteDataModel(
                id = 55,
                titleText = "Окей, окей, окей. Я заткнулся",
                subtitleText = "Я хотя бы что-то предложил"
            ),
            QuoteDataModel(
                id = 56,
                titleText = "Ну, конечно",
                subtitleText = "Я же человек"
            ),
            QuoteDataModel(
                id = 57,
                titleText = "Не кайфно",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 58,
                titleText = "Ну как будто не совсем понимаю как это работает",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 59,
                titleText = "Но если принять это за, ну так сказать, правду",
                subtitleText = "То это страшная штука"
            ),
            QuoteDataModel(
                id = 60,
                titleText = "Как бы не хотелось бы",
                subtitleText = "Прямо скажем"
            ),
            QuoteDataModel(
                id = 61,
                titleText = "Когда все это началось",
                subtitleText = "Я сразу понял, что будет плохо"
            ),
            QuoteDataModel(
                id = 62,
                titleText = "Я не высказать не могу",
                subtitleText = "Я должен высказаться"
            ),
            QuoteDataModel(
                id = 63,
                titleText = "Мэээ что ты сейчас сказал. Тебе хорошо, а вот нам будет плохо",
                subtitleText = "Окей, ребята, окей я молчу, я молчу"
            ),
            QuoteDataModel(
                id = 64,
                titleText = "Они, кстати, все сами в шоке, во-первых",
                subtitleText = "Все в шоке"
            ),
            QuoteDataModel(
                id = 65,
                titleText = "Вот теперь",
                subtitleText = "Мне никто ничего не может предъявить"
            ),
            QuoteDataModel(
                id = 66,
                titleText = "Я сделал это заявление",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 67,
                titleText = "Ну я ссыкло?",
                subtitleText = "Или я не ссыкло?"
            ),
            QuoteDataModel(
                id = 68,
                titleText = "Ты сумашедший. Он говорит",
                subtitleText = "Ты реально сумашедший"
            ),
            QuoteDataModel(
                id = 69,
                titleText = "Я говорю. Миш, мне похую",
                subtitleText = "Я не могу молчать"
            ),
            QuoteDataModel(
                id = 70,
                titleText = "Ну вот какая разница",
                subtitleText = "Ну какая разница"
            ),
            QuoteDataModel(
                id = 71,
                titleText = "Я не хочу с этим говном жить просто",
                subtitleText = "Я хочу забыть и все, понимаешь"
            ),
            QuoteDataModel(
                id = 72,
                titleText = "Копейки. Совершенные копейки. Я сказал окей, переводите",
                subtitleText = "И они мне на следующий день оплатили. И все. Это вся была сделка"
            ),
            QuoteDataModel(
                id = 73,
                titleText = "Хотя я, кстати, был непьяный. Я был пьяный, кстати. Я выпил вина тогда",
                subtitleText = "Я этот пост написал и сразу напился. Я был бухой, когда отвечал"
            ),
            QuoteDataModel(
                id = 74,
                titleText = "Да похуй мне",
                subtitleText = "Я не могу это видеть"
            ),
            QuoteDataModel(
                id = 75,
                titleText = "Мне на него до сих пор, кстати, как-то не похер",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 76,
                titleText = "И мое сердце будет за него болеть еще долго, долго, долго",
                subtitleText = ""
            ),
            QuoteDataModel(
                id = 77,
                titleText = "Вот за ним как-то так пытаться присматривать.",
                subtitleText = " Если бог даст и я буду жив. Все-таки мое детище"
            ),
            QuoteDataModel(
                id = 78,
                titleText = "Да, слушай, я вот реально не парюсь про деньги",
                subtitleText = "Я понимаю, что это так звучит бахвально. Ну, да похеру"
            ),
            QuoteDataModel(
                id = 79,
                titleText = "Надо было яйца на стол",
                subtitleText = "Дожимать"
            ),
            QuoteDataModel(
                id = 80,
                titleText = "Я с ним вел переговоры вот так",
                subtitleText = ""
            )
        )
}