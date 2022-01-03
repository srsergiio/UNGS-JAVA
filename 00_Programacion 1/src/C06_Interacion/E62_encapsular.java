package C06_Interacion;

public class E62_encapsular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(ParentesisPares("((3 + 7) * 2)"));
		
	}
	
	public static int ParentesisPares(String s) {
		int largo = s.length ();
		int i = 0;
		int cont = 0;
		while (i < largo) {
			char c = s.charAt(i);
		if (c == '(') {
			cont = cont + 1;
			}else if (c == ')') {
				cont = cont - 1;
				}
			i = i + 1;
		}
		return cont;
		
	}
	
	public static void print(Object s) {
		System.out.println(s);
	}
}
