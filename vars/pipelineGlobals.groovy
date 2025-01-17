def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "614019632196"
        case 'qa':
            return "614019632196"
        case 'uat':
            return "614019632196"
        case 'pre-prod':
            return "614019632196"
        case 'prod':
            return "614019632196"
        default:
            return "nothing"
    } 
}