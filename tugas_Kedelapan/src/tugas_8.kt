package classes

open class Merek_Laptop{
    open fun slogan(){

    }
}
class Nama_Laptop: Merek_Laptop(){
    override fun slogan(){
        println("Nama Laptop: HP Envy 360 X")
    }
}
class Sistem_Operasi: Merek_Laptop(){
    override fun slogan(){
        println("Sistem Operasi: Windows 10 Home Single Language 64 Plus")
    }
}
class Prosesor: Merek_Laptop(){
    override fun slogan(){
        println("Prosessor: AMD Ryzen™ 7 processor")
    }
}
class RAM : Merek_Laptop() {
    override fun slogan() {
        println("RAM: 8 GB")
    }
}
class Internal_Storage : Merek_Laptop(){
    override fun slogan(){
        println("Internal_Storage: 512 GB")
    }
}
fun main(args: Array<String>){
    val Sistem_Operasi = Sistem_Operasi()
    val Nama_Laptop = Nama_Laptop()
    val Prosesor = Prosesor()
    val RAM = RAM()
    val Internal_Storage = Internal_Storage()
    Nama_Laptop.slogan()
    Sistem_Operasi.slogan()
    Prosesor.slogan()
    RAM.slogan()
    Internal_Storage.slogan()
}