class CustomList {
    static void main(String[] args) {
        ListType<String> customList = new ListType<>()
        customList.set("test")
        println(customList.get())
    }
}

class ListType<T> {
    private T localt

    T get() {
        return this.localt
    }

    void set(T plocal) {
        this.localt = plocal
    }
}
