package com.dist.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dist.dao.AppointmentDao;
import com.dist.dto.Appointment;
import com.dist.dto.Complaint;

@Controller
public class AppointmentController
{
    @Autowired
    private AppointmentDao appointmentDao;

    @RequestMapping(value = "/appointment",method=RequestMethod.POST)
    public ModelAndView addAppointment(@ModelAttribute("appointment") Appointment appointment)
    {
        try
        {
            if(appointmentDao.selectById(appointment.getAppointmentId())!=null);
            		//selectById(complaint.getComplaintId())!=null);
            		//(complaint.getcomplaintId()) != null);
            appointmentDao.updateappointment(appointment);
           
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            appointmentDao.makeappointment(appointment);
        }
        return new ModelAndView("redirect:/appointment");
    }
    
    @RequestMapping(value = "/edit/{appointmentId}")
    public ModelAndView updateAppointment(@ModelAttribute("appointment") Appointment appointment,@PathVariable("appointmentId") int appointmentId)
    {
        ModelAndView model = new ModelAndView("appointments");
        
        appointment = appointmentDao.selectById(appointmentId);
   
        List appointmentList = appointmentDao.selectAll();
        		
        
        model.addObject("appointment",appointment);        
        model.addObject("appointmentList",appointmentList);
        
        return model;
    }
    
    @RequestMapping(value = "/delete/{appointmentId}")
    public ModelAndView deleteAppointment(@ModelAttribute("appointment") Appointment appointment,@PathVariable("appointmentId") int appointmentId)
    {
        appointmentDao.deleteappointment(appointmentId);
        
        
        return new ModelAndView("redirect:/appointments");
    }

    @RequestMapping(value = "/appointments")
    public ModelAndView listAppointments(@ModelAttribute("appointment") Appointment appointment)
    {
        ModelAndView model = new ModelAndView("appointments");

        List appointmentList = appointmentDao.selectAll();
        System.out.println(appointmentList);
        model.addObject("appointmentList", appointmentList);
        
        return model;
    }
}
