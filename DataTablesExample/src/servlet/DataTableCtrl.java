package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.datatables.wrapper.DataTableWrapper;
import net.datatables.wrapper.model.DataTable;
import net.datatables.wrapper.model.FnCallBack;
import model.Student;
import model.StudentAccount;


/**
 * 
 * @author xuantuan.bui
 *
 */
public class DataTableCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DataTableCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String side = request.getParameter("side");
		DataTableWrapper tableWrapper = new DataTableWrapper();
		
		if(side != null && side.equals("client")){
			DataTable<StudentAccount> table = new DataTable<>(StudentAccount.class);
			table.bServerSide = false;
			table.bJQueryUI = true;
			table.bDestroy = true;
			tableWrapper.setDataHandler(StudentAccDataHandler.class);
			
			tableWrapper.setDataTable(table);
		}
		else if(side != null && side.equals("server")){
			DataTable<Student> table = new DataTable<>(Student.class);
			table.bServerSide = true;
			table.bJQueryUI = true;
			table.bDestroy = true;
			table.sPaginationType = "full_numbers";
			table.fnServerData = new FnCallBack("fnDataTablesPipeline");
			
			tableWrapper.setDataHandler(StudentDataHandler.class);
			tableWrapper.setDataTable(table);
		}
		
		try {
			tableWrapper.wrap(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
