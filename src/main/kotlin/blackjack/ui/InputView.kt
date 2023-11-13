package blackjack.ui

object InputView {
    fun inputParticipantName(): String {
        val participants = readln()
        checkParticipants(participants)
        return participants.replace(",", ", ")
    }

    fun checkParticipants(participants: String) {
        check(participants.startsWith(DELIMITER).not()) { INVALID_INPUT }
        check(participants.endsWith(DELIMITER).not()) { INVALID_INPUT }
        check(REGEX.find(participants) == null) { INVALID_INPUT }
    }

    private const val DELIMITER = ','
    private const val INVALID_INPUT = "올바른 값이 입력되지 않았습니다."
    private val REGEX = "[^(\\w+,)]".toRegex()
}
