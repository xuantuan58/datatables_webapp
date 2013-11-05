package servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.datatables.wrapper.AjaxRequest;
import net.datatables.wrapper.IDataHandler;

import model.StudentAccount;

public class StudentAccDataHandler implements IDataHandler<StudentAccount> {

	@Override
	public int getITotalDisplayRecords() {
		return 0;
	}

	@Override
	public int getITotalRecords() {
		return 0;
	}

	@Override
	public List<StudentAccount> getListData(AjaxRequest arg0, HttpServletRequest arg1) {
		return ExampleData.getAllStudentsAcc();
	}

}
