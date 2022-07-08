package core.totorials.monad

class Speaker {
    fun nextTalk(): Talk = TODO()
}

class Talk {
    fun getConference(): Conference = TODO()
}

class Conference {
    fun getCity(): City = TODO()
}

class City

/*fun nextTalkCity(speaker: Speaker): City {
    val talk = speaker.nextTalk()
    val conf = talk.getConference()
    val city = conf.getCity()
    return city
}*/

fun nextTalkCity(speaker: Speaker): City = speaker
    .nextTalk()
    .getConference()
    .getCity()
