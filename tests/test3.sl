func sayHello() -> (void) {
    print("Hello!")
    print("Just want to show that i can do like this:")
}

main {
    print("Test #4")
    sayHello()
    let el1: Element = "F"
    let el2: Element = "l"
    let el3: Element = "i"
    let el4: Element = "p"
    let set1: Set = {el1, el2}
    let set2: Set = set1 + el3
    let set3: Set = set2 + el4
    if set2.power() > set3.power() {
        print("It cant be so")
    } else {
        rightAnswer(set3)
    }
}

func rightAnswer(set: Set) {
    print(set)
}

