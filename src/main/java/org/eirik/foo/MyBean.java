package org.eirik.foo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Slf4j
@RequiredArgsConstructor
public class MyBean {

    private final DataSource dataSource;


    @EventListener(ApplicationReadyEvent.class)
    public void dbTest() {
        JdbcClient create =  JdbcClient.create(dataSource);
        Integer number = create.sql("select 42").query(Integer.class).single();
        log.info("the number {}", number);
    }
}
