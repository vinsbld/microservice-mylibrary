package com.bibliotheque.microservicemylibrary.service;

import com.bibliotheque.microservicemylibrary.dao.ReservationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    ReservationDao reservationDao;


    @Override
    public Date add4Weeks(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setGregorianChange(date);
        gregorianCalendar.add(GregorianCalendar.MONTH, 1 );
        return gregorianCalendar.getTime();
    }
}
