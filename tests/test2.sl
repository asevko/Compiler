main {
    print("Test #3")
    let el1: Element = "a"
    let el2: Element = "b"
    let el3: Element = "c"
    let el4: Element = "d"
    let el5: Element = "a"
    let el6: Element = "x"
    let el7: Element = "y"
    let set1: Set = {el1, el2, el3}
    let set2: Set = {el4, el5, el6, el7}
    let resultSet: Set = createSet(set1, set2)
    forEach(Element elem in resultSet) {
        print(elem)
    }
}

func createSet(a: Set, b: Set) -> Set {
    return a + b
}