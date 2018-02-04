package try_demo.com.anye;

import java.sql.Connection;
import java.sql.PreparedStatement;

import try_demo.com.anye.vo.DBUtils;

/**
 * 测试类
 * @author Tryin4Sage
 * @date  2018年2月3日 下午11:18:06
 */
public class Text {
	public static void main(String[] args) {
		try {
			Connection conn = DBUtils.getConnection();
			System.out.println(conn);
			//String sql = "insert into student values(8,'杨幂',99,99,99)";
			String sql = "select * from student";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
