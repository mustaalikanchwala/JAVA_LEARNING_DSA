if(i==0) {
       return true ;
        } 
        if(arr[i]<arr[i-1]){
            return Sorting(arr,i-1);
        }else{
            return false;
        }  