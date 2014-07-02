package FindInsertion;

public class FindInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int searchInsert(int[] A, int target) {
        if( A== null) return 0 ;
        
        int length = A.length ;
        
        if( length == 1 )
        {
            if(A[0] < target) 
                return 1;
            return 0 ;
        }
        else
        //if(length >= 2)
        {
          int pre, post ;
          pre = 0;  
          post = 1;
          while( post < length )
          {
              if(A[pre] > target) 
                { return pre ; }
              else 
                if( A[pre] < target && A[post] > target )
                {return post ;}
                else
                  {
                      post++;
                      pre++;
                  };
          };
          return post ;
        }
    }
}
