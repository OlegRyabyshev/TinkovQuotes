package com.example.tinkovquotes.data.provider

import com.example.tinkovquotes.model.data.quote.QuoteDataModel
import com.example.tinkovquotes.model.data.quote.QuoteDataModel.TopicType

class QuotesProviderImpl : QuotesProvider {

    override fun getQuotesList(): List<QuoteDataModel> =
        listOf(
            QuoteDataModel(
                id = 1,
                titleText = "Вот подзаебала эта тема",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 2,
                titleText = "Попробую, попытаюсь объяснить. Для кого-то это будет оправданием",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 3,
                titleText = "Это было непросто смело. Это было пиздец как смело",
                topicType = TopicType.BASED
            ),
            QuoteDataModel(
                id = 4,
                titleText = "Мы любим такие формы, форматы",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 5,
                titleText = "Сказать такое я, считаю, это супер круто",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 6,
                titleText = "Это был сарказм, большой",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 7,
                titleText = "Кстати, я ним хорошо отношусь ко всем. Они ребята реально хорошие",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 8,
                titleText = "Объяснил, надеюсь",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 9,
                titleText = "Ну окей... Мы не знаем",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 10,
                titleText = "Это не так устроено. Они там в космосе где-то",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 11,
                titleText = "Я его чморил",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 12,
                titleText = "Я делал то, что я мог делать",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 13,
                titleText = "Вообще ничего никогда не сказал ваш герой. Вообще, блядь, никогда он и ничего не сказал. И сейчас молчит",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 14,
                titleText = "Ваш герой. Чеж же он молчит-то? Что он сказал?",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 15,
                titleText = "Можно мечтать. И я с вами вместе мечтаю. Ну давайте мечтать. А можно быть реалистом. А реалистично это никогда не будет",
                topicType = TopicType.DREAMING
            ),
            QuoteDataModel(
                id = 16,
                titleText = "Ну это пиздец какой-то. Ну сколько можно?",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 17,
                titleText = "Жопу лижете, заебись",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 18,
                titleText = "Я ошибся. Я могу один раз ошибиться? Мне можно это простить? Ошибся, допустим. Давайте прошу у всех прощения за эту фразу",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 19,
                titleText = "Но я остаюсь с тем, что это был великий сарказм. И что в принципе в моей фразе есть много логики, если о ней хорошо подумать",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 20,
                titleText = "Ну ты понимаешь, я никого не хочу осуждать. Кто-то это намеренно избегает, кто-то неинтересно. Вот мне неинтересно",
                topicType = TopicType.NOT_CARING
            ),
            QuoteDataModel(
                id = 21,
                titleText = "Они все очень, на мой взгляд, тупые. Они все, так сказать, примитивные",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 22,
                titleText = "У них какое-то чинопочитание там, какое-то величие. Какая-то хуйня бля, мне вообще они неинтересны, я не хочу с ними разговаривать",
                topicType = TopicType.NOT_CARING
            ),
            QuoteDataModel(
                id = 23,
                titleText = "Я это не понимаю, мне это это неинтересно. Вот мне лично это неинтересно. За других сказать не могу",
                topicType = TopicType.NOT_CARING
            ),
            QuoteDataModel(
                id = 24,
                titleText = "Круто, это же круто. Да это же круто",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 25,
                titleText = "Какие у нас классные ребята работают",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 26,
                titleText = "Мне это неинтересно",
                topicType = TopicType.NOT_CARING
            ),
            QuoteDataModel(
                id = 27,
                titleText = "Я уважаю что они делают, но как бы. Я не понимаю, я во первых процессы эти многие не понимаю",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 28,
                titleText = "Да, конечно, мы все виноваты в этом пиздеце. Все мы виноваты в этом пиздеце. Вся Россия помазалась этим говном",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 29,
                titleText = "Я реально прихерел",
                topicType = TopicType.SAD
            ),
            QuoteDataModel(
                id = 30,
                titleText = "Это, конечно, печально",
                topicType = TopicType.SAD
            ),
            QuoteDataModel(
                id = 31,
                titleText = "То есть как вот это. Это вот так вот как-то щелкает",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 32,
                titleText = "Ты, блять, можешь себе представить?",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 33,
                titleText = "Ну, вообщем-то, да. Как это происходит я не понимаю. У кого-то это щелкает, а у кого-то это не щелкает",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 34,
                titleText = "Я проснулся утром, если честно, я день первый ничего не понимал",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 35,
                titleText = "Я как бы не понимал весь масштаб этого пиздеца. Я думал это просто че-то какая-то там. Ну знаешь. Я не очень понял контекст. Еще был занят в этот день",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 36,
                titleText = "Я не мог в это поверить. Это было невозможно. Я спорил со всеми",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 37,
                titleText = "Ну, естественно, я в это поверить не мог",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 38,
                titleText = "Ну, у меня взяло где-то 48 часов как бы осознать, вообще, что происходит, Как бы потому что я не мог в это поверить. Я, кстати, до сих пор не очень в это верю, если честно",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 39,
                titleText = "Дай им бог здоровья. Спасибо за то, что они меня спасали. Если бы не они, я бы, конечно, не выжил",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 40,
                titleText = "Ну что это за пиздец такой. Ну как это может быть в 21 веке?",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 41,
                titleText = "Мне не надо никаких миллиардов. Я ничего не хочу. Я не хочу это видеть. Я хочу про это сказать всем. Понимаешь, это моя позиция",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 42,
                titleText = "Я посчитал, что правильным умереть с хорошей кармой. Потому что, ну, мы все умрем",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 43,
                titleText = "Хочется умереть достойно. И чтобы тебя семья вспоминала и дети тобой гордились",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 44,
                titleText = "Наш папа ссыкун. Язык в жопу засунул",
                topicType = TopicType.SAD
            ),
            QuoteDataModel(
                id = 45,
                titleText = "Да мне было страшно, но я это сделал",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 46,
                titleText = "Они нормальные люди, они разберутся. Пройдет один год, два, три",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 47,
                titleText = "Я никогда не коллаборировал, не состоял, что называется. Не участвовал. Ничего",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 48,
                titleText = "Они меня ввели туда случайно - они сделали ошибку",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 49,
                titleText = "Ну да, конечно, мы знаем, типа бля, ну, конееечно, ну мы же знаем. Ну они знают. Вот они знают. Я не знаю",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 50,
                titleText = "Это так не работает. У них там какие-то другие... Они по фактам",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 51,
                titleText = "Это полный бред",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 52,
                titleText = "Ну... вы можете так считать, молодцы. Посмотрим",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 53,
                titleText = "Но парадоксальным образом это то, что спасает мою жизнь, понимаешь. Это инь и янь",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 54,
                titleText = "То есть, понимаешь, ты должен страдать и тогда вроде как... Ну понимаешь, да?",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 55,
                titleText = "Окей, окей, окей я заткнулся. Я хотя бы что-то предложил",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 56,
                titleText = "Ну, конечно. Я же человек",
                topicType = TopicType.THINKING
            ),
            QuoteDataModel(
                id = 57,
                titleText = "Не кайфно",
                topicType = TopicType.SAD
            ),
            QuoteDataModel(
                id = 58,
                titleText = "Ну как будто не совсем понимаю как это работает",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 59,
                titleText = "Но если принять это за правду, то это страшная штука",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 60,
                titleText = "Как бы не хотелось бы, прямо скажем",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 61,
                titleText = "Когда все это началось, я сразу понял, что будет плохо",
                topicType = TopicType.SAD
            ),
            QuoteDataModel(
                id = 62,
                titleText = "Я не высказать не могу - я должен высказаться",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 63,
                titleText = "Мэээ что ты сейчас сказал. Тебе хорошо, а вот нам будет плохо. Окей, ребята, окей я молчу, я молчу",
                topicType = TopicType.SARCASTIC
            ),
            QuoteDataModel(
                id = 64,
                titleText = "Они, кстати, все сами в шоке, во-первых. Все в шоке",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 65,
                titleText = "Вот теперь мне никто ничего не может предъявить",
                topicType = TopicType.HAPPY
            ),
            QuoteDataModel(
                id = 66,
                titleText = "Я сделал это заявление",
                topicType = TopicType.BASED
            ),
            QuoteDataModel(
                id = 67,
                titleText = "Ну я ссыкло или я не ссыкло?",
                topicType = TopicType.QUESTIONING
            ),
            QuoteDataModel(
                id = 68,
                titleText = "Ты сумашедший. Он говорит - ты реально сумашедший",
                topicType = TopicType.BASED
            ),
            QuoteDataModel(
                id = 69,
                titleText = "Я говорю. Миш, мне похую. Я не могу молчать",
                topicType = TopicType.BASED
            ),
            QuoteDataModel(
                id = 70,
                titleText = "Ну вот какая разница. Ну какая разница",
                topicType = TopicType.NOT_SURE
            ),
            QuoteDataModel(
                id = 71,
                titleText = "Я не хочу с этим говном жить просто. Я хочу забыть и все, понимаешь",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 72,
                titleText = "Копейки. Совершенные копейки. Я сказал окей, переводите. И они мне на следующий день оплатили. И все. Это вся была сделка",
                topicType = TopicType.RICH
            ),
            QuoteDataModel(
                id = 73,
                titleText = "Хотя я, кстати, был непьяный. Я был пьяный, кстати. Я выпил вина тогда. Я этот пост написал и сразу напился. Я был бухой, когда отвечал",
                topicType = TopicType.RICH
            ),
            QuoteDataModel(
                id = 74,
                titleText = "Да похуй мне. Я не могу это видеть",
                topicType = TopicType.ANNOYED
            ),
            QuoteDataModel(
                id = 75,
                titleText = "Мне на него до сих пор, кстати, как-то не похер",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 76,
                titleText = "И мое сердце будет за него болеть еще долго, долго, долго",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 77,
                titleText = "Вот за ним как-то так пытаться присматривать. Если бог даст и я буду жив. Все-таки мое детище",
                topicType = TopicType.LIKING
            ),
            QuoteDataModel(
                id = 78,
                titleText = "Да, слушай, я вот реально не парюсь про деньги. Я понимаю, что это так звучит бахвально. Ну, да похеру",
                topicType = TopicType.RICH
            ),
            QuoteDataModel(
                id = 79,
                titleText = "Надо было яйца на стол. Дожимать",
                topicType = TopicType.BASED
            ),
            QuoteDataModel(
                id = 80,
                titleText = "Я с ним вел переговоры вот так",
                topicType = TopicType.BASED
            )
        )
}