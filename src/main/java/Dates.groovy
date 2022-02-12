import java.text.SimpleDateFormat

class Dates {
    static void main(String[] args) {
        Date date = new Date()
        println date
        println date.getTime()
        Date dateSinceEpoch = new Date(400)
        println dateSinceEpoch

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy")
        def oldDate = dateFormat.parse("05/12/2015")
        def latestdate = new Date()
        println oldDate.before(latestdate)
        println latestdate.after(oldDate)

    }
}
