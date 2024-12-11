fun main(args: Array<String>) {
	val a = args
	val int: Int = a[0].toInt()
	val double: Double = a[1].toDouble()
	val float: Float = a[2].toFloat()
	val char: Char = int.toChar()
	//val char: Char = args[3].contentToChar()
	val byte: Byte = a[3].toByte()
	val string: String = a[4]
	val short: Short = a[5].toShort()
	
	println(int)
	println(double)
	println(float)
	println(char)
	println(byte)
	println(string)
	println(short)

	
}