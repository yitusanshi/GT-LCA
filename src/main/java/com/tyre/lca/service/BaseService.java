package com.tyre.lca.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class BaseService {
    private static Logger logger = LoggerFactory.getLogger(BaseService.class);
    public Date parseStringToDate(String time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return simpleDateFormat.parse(time);
        } catch (ParseException e) {
            logger.error("parse date error, date is {}", time);
        }
        return new Date();
    }

    public static void main(String[] args) {
        System.out.println(new BaseService().parseStringToDate("2018-10-01 00:00:00"));
    }
 }
