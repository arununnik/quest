package com.quest

class UserReward {

    static constraints = {
    }
     static mapping = {        
        version false
    }
    
    User user
    Reward reward
    User fromUser
    String description
}
