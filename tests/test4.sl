main{
    print("Test #5")
    findFirstUniqueElement()
    print("Got a ")
}

func findFirstUniqueElement() {
    let el1 = "x"
    let el2 = "y"
    let el3 = "z"
    let el4 = "w"
    let el5 = "s"
    let set1: Set = {el1, el2, el3}
    let set2: Set = {el4, el5}
    let diff: Set = set1 - set2
    forEach(Element el in diff) {
        print("FOUND!")
        print(el)
    }
}
