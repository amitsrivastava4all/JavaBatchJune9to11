class A
{
	
}
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj);
		String products[]={"Apple Mobile","Samsung Mobile"};
		String song = "Bang Bang";  // String Literal 
		String song2 = new String("It's My Life");  // New Object
		String songs[]={"Bang Bang","Boom Boom","It's My Life"};
		/*for(int i = 0; i<songs.length; i++){
			System.out.println(songs[i]);
		}*/
		// Enhance For Loop (Array Traverse) Java 5
		for(String s : songs){
			System.out.println(s);
		}
		int x=10;
		int []y = {10,20,30,40,50};
		System.out.println(y);
		int z[] = {10,20,30};
		int m[] = new int[5];
		int n[] = new int[]{10,20,30};
		
		int b[][]= new int[3][3];
		int bb[][] = {{65,66,67},{97,98,99,100,101,102},{120,121}};
		//int []bb[]= new int[3][];
		//bb[0] = new int[10];
		//bb[1] = new int[20];
		//bb[2] = new int [30];
		
		for(int t[] : bb){
			for(int v : t){
				System.out.print((char)v +" ");
			}
			System.out.println();
		}
		
		/*for(int i = 0 ; i<bb.length; i++){
			for(int j = 0;j<bb[i].length; j++){
				System.out.print(bb[i][j]+ " ");
			}
			System.out.println();
		}*/
		int c[][][]=new int[3][4][5];
		
		

	}

}
