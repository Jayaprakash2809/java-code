class VArArg {
    int sum =0;
    int add(int... a)
    {
        for (int i:a){
            sum=sum+i;
        }
        return sum;
    }
}
