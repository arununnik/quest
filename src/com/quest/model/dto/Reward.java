package com.quest

class Reward {

    static constraints = {
    }
    String name
    String description
    static belongsTo = [RewardType]
    
    
}
