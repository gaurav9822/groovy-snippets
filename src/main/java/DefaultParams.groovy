class DefaultParams {
    static void main(String[] args) {
        println(sum(1))
    }

    static int sum(int a, int b = 2) {
        return a + b
    }
}
