class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    arr[k]=arr1[j];
                    k++;
                }
            }
        }
        List<Integer> l1=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
                
            }
            if(count==0){
                l1.add(arr1[i]);
            }
        }

        Collections.sort(l1);
        int l=0;
        for(int i=arr1.length-l1.size();i<arr1.length;i++){
            arr[i]=l1.get(l++);
        }
        System.out.print(l1);
        return arr;
    }
}