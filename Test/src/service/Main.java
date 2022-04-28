package service;

public class Main {
	public static String msg(String _msg) {
		String res = "";
		try {
			res = _msg;
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(msg("This is test"));
	}
}
