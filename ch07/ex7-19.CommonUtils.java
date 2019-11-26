// 코드 7-19 CommonUtils.isNetworkAvailable() 구현(common/CommonUtils.java - isNetworkAvailable())

public static boolean isNetworkAvailable() {
    try {
	return InetAddress.getByName("www.google.com").isReachable(1000);
    } catch (IOException e) {
	e.printStackTrace();
    }
    return false;
}
