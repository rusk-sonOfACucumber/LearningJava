package jdev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by jdev on 26.03.2017.
 */
@Service
public class ScheduledService {



    @Scheduled (fixedDelay = 3000)
    private void tick() {
        System.out.println("ScheduledService.tick");
    }
}
