package com.quest

class RewardType {

    static constraints = {
    }
    static hasMany = [rewards: Reward ]
    String name
}
