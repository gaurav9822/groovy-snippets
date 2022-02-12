class Maps {
    static void main(String[] args) {
        def student = ["name": "john", "occupation": "student"]
        println student.containsKey("name")
        println student.get("name")
        println student.keySet()
        student.put("subject", "OOP")
        println student.values()
    }
}
