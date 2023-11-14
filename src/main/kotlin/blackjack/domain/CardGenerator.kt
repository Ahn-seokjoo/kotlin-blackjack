package blackjack.domain

import blackjack.entity.Card
import blackjack.entity.CardNumber
import blackjack.entity.CardShape
import blackjack.entity.Cards
import blackjack.entity.toCards

object CardGenerator {
    /**
     * 이 함수로부터 내가 테스트 하고싶은 것은 무엇인가?
     * 1. 파라미터 개수만큼 잘 생성이 되는지 (o)
     * 2. 랜덤으로 생성된 카드안의 값이 잘 생성 됐는지 (잘 생성된 카드는 ? 각 Enum Class안의 값중 한개인지) (o)
     */
    fun generateCard(count: Int): Cards = (1..count).map {
        val cardNumber = CardNumber.values().toList().shuffled().first()
        val cardShape = CardShape.values().toList().shuffled().first()
        Card(number = cardNumber, shape = cardShape)
    }.toCards()
}
