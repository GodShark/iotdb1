package cn.edu.thu.tsfiledb.jdbc;

public class TsfileConfig {
	/**
	 * The required prefix for the connection URL.
	 */
	public static final String TSFILE_URL_PREFIX = "jdbc:tsfile://";

	public static final String TSFILE_DEFAULT_HOST = "localhost";
	/**
	 * If host is provided, without a port.
	 */
	public static final int TSFILE_DEFAULT_PORT = 8888;

	/**
	 * tsfile's default series name
	 */
	public static final String DEFAULT_SERIES_NAME = "default";

	public static final String URI_JDBC_PREFIX = "jdbc:";

	public static final String URI_TSFILE_PREFIX = "tsfile:";
	
	public static final int DEFAULT_FETCH_SIZE = 1000;
	
	public static final String AUTH_USER = "user";
	public static final String DEFAULT_USER = "user";
	
	public static final String AUTH_PASSWORD = "password";
	public static final String DEFALUT_PASSWORD = "password";
}
