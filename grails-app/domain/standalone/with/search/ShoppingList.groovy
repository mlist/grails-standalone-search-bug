package standalone.with.search

class ShoppingList {

	String name
	String description

	static hasMany = [items: ShoppingItem]

	static searchable = true

    static constraints = {
    }
}
