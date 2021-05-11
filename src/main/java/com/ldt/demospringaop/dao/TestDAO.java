package com.ldt.demospringaop.dao;

import com.ldt.demospringaop.aspect.TrackTime;
import com.ldt.demospringaop.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

    private final Logger logger    = LoggerFactory.getLogger(TestDAO.class);

    public String callDaoSuccess(){
        logger.info("callDaoSuccess is called");
        return "dao1";
    }
    public String callDaoThrowException(){
        logger.info("DAO is called");
        throw new RuntimeException("");
    }

    @TrackTime
    public String callMethodTrackTime(){
        logger.info("callDaoSuccess is called");
        return "dao1";
    }
}
