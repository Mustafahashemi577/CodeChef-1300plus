import java.util.Scanner 
fun main(){
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    scan.nextLine()
    repeat(t){
        val text = scan.nextLine().replace(" ","")
        val upperCase = text.any{it.isUpperCase()}
        if(text.length<4)
            println("Error")
        else{
           if(upperCase)
                println("Error")
           else{
                if(text[0]=='<'&&text[1]=='/'&&text[text.length-1]=='>'){
                    val sub = text.substring(2,text.length-1)
                    val other = sub.any{!it.isLetterOrDigit()}
                    if(other)
                        println("Error")
                    else
                        println("Success")
                }
                else
                    println("Error")
            }
        }
    }
}
