package picocli.example

import picocli.CommandLine.*
import picocli.CommandLine

@Command(name = "MyApp", version = ["Kotlin picocli demo v1.0"],
        description = ["@|bold Kotlin|@ @|underline picocli|@ example"])
class MyApp : Runnable {

    @Option(names = ["-c", "--count"], paramLabel = "COUNT",
            description = ["the count"])
    private var count: Int = 0

    @Option(names = ["-h", "--help"], usageHelp = true,
            description = ["print this help and exit"])
    private var helpRequested: Boolean = false

    @Option(names = ["-V", "--version"], versionHelp = true,
            description = ["print version info and exit"])
    private var versionRequested: Boolean = false

    override fun run() {
        for (i in 0 until this.count) {
            println("hello world $i...")
        }
    }
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            CommandLine.run(MyApp(), System.err, *args)
        }
    }
}
