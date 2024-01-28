

fun isValid(s : String) : Boolean {
    var count = 0
    val maap = mapOf<Char,Char>(
            ')' to '(',
            ']' to '[',
            '}' to '{'
    )
    var lastOpenedChar = '('
    s.forEachIndexed { index, c ->
        if((c == '(' || c=='[' || c =='{')){
            lastOpenedChar = c
            count++
        }
        if((c == ')' || c==']' || c =='}')){
           if( correctParenthesis(c,maap,s.substring(0,index),lastOpenedChar))
               count -= 1
        }

    }
    return count==0
}

fun correctParenthesis(c : Char,maap : Map<Char,Char>,s : String,lchar : Char ): Boolean{
    val char=  maap[c]
    return char == lchar
}