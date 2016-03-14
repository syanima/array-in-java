public class Array{
	public Array(){

	}
	public int[] add(int[] array1,int[] array2){
		int[] result = new int[array1.length];
		for(int i = 0;i<array1.length;i++){
			System.out.println(array1[i]);
			result[i]=array1[i]+array2[i];
		}
		return result;
	}
}