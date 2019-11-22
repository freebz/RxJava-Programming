// 코드 6-35 Contributor 클래스(Contributor.java)

public class Contributor {
    String login;
    String url;
    int id;

    @Override
    public String toString() {
	return "login : " + login + "id : " + id + "url : " + url;
    }
}
