package com.quest

class UserScore implements Serializable{

    static constraints = {
    }
    static mapping = {
        id composite: ['quest', 'user']
        version false
    }
    User user
    Quest quest
    Integer score
    
    static hasMany = [users: User]
}
