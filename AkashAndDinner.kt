import java.util.*
fun main() {
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    repeat(t) {
        val n = scan.nextInt()
        val k = scan.nextInt()
        val set = mutableSetOf<Int>()
        val a = IntArray(n)
        val b = IntArray(n)
        for (i in 0 until n) {
            a[i] = scan.nextInt()
            set.add(a[i])
        }
        for (i in 0 until n) {
            b[i] = scan.nextInt()
        }
        if (set.size < k) {
            println(-1)
        } else {
            val map = mutableMapOf<Int, Int>()
            for (i in 0 until n) {
                map[a[i]] = map.getOrDefault(a[i], b[i]).coerceAtMost(b[i])
            }
            val c = map.values.sorted()
            var result : Long = 0L
            for(i in 0..k-1)
                result+=c[i]
            println(result)
        }
    }
}

