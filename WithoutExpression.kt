fun main(args: Array<String>) {
	//val a = args[0].toInt()
	var v11 = 11.5
	var v12 = "abc"
	var v13 = when {
			v11.equals(11.5) -> println(v11)
			v12.contains("abc") -> println(v12)
			else -> println("Invalid")
		  }
	println("$v13")
	
}

