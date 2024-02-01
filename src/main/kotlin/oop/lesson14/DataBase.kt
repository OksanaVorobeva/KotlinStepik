package oop.lesson14

object DataBase  {
    val name = "main.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(string: String) {
        data.add(string)
    }

    /*companion object {
        var db: DataBase? = null
        fun getInstance(): DataBase {
            db?.let {
                return it
            }
            val instance = DataBase()
            db = instance
            return instance
        }
    }*/
}