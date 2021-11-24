# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


# STEP 1
### 기능 요구사항
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
  - 예시 : "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2,:3" => 6
- [x] 앞에서 기본 구분자(쉼표,콜론)외에 커스텀 구분자를 지정할 수 있다.
    - 커스텀 구분자는 문자열 앞 부분의 "//"와 "\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
    - 예시 : "//;\n1;2;3"과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환된다.
- [x] 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 프로그래밍 요구사항
- [x] indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
    - if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 2단계가 된다.
- [x] 메소드의 크기가 최대 10라인을 넘지 않도록 한다.
    - 메소드가 한 가지 일만 하도록 최대한 작게 만들어라.
- [x] else를 사용하지마라.


# STEP 2
### 기능 요구사항
- [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- [x] 로또 1장의 가격은 1000원이다.


### 기능 정리
- [x] 구입금액 입력 받기
  - [x] 숫자인지 확인
- [x] n개 만큼의 로또 List 생성
- [x] 로또 목록 출력
- [x] 당첨 목록 입력 받기
- [x] 당첨 통계 출력
  - [x] 3~6개의 목록 출력
  - [x] 총 수익률 출력