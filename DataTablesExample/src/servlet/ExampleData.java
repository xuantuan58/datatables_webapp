package servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.datatables.wrapper.AjaxRequest;

import model.Student;
import model.StudentAccount;

/**
 * This class only gives example data
 * @author xuantuan.bui
 *
 */
public class ExampleData {
	public static List<Student> filterStudents(AjaxRequest tableReq) {

		List<Student> students = getAllStudents();

		List<Student> tmpStudents = new ArrayList<>();
		for (int i = tableReq.iDisplayStart; i < students.size()
				&& i <= tableReq.iDisplayStart + tableReq.iDisplayLength; i++) {
			tmpStudents.add(students.get(i));
		}

		return tmpStudents;
	}

	public static List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "tu3an", 30, "120070903", "qNo Trang Long1"));
		students.add(new Student(2, "tua4n", 31, "210070902", "Nqo Trang Lon3"));
		students.add(new Student(3, "1tuan", 32, "201070901", "Noq Trang Lon4"));
		students.add(new Student(4, "t2uan", 33, "200170904", "No qTrang Lon5"));
		students.add(new Student(5, "tu3an", 34, "200710905", "No Tqrang Lon6"));
		students.add(new Student(6, "tua4n", 35, "200701906", "No Trqang Lon7"));
		students.add(new Student(7, "tuan5", 36, "200709107", "No Traqng Lon8"));
		students.add(new Student(8, "tu6an", 36, "200709017", "No Tranqg Lon8"));
		students.add(new Student(9, "tu7an", 36, "520070907", "No Trangq Lon8"));
		students.add(new Student(10, "tu8an", 36, "520070907", "No Trangq Lon8"));
		students.add(new Student(11, "tu9an", 30, "250070903","No Trang qLong1"));
		students.add(new Student(12, "tu0an", 31, "205070902", "No Trang Lqon3"));
		students.add(new Student(13, "11tuan", 32, "205070901","No Trang Lqon4"));
		students.add(new Student(14, "tu12an", 33, "200570904","No Trang Loqn5"));
		students.add(new Student(15, "tuan13", 34, "200750905","No Trang Lonq6"));
		students.add(new Student(16, "qtuan", 35, "200709506", "No Trang Lon7"));
		students.add(new Student(17, "twuan", 36, "200709057", "tNo Trang Lon8"));
		students.add(new Student(18, "tuean", 36, "200709075", "Nto Trang Lon8"));
		students.add(new Student(19, "tuarn", 36, "820070907", "Not Trang Lon8"));
		students.add(new Student(20, "tuant", 36, "280070907", "No tTrang Lon8"));
		students.add(new Student(21, "etuan", 30, "208070903","No Ttrang Long1"));
		students.add(new Student(22, "teuan", 31, "200870902", "No Trtang Lon3"));
		students.add(new Student(23, "tuean", 32, "200780901", "No Tratng Lon4"));
		students.add(new Student(24, "tuaen", 33, "200708904", "No Trantg Lon5"));
		students.add(new Student(25, "tuane", 34, "200709805", "No Trangt Lon6"));
		students.add(new Student(26, "rtuan", 35, "200709086", "No Trang tLon7"));
		students.add(new Student(27, "ttuan", 36, "920070907", "No Trang Lton8"));
		students.add(new Student(28, "tuyan", 36, "290070907", "No Trang Lotn8"));
		students.add(new Student(29, "tuaun", 36, "209070907", "No Trang Lont8"));
		students.add(new Student(30, "tuani", 36, "200970907", "nNo Trang Lon8"));
		students.add(new Student(31, "ytuan", 30, "200790903","Nno Trang Long1"));
		students.add(new Student(32, "tyuan", 31, "200709902", "Non Trang Lon3"));
		students.add(new Student(33, "tuyan", 32, "200709901", "No nTrang Lon4"));
		students.add(new Student(34, "tuayn", 33, "200709094", "No Tnrang Lon5"));
		students.add(new Student(35, "tuany", 34, "200709059", "No Trnang Lon6"));
		students.add(new Student(36, "tpuan", 35, "620070906", "No Tranng Lon7"));
		students.add(new Student(37, "tupan", 36, "260070907", "No Tranng Lon8"));
		students.add(new Student(38, "tuapn", 36, "206070907", "No Trangn Lon8"));
		students.add(new Student(39, "tuanp", 36, "200670907", "No Trang nLon8"));
		students.add(new Student(40, "tuaxn", 36, "200760907", "No Trang Lnon8"));
		students.add(new Student(41, "ytuan", 30, "200790903","Nno Trang Long1"));
		students.add(new Student(42, "tyuan", 31, "200709902", "Non Trang Lon3"));
		students.add(new Student(43, "tuyan", 32, "200709901", "No nTrang Lon4"));
		students.add(new Student(44, "tuayn", 33, "200709094", "No Tnrang Lon5"));
		students.add(new Student(45, "tuany", 34, "200709059", "No Trnang Lon6"));
		students.add(new Student(46, "tpuan", 35, "620070906", "No Tranng Lon7"));
		students.add(new Student(47, "tupan", 36, "260070907", "No Tranng Lon8"));
		students.add(new Student(48, "tuapn", 36, "206070907", "No Trangn Lon8"));
		students.add(new Student(49, "tuanp", 36, "200670907", "No Trang nLon8"));
		students.add(new Student(50, "tuaxn", 36, "200760907", "No Trang Lnon8"));
		students.add(new Student(51, "ytuan", 30, "200790903","Nno Trang Long1"));
		students.add(new Student(52, "tyuan", 31, "200709902", "Non Trang Lon3"));
		students.add(new Student(53, "tuyan", 32, "200709901", "No nTrang Lon4"));
		students.add(new Student(54, "tuayn", 33, "200709094", "No Tnrang Lon5"));
		students.add(new Student(55, "tuany", 34, "200709059", "No Trnang Lon6"));
		students.add(new Student(56, "tpuan", 35, "620070906", "No Tranng Lon7"));
		students.add(new Student(57, "tupan", 36, "260070907", "No Tranng Lon8"));
		students.add(new Student(58, "tuapn", 36, "206070907", "No Trangn Lon8"));
		students.add(new Student(59, "tuanp", 36, "200670907", "No Trang nLon8"));
		students.add(new Student(60, "tuaxn", 36, "200760907", "No Trang Lnon8"));
		return students;
	}

	public static List<StudentAccount> getAllStudentsAcc() {
		List<StudentAccount> accList = new ArrayList<StudentAccount>();
		accList.add(new StudentAccount(1, "qtuan", "a1234456789", new Date(), new Date()));
		accList.add(new StudentAccount(2, "tquan", "1a23456789", new Date(), new Date()));
		accList.add(new StudentAccount(3, "tuqan", "12aa3456789", new Date(), new Date()));
		accList.add(new StudentAccount(4, "tuaqn", "1234a56789", new Date(), new Date()));
		accList.add(new StudentAccount(5, "wtuan", "12345a6789", new Date(), new Date()));
		accList.add(new StudentAccount(6, "twuan", "123456a789", new Date(), new Date()));
		accList.add(new StudentAccount(7, "tuwan", "1234567a89", new Date(), new Date()));
		accList.add(new StudentAccount(8, "tuawn", "12345678a9", new Date(), new Date()));
		accList.add(new StudentAccount(9, "tuanw", "t123456789", new Date(), new Date()));
		accList.add(new StudentAccount(10, "etuan", "t123456789", new Date(), new Date()));
		accList.add(new StudentAccount(11, "teuan", "1t23456789", new Date(), new Date()));
		accList.add(new StudentAccount(12, "tuean", "12t3456789", new Date(), new Date()));
		accList.add(new StudentAccount(13, "tuaen", "123t456789", new Date(), new Date()));
		accList.add(new StudentAccount(14, "tuane", "1234t56789", new Date(), new Date()));
		accList.add(new StudentAccount(15, "rtuan", "12345t6789", new Date(), new Date()));
		accList.add(new StudentAccount(16, "truan", "123456t789", new Date(), new Date()));
		accList.add(new StudentAccount(17, "turan", "1234567t89", new Date(), new Date()));
		return accList;
	}
}
