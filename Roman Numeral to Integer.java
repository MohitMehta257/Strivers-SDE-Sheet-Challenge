int n = s.length();
        int nums[] = new int[n];
        
        for(int i=0;i<n;i++) {
            switch(s.charAt(i)) {
                case 'M': nums[i] = 1000;
                          break;
                case 'D': nums[i] = 500;
                          break;
                case 'C': nums[i] = 100;
                          break;
                case 'L': nums[i] = 50;
                          break;
                case 'X': nums[i] = 10;
                          break;
                case 'V': nums[i] = 5;
                          break;
                case 'I': nums[i] = 1;
                          break;
            }
        }
        
        int sum=0;
        for(int i=0;i<n-1;i++) {
            if(nums[i+1] > nums[i])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        sum += nums[n-1];
        
        return sum;
