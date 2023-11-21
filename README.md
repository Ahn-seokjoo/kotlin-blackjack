# kotlin-blackjack

## 기능 요구사항
블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
- **딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.**
- **딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리한다.**
- **게임을 완료한 후 각 플레이어별로 승패를 출력한다.**


## 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- **모든 엔티티를 작게 유지한다.**
- **3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.**
- **딜러와 플레이어에서 발생하는 중복 코드를 제거해야 한다.**
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.

## 기능 목록
- [x] InputView 에서 입력을 처리한다.
- [x] OutputView 에서 출력을 처리한다.
- [x] 잘못된 입력시에(,로 시작 또는 끝일 때, ;와 같이 다른 구분자로 구분했을 때) 에러를 발생시킨다.
- [x] 참여자와 딜러는 참여할 수 있다.
- [x] 참여자와 딜러 각각은 현재의 상태를 가지고 있다(HIT, BUST, BLACKJACK, STAND, INITIAL)
- [x] 셔플된 카드덱을 생성할 수 있다 (52장)
- [x] 참여자에게 각각 2장의 카드를 나누어 준다. 이때, 받은 카드에 따라 HIT 또는 BLACKJACK의 상태를 갖는다
- [x] 블랙잭을 수행한다.
- [x] 블랙잭을 수행하면서 한장 더 받을지 말지 물어본다. (상황이 되면)
- [x] 21 인경우 더 받을지 말지 묻지 않는다.
- [x] current state가 HIT 면 더 받을지 말지 물어본다.
- [x] 딜러에게 처음으로 카드를 2장 나눠주고, 두장의 합이 16 이하라면 1장을 반드시 받아야 하고, 17 이상이면 못받는다
- [x] 딜러의 결과까지 같이 표시해준다.

## 힌트
- 상속을 활용해 중복을 제거해본다.

## 질문 목록
Participant 클래스의 gamerCards가 초기값이 없어서 lateinit var로 사용했는데 더 좋은 방법이 있을까?
