package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.datatables.wrapper.AjaxRequest;
import net.datatables.wrapper.IDataHandler;

import model.Student;

/**
 * Data handler for Student class.
 * Note: the table was initialized as server side
 * the ItotalRecords method must return the size of origin list.
 * the ITotalDisplayRecords method must return size of list after filtered.
 * @author xuantuan.bui
 *
 */
public class StudentDataHandler implements IDataHandler<Student> {
	List<Student> list;
	int itotalRecords;
	int iTotalDisplay;
	
	public StudentDataHandler() {
		list = ExampleData.getAllStudents();
		itotalRecords = iTotalDisplay = list.size();
	}
	@Override
	public List<Student> getListData(AjaxRequest tableRequest,
			HttpServletRequest request) {
		return ExampleData.filterStudents(tableRequest);
	}

	@Override
	public int getITotalRecords() {
		return itotalRecords;
	}

	@Override
	public int getITotalDisplayRecords() {
		return iTotalDisplay;
	}

}
