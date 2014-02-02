package com.quest

class UserGroup {

    String name
    static constraints = {
    }
    
    static hasMany = [users: User]
    
    String toString(){
        return this.name;
    }
}
