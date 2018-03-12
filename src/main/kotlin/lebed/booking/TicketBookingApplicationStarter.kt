package lebed.booking

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TicketBookingApplicationStarter

fun main(args: Array<String>) {
    SpringApplication.run(TicketBookingApplicationStarter::class.java, *args)
}

