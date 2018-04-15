main {
    print("Test #2")
    let el: Element = "f"
    let el1: Element = "x"
    let s: Set = {el, el1}
    print(s)
    forEach(Element x in s) {
        print(x)
    }
}
