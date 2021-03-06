# java-ladder
사다리 게임 저장소

## 기능 요구 사항

- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - **|-----|-----|** 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
- 사다리 실행 결과를 출력해야 한다.
- 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.

## 프로그래밍 요구사항

- 메소드의 크기가 최대 **10라인**을 넘지 않도록 구현한다.
    - method가 한 가지 일만 하도록 최대한 작게 만들어라.
- indent(인덴트, 들여쓰기) depth를 2단계에서 **1단계**로 줄여라.
    - depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
- 배열 대신 ArrayList와 Generic을 활용해 구현한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- else를 사용하지 마라.
- setter 메소드를 사용하지 않고 구현한다. 단, DTO(Data Transfer Object는 제외)
- 모든 로직에 대한 **단위 테스트**를 반드시 구현한다. (입력과 출력은 제외)

## 구현해야 할 기능
1. 참여할 사람 이름 입력받기.
    - 쉼표로 구분하여 입력받기
    - 한 사람의 이름 최대 5글자
2. 실행 결과 입력받기.
    - 쉼표로 구분하여 입력받기
    - 참여 인원과 같은 수의 결과를 입력받아야함
    - 최소 한글자 이상
3. 최대 사다리 높이 입력받기.
    - 1이상의 정수로 입력받기
4. 사다리 만들기
    - 입력받은 사다리 높이만큼 수직선 생성
    - 참여자의 수만큼 위의 수직선 생성
    - 수직선 사이의 수평선을 랜덤으로 생성
5. 사다리 결과 출력하기
    - 맨 윗줄에 이름 출력
    - 만들어진 사다리 출력    
    - 맨 아랫줄에 결과 출력
6. 결과가 궁금한 참여자 입력받고 결과 보여주기
    - 참여자 목록에 있는 이름인지 확인
    - "all" 입력시 전체 결과를 출력해주고 종료

## 실행 결과

- 위 요구사항에 따라 4명의 사람을 위한 5개 높이 사다리를 만들 경우, 프로그램을 실행한 결과는 다음과 같다.
![사다리](https://user-images.githubusercontent.com/49441876/82286974-0a1fd500-99da-11ea-9a8a-d24702e4ae5b.png)
