package arrays_easy

fun numUniqueEmails(emails: Array<String>): Int {
    val setOfEmail : MutableSet<String> = mutableSetOf<String>()
    emails.forEach {
       setOfEmail.add(convertMailIntoProperFormat(it))
    }
    return setOfEmail.size
}

fun convertMailIntoProperFormat(mail : String) : String{
    val atIndex = mail.indexOf('@')
    if (atIndex == -1 || atIndex == 0 || atIndex == mail.length - 1) {
        throw IllegalArgumentException("Invalid email address")
    }

    val localName = mail.substring(0, atIndex)
    val domainName = mail.substring(atIndex + 1)


    val formattedLocalName = localName.replace(".","").run {
        if(this.contains('+')){
            this.removeRange(this.indexOf('+') until this.length)
        }else this
    }
    return formattedLocalName + '@' + domainName

}