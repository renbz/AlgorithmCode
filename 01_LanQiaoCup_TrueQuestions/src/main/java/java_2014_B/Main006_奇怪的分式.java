package java_2014_B;
public class Main006_奇怪的分式{
	public static void main(String[] args) {
		int count=0;
		for(int i1=1;i1<=9;i1++)
			for(int i2=1;i2<=9;i2++)
				for(int i3=1;i3<=9;i3++)
					for(int i4=1;i4<=9;i4++){
						if(i1!=i2 && i3!=i4){
							int lu = i1*i3;
							int ld = i2*i4;
							int ru = i1*10+i3;
							int rd = i2*10+i4;
							if(lu*rd==ld*ru) count++;
						}
					}
		System.out.println(count);
	}
}