package racingcar.view

tailrec fun inputCarNames(): List<String> {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    return readLine()?.replace(" ", "")?.split(",") ?: inputCarNames()
}

tailrec fun inputTryNumber(): Int {
    println("시도할 횟수는 몇 회인가요?")
    return readLine()?.toIntOrNull() ?: inputTryNumber()
}

