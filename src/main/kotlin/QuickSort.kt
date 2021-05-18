fun quicksort(array: Array<Int>): Array<Int> {
    return sorter(array, 1, array.size - 1)
}
private fun sorter(array: Array<Int>, min: Int, max: Int): Array<Int> {
    if (min < max) {
        val partitionIdx: Int = partition(array, min, max)

        sorter(array, min, partitionIdx - 1)
        sorter(array, partitionIdx - 1, max)
    }

    return array
}

private fun partition(array: Array<Int>, min: Int, max: Int): Int {
    var output = array.copyOf()
    var smallIdx: Int = min - 1
    val pivotVal: Int = array[max];

    for (j in min..max) {
        if (array[j] < pivotVal) {
            smallIdx += 1
            val prevVal = array[j]
            val nextVal = array[smallIdx]
            output[smallIdx] = prevVal
            output[j] = nextVal
        }
    }
    val smaller = output[smallIdx + 1]
    output[smallIdx] = pivotVal
    output[max] = smaller
    return smallIdx + 1
}