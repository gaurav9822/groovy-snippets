class Lists {
    static void main(String[] args) {
        def numbers = [1, 2, 3, 4]
        def newNumbers = numbers.minus(4)
        newNumbers = newNumbers.plus(5)
        newNumbers.pop()
        newNumbers.remove(0)
        newNumbers.reverse(true)
        newNumbers.sort(true)
        println(newNumbers)
    }
}
