package core.totorials.monad

import arrow.core.continuations.nullable

class NullableSpeaker {
    fun nextTalk(): NullableTalk? = null
}

class NullableTalk {
    fun getConference(): NullableConference? = null
}

class NullableConference {
    fun getCity(): City? = null
}

/*fun nextTalkCity(speaker: NullableSpeaker?): City? {
    if (speaker == null) return null
    val talk = speaker.nextTalk() ?: return null
    val conf = talk.getConference() ?: return null
    return conf.getCity()
}*/

/*fun nextTalkCity(speaker: Speaker?): City? = speaker
    ?.nextTalk()
    ?.getConference()
    ?.getCity()*/

suspend fun nextTalkCity(maybeSpeaker: Speaker?): City? = nullable {
    val speaker = maybeSpeaker.bind()
    val talk = speaker.nextTalk().bind()
    val conf = talk.getConference().bind()
    val city = conf.getCity().bind()
    city
}
