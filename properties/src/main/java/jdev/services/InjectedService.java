package jdev.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by jdev on 26.03.2017.
 */
@Service
public class InjectedService {

    @Value("${int.prop}")
    Integer intProp;

    @Value("${bool.prop}")
    Boolean boolProp;
    private int count;

    @PostConstruct
    public void init() {
        System.out.println("intProp = " + intProp);
        System.out.println("boolProp = " + boolProp);
    }

    @Scheduled(cron = "${cron.prop}")
    private void tick() {
        System.out.println("InjectedService.tick " + count++);
    }

}
