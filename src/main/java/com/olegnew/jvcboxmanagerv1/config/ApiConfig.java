package com.olegnew.jvcboxmanagerv1.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API for managing devices \"Cbox\"",
                description = "oleg_new", version = "1.0.0",
                contact = @Contact(
                        name = "Poteleschenko Oleg",
                        url = "http://www.phillip-kruger.com",
                        email = "olegpoteleschenko@gmail.com"
                )
        ),
        servers = {
                @Server(url = "http://localhost:8080/v1/",description = "localhost")
        }
)
public class ApiConfig {
}
