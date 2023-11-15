# kotlin-blackjack

## 기능 요구사항

### 블랙잭 게임을 변형한 프로그램을 구현한다.

블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.

## 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 모든 엔티티를 작게 유지한다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.

## 기능 목록
- [x] InputView 에서 입력을 처리한다.
- [x] 이름을 입력하면, 입력된 이름의 수만큼 카드를 분배한다. (예로 3명 입력, 각각 한장씩 카드를 총 3장 분배)
- [x] OutputView 에서 출력을 처리한다.
- [x] 인원수 만큼 카드를 랜덤으로 생성해준다.
- [x] 카드에 이상한 숫자 or 문자가 들어가면 에러가 발생한다.
- [x] 파라미터로 전달받은 수 만큼 카드의 개수를 생성한다.
- [x] y를 입력하여 카드를 한장 더 받는다.
- [x] n을 입력하여 카드를 한장 더 받지 않는다.
- [x] 21을 넘게되면 더이상 y를 입력할 수 없다.
- [x] 블랙잭 기능을 수행한다.
- [x] A는 1 또는 11로 선택할 수 있다.
- [x] A가 여러개 나오는 경우 테스트도 하기(이건 필요가 없다 왜? A 두장을 11로 쓰면 이미 21을 넘기 때문에 이런 케이스는 없다)

## 질문 목록
- InputView 안의 private 함수인 checkParticipants 함수를 테스트 하느라 private를 제거하는데, 더 좋은 방법이 있을까?
- 정확히 함수를 잘 테스트하고 있는지 모르겠다 (generateCard 라는 함수를 잘 테스트 하고 있는지..)
- cards를 var로 유지하는게 아쉽다 더 좋은 방법이 있을지
