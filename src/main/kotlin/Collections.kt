fun main (args: Array<String>){

    var mShoppinglist = mutableListOf("Tea", "Eggs", "Milk")
    println ("mutable shopping list original $mShoppinglist")
    val extra = listOf("Cookies", "Sugar" , "Eggs")
    mShoppinglist.addAll(extra)
    println ("mutable shopping list extra $mShoppinglist")
    if (mShoppinglist.contains("Tea")){
        mShoppinglist.set(mShoppinglist.indexOf("Tea"), "Coffee")
    }
    mShoppinglist.sort()
    println ("sorted mutable shopping list $mShoppinglist")
    mShoppinglist.reverse()
    println ("sorted shopping list reversed $mShoppinglist")

    val mShoppingSet = mShoppinglist.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("Erweitertes Set: $mShoppingSet")
    mShoppinglist = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppinglist")

    val petLiam = listOf("Cat", "Dog", "Fish","Fish")
    val petSophia = listOf("Cat", "Owl")
    val petNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petEmily = listOf("Hedgehog")

    var petsTotal: MutableList<String> = mutableListOf()

    petsTotal.addAll(petLiam)
    petsTotal.addAll(petEmily)
    petsTotal.addAll(petNoah)
    petsTotal.addAll(petSophia)
println(petsTotal.size)
println(petsTotal)

    val petsTotalSet = petsTotal.toMutableSet()
    println(petsTotalSet)
    println(petsTotalSet.size)
    val alphabetisch = petsTotalSet.toMutableList()
    alphabetisch.sort()
    println(alphabetisch)




    /*
    val friendSet = setOf<String?>("Jim", "Sue","Nick")
    val isFredThere = friendSet.contains("Fred")
    for (i in friendSet) println(i)
    println(isFredThere)

        var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3,"Six")
    println(a)
    if (a.contains("Zero")){ a.add("Eight")}
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten)")
    println(a)

*/
}