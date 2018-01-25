package picocli.example

import picocli.CommandLine.*
import picocli.CommandLine

@Command(name = "MyApp", version = arrayOf("picocli demo for Kotlin v1.0 and Kotlin v1.1"),
        description = arrayOf("@|bold Kotlin|@ @|underline picocli|@ example"))
class MyApp : Runnable {

    @Option(names = arrayOf("-c", "--count"), paramLabel = "COUNT",
            description = arrayOf("the count"))
    private var count: Int = 0

    @Option(names = arrayOf("-h", "--help"), usageHelp = true,
            description = arrayOf("print this help and exit"))
    private var helpRequested: Boolean = false

    @Option(names = arrayOf("-V", "--version"), versionHelp = true,
            description = arrayOf("print version info and exit"))
    private var versionRequested: Boolean = false

    override fun run() {
        for (i in 0 until count) {
            println("hello world $i...")
        }
    }
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            CommandLine.run(MyApp(), System.err, *args)
        }
    }
}