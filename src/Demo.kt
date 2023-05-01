fun main(args: Array<String>) {
	var i = 0;
	while (i++ < 6) {
		if (i == 3) {
			continue
		}
		println(i)
	}
	
	//Kotlin labeled continue statement is used to skip the part of a specific loop. This is done by using continue expression with @ sign followed by label name (continue@LabelName)
	outerLoop@ for (i in 1..3) {
		innerLoop@ for (j in 1..3) {
			if (i == 2) {
				continue@outerLoop
			}
			println("i = $i and j = $j")
		}
	}
}