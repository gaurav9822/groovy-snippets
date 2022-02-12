class MetaObjectProgramming {
    static void main(String[] args) {
        Employee employee = new Employee()
        employee.Name = "Joe"
        employee.ID = 1

        println(employee.Name)
        println(employee.ID)
        employee.AddMarks()
    }
}

class Employee implements GroovyInterceptable {
    protected dynamicProps = [:]

    void setProperty(String pName, val) {
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }

    def invokeMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }
}
