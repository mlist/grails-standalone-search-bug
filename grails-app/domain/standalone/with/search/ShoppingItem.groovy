package standalone.with.search

class ShoppingItem {

	String name
	String description
	Boolean urgent

	static searchable = true

	static belongsTo = ShoppingList

    static constraints = {
    }
}
