package user.dao;

import java.io.IOException;
import java.sql.SQLException;

import user.bean.User;

public interface Records {

	String saveRecords(User u) throws IOException, SQLException;

	User retriveRecords(String acNumber) throws IOException, SQLException;

}
