package nl.pafr.object_pool;

import java.sql.*;

public class JDBCConnectionPool extends ObjectPool<Connection> {

	  private String dsn, usr, pwd;

	public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
	    super();
	    try {
	      Class.forName(driver);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    this.dsn = dsn;
	    this.usr = usr;
	    this.pwd = pwd;
	  }

	  @Override
	  protected Connection create() {
	    try {
	      return (DriverManager.getConnection(dsn, usr, pwd));
	    } catch (SQLException e) {
	      e.printStackTrace();
	      return (null);
	    }
	  }

	  @Override
	  public void expire(Connection o) {
	    try {
	      ((Connection) o).close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }

	  @Override
	  public boolean validate(Connection o) {
	    try {
	      return (!((Connection) o).isClosed());
	    } catch (SQLException e) {
	      e.printStackTrace();
	      return (false);
	    }
	  }
	}
