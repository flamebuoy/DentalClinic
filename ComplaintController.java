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

import com.dist.dao.ComplaintDao;
import com.dist.dto.Complaint;

@Controller
public class ComplaintController
{
    @Autowired
    private ComplaintDao complaintDao;

    @RequestMapping(value = "/complaint",method=RequestMethod.POST)
    public ModelAndView addComplaint(@ModelAttribute("complaint") Complaint complaint)
    {
        try
        {
            if(complaintDao.selectById(complaint.getComplaintId())!=null);
            		//(complaint.getcomplaintId()) != null);
            complaintDao.updatecomplaint(complaint);
        }
        catch(EmptyResultDataAccessException e)
        {
            System.out.println("inside catch");
            complaintDao.addcomplaint(complaint);
        }
        return new ModelAndView("redirect:/complaint");
    }
    
    @RequestMapping(value = "/edit/{complaintId}")
    public ModelAndView updateComplaint(@ModelAttribute("complaint") Complaint complaint,@PathVariable("complaintId") int complaintId)
    {
        ModelAndView model = new ModelAndView("complaints");
        
        complaint = complaintDao.selectById(complaintId);
        List complaintList = complaintDao.selectAll();
        		
        
        model.addObject("complaint",complaint);        
        model.addObject("complaintList",complaintList);
        
        return model;
    }
    
    @RequestMapping(value = "/delete/{complaintIdd}")
    public ModelAndView deleteComplaint(@ModelAttribute("complaint") Complaint complaint,@PathVariable("complaintId") int complaintId)
    {
        complaintDao.deletecomplaint(complaintId);
        
        return new ModelAndView("redirect:/complaints");
    }

    @RequestMapping(value = "/complaints")
    public ModelAndView listComplaints(@ModelAttribute("complaint") Complaint complaint)
    {
        ModelAndView model = new ModelAndView("complaints");

        List complaintList = complaintDao.selectAll();
        System.out.println(complaintList);
        model.addObject("complaintList", complaintList);
        
        return model;
    }
}