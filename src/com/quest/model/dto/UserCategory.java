package com.quest

import org.apache.commons.lang.builder.HashCodeBuilder

class UserCategory  implements Serializable{

    static constraints = {
    }
	
    User user
    Category category
	
	
    boolean equals(other) {
        if (!(other instanceof UserCategory)) {
            return false
        }

        other.user?.id == user?.id &&
        other.category?.id == category?.id
    }

    int hashCode() {
        def builder = new HashCodeBuilder()
        if (user) builder.append(user.id)
        if (category) builder.append(category.id)
        builder.toHashCode()
    }

    static UserCategory get(long userId, long categoryId) {
        find 'from UserCategory where user.id=:userId and category.id=:categoryId',
        [userId: userId, categoryId: categoryId]
    }

    static UserCategory create(User user, Category category, boolean flush = false) {
        new UserCategory(user: user, category: category).save(flush: flush, insert: true)
    }

    static boolean remove(User user, Category category, boolean flush = false) {
        UserCategory instance = UserCategory.findByUserAndCategory(user, category)
        if (!instance) {
            return false
        }

        instance.delete(flush: flush)
        true
    }

    static void removeAll(User user) {
        executeUpdate 'DELETE FROM UserCategory WHERE user=:user', [user: user]
    }

    static void removeAll(Category category) {
        executeUpdate 'DELETE FROM UserCategory WHERE category=:category', [category: category]
    }

    static mapping = {
        id composite: ['category', 'user']
        version false
    }
}