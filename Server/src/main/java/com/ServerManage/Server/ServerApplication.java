package com.ServerManage.Server;

import com.ServerManage.Server.Enumeration.Status;
import com.ServerManage.Server.Models.Server;
import com.ServerManage.Server.Repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubunto Linux", "16 GB", "Personal PC",
					"http://localhost:8080/server/iage/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.90", "Win 10", "16 GB", "Asus PC",
					"http://localhost:8080/server/iage/server1.png", Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "192.168.1.80", "New Linux", "16 GB", "HP PC",
					"http://localhost:8080/server/iage/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.60", "Test Linux", "16 GB", "Dell PC",
					"http://localhost:8080/server/iage/server1.png", Status.SERVER_UP));
		};
	}

}
