package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@EnableResourceServer
class ResourceApplication {
	
	@RequestMapping('/')
	def home() {
		[id: UUID.randomUUID().toString(), content: 'From Java Server']
	}

    static void main(String[] args) {
        SpringApplication.run ResourceApplication, args
    }

}
