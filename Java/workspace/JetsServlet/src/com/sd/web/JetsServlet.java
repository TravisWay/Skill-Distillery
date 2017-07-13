package com.sd.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

import com.sd.data.Jet;
import com.sd.data.JetsDao;
import com.sd.data.StaticJetsDao;

@SuppressWarnings("serial")
public class JetsServlet extends HttpServlet {
	private JetsDao jetsDao;

	public JetsServlet() {
		jetsDao = new StaticJetsDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Jet> tester =new ArrayList<>();

		String stringidnum = ((String) req.getParameter("id"));
		if (stringidnum != null) {
			
			int idnum;
			try { 
		        idnum = Integer.parseInt(stringidnum); 
		        if (idnum > 3 || idnum < 1) {
		        	req.getRequestDispatcher("/error.jsp").forward(req, resp);
		        	
		        } else {
		        	System.out.println(stringidnum);
		        	tester.add(jetsDao.getJetById(idnum));
		        	req.setAttribute("jets", tester);
		        	req.getRequestDispatcher("/results.jsp").forward(req, resp);
		        }
		    } catch(NumberFormatException e) { 
		    	req.getRequestDispatcher("/error.jsp").forward(req, resp);
		  
		    }
			System.out.println(stringidnum);
		} else {
			System.out.println(stringidnum);
			req.setAttribute("jets", jetsDao.getJets());
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getProtocol()=="1.1"){resp.setStatus(405);}
		else{resp.setStatus(400);}
	}

}
