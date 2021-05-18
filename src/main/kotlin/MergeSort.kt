fun mergesort(array: Array<Int>): Array<Int> {
    if (array.size > 1) {
        val middle: Int = array.size / 2

        val leftHalf: Array<Int> = array.copyOfRange(0, middle)
        val rightHalf: Array<Int> = array.copyOfRange(middle, array.size)

        mergesort(leftHalf)
        mergesort(rightHalf)

        var i = 0
        var j = 0
        var k = 0

        while (i < leftHalf.size && j < rightHalf.size) {
            if (leftHalf[i] < rightHalf[j]) {
                array[k] = leftHalf[i]
                i += 1
            } else {
                array[k] = rightHalf[j]
                j += 1
            }

            k += 1
        }

        while (i < leftHalf.size) {
            array[k] = leftHalf[i]
            i += 1
            k += 1
        }

        while (j < rightHalf.size) {
            array[k] = rightHalf[j]
            j += 1
            k += 1
        }
    }

    return array
}